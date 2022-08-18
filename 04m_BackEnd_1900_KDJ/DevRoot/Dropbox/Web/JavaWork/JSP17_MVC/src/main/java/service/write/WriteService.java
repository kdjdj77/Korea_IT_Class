package service.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import domain.WriteDAO;
import domain.WriteDTO;
import service.Service;
import sqlmapper.SqlSessionManager;

public class WriteService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 입력한 값을 받아오기
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		// *이 단계에서 parameter 검증해야 한다
		
		// DB
		WriteDTO dto = new WriteDTO();
		dto.setName(name);
		dto.setSubject(subject);
		dto.setContent(content);
		
		int cnt = 0;
		
		SqlSession sqlSession = null;
		WriteDAO dao = null;
		try {
			sqlSession = SqlSessionManager.getInstance().openSession();
			dao = sqlSession.getMapper(WriteDAO.class); //MyBatis가 생성한 DAO
			cnt = dao.insert(dto);
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
