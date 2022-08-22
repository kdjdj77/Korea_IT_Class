package service.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import domain.WriteDAO;
import domain.WriteDTO;
import service.Service;
import sqlmapper.SqlSessionManager;

public class UpdateService implements Service {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//입력합 값 (parameter) 받아오기
		int id = Integer.parseInt(request.getParameter("id"));
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		// *이 단계에서 parameter 검증해야 한다
		
		SqlSession sqlSession = null;
		WriteDAO dao = null;
		
		int cnt = 0;
		
//		WriteDTO dto = new WriteDTO();
//		dto.setId(id);
//		dto.setSubject(subject);
//		dto.setContent(content);
		
		//builder 사용한 생성
		WriteDTO dto = WriteDTO.builder()
			.id(id)
			.subject(subject)
			.content(content)
			.build()
			;
		
		try {
			sqlSession = SqlSessionManager.getInstance().openSession();
			dao = sqlSession.getMapper(WriteDAO.class);
			
			cnt = dao.update(dto);
			
			sqlSession.commit();
		} catch (SQLException e) {  
			e.printStackTrace();
		} finally {
			if(sqlSession!= null) sqlSession.close();
		}
		request.setAttribute("result", cnt);
		request.setAttribute("dto", dto); //id 값을 전달하기 위해
		
	}

}
