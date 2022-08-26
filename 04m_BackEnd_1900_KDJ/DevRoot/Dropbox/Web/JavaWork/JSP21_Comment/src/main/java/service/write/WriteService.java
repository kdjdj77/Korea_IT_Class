package service.write;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FileRenamePolicy;

import common.C;
import domain.FileDAO;
import domain.UserDTO;
import domain.WriteDAO;
import domain.WriteDTO;
import service.Service;
import sqlmapper.SqlSessionManager;

public class WriteService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//---------------------------------------------
		// 1. MultipartRequest 생성 -> 파일 업로드 됨  
		ServletContext context = request.getServletContext();
		//서블릿 상의 upload 폴더 경로를 알아온다
		String saveDirectory = context.getRealPath("upload");
		System.out.println("업로드 경로 : " + saveDirectory);

		int maxPostSize = 5 * 1024 * 1024;	//POST 받기, 최대 5MB
		String encoding = "utf-8";			//response 인코딩
		//업로딩 파일 이름 중복처리에 대한 정책
		FileRenamePolicy policy = new DefaultFileRenamePolicy();
		MultipartRequest multi = null;
		
		//MultipartRequest 생성단계에서 이미 파일 저장됨
		multi = new MultipartRequest(
			request, 
			saveDirectory,	//저장경로
			maxPostSize,	//최대 용량
			encoding,		//인코딩
			policy			//이름중복정책
			);
		
		//---------------------------------------------
		// 2. 업로드된 파일의   '원본이름(들)' 과 '저장된 이름(들)' 받아오기

		// ↓ 각각의 첨부파일의 원본이름 + 저장된 이름을 Map으로 담고,
		//   이 Map<> 들을 저장할 List 준비
		List<Map<String, Object>> nameList = new ArrayList<>();  

		//type="file" 요소들의 name들 추출
		Enumeration names = multi.getFileNames();
		while (names.hasMoreElements()) {
			String name = (String)names.nextElement();
			if (name.startsWith("upfile")) { //name="upfile##" 인 경우만 첨부파일로 다룸
				//원본이름
				String originalFileName = multi.getOriginalFileName(name);
				//저장된(rename)된 이름
				String fileSystemName = multi.getFilesystemName(name);
				System.out.println("첨부파일(" + name + "): " + originalFileName + "->" + fileSystemName);

				if (originalFileName != null && fileSystemName != null) {
					// Map.of(k1, v1, k2, v2 ..) 로 Map 객체 생성   (Java9 에서 추가)
					nameList.add(Map.of("source", originalFileName, "file", fileSystemName));
				}
				
			}
		}
		//---------------------------------------------
		// 3. 게시글 및 첨부파일 -> DB 에 저장 
		// ★ request 에서가 아닌 MultipartRequest 객체로부터 가져와야 한다



		// 입력한 값을 받아오기
		String subject = multi.getParameter("subject");
		String content = multi.getParameter("content");
		// *이 단계에서 parameter 검증해야 한다
		
		// 현재 로그인 한 사용자 정보
		UserDTO user = (UserDTO)request.getSession().getAttribute(C.PRINCIPAL);
		
		// 위 값들을 DTO에 담기
		WriteDTO dto = new WriteDTO();
		dto.setUser(user);
		dto.setSubject(subject);
		dto.setContent(content);
		
		
		int cnt = 0;
		
		// 트랜잭션을 위한 객체
		SqlSession sqlSession = null;
		WriteDAO dao = null;
		FileDAO fileDao = null;
		
		try {
			sqlSession = SqlSessionManager.getInstance().openSession();
			dao = sqlSession.getMapper(WriteDAO.class); //MyBatis가 생성한 DAO
			fileDao = sqlSession.getMapper(FileDAO.class);
			
			cnt = dao.insert(dto);
			
			//첨부파일 정보 -> DB에 저장 (위에서 생성된 글의 id값을 FK로 전달)
			if(nameList != null && nameList.size() > 0) {              
				fileDao.insert(nameList, dto.getId());
            }
			
			System.out.println("글 작성 성공" + cnt + " : " + dto.getId());
			
			// 트랜잭션 커밋. commit이 실행되지 않으면, 아래 코드 실행
			sqlSession.commit();
		} catch (SQLException e) {
			e.printStackTrace();// 예외 발생 시 rollback
		} finally {
			if (sqlSession != null) sqlSession.close();
		}
		request.setAttribute("result", cnt);
		request.setAttribute("dto", dto); //auto-generated key(id)
	}
}
