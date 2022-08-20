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
		String title = request.getParameter("title");
		String price = request.getParameter("price");
		String summary = request.getParameter("summary");
		// TODO parameter 검증
		
		SqlSession sqlSession = null;
		WriteDAO dao = null;
		
		int cnt = 0;
		
		//builder 사용한 생성
		WriteDTO dto = WriteDTO.builder()
			.id(id)
			.title(title)
			.price(price)
			.summary(summary)
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
