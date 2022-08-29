package service.comment;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import domain.CommentDAO;
import domain.CommentDTO;
import domain.QryCommentList;
import service.Service;
import sqlmapper.SqlSessionManager;

public class CmtListService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int id = Integer.parseInt(request.getParameter("id")); // 글의 id
		
		QryCommentList obj = new QryCommentList();// response할 Java 객체
		ObjectMapper mapper = new ObjectMapper(); // Json으로 매핑할 Mapper 객체
		
		SqlSession sqlSession = null;
		CommentDAO dao = null;		
		
		try {
			sqlSession = SqlSessionManager.getInstance().openSession();
			dao = sqlSession.getMapper(CommentDAO.class);
			
			List<CommentDTO> list = dao.selectByWrite(id);
			obj.setList(list);
			obj.setCount(list.size());
			obj.setStatus("OK");
			
			sqlSession.commit();
		} catch (SQLException e) {  
			e.printStackTrace();
			obj.setStatus("댓글목록 ERROR : " + e.getMessage());
		} finally {
			if(sqlSession!= null) sqlSession.close();
		}



		
		//String output = mapper.writeValueAsString(obj); // formatting x
		String output = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj); //formatting o
		//System.out.println(output);
		response.setContentType("application/json; charset=utf-8");
		response.getWriter().write(output); //response 에 내보내기
	}

}
