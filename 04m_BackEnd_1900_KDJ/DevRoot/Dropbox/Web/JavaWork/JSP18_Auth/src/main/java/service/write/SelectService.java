package service.write;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import common.C;
import domain.UserDTO;
import domain.WriteDAO;
import domain.WriteDTO;
import service.Service;
import sqlmapper.SqlSessionManager;

public class SelectService implements Service {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException{
	
		int id = Integer.parseInt(request.getParameter("id"));
		// *이 단계에서 parameter 검증해야 한다
		
		SqlSession sqlSession = null;
		WriteDAO dao = null;		
		
		List<WriteDTO> list = null;
		
		try {
			sqlSession = SqlSessionManager.getInstance().openSession();
			dao = sqlSession.getMapper(WriteDAO.class);
			
			//읽기 only
			list = dao.selectById(id);
			
			//로그인한 사용자가 아니면 여기서 redirect해야 한다
			UserDTO loggedUser = (UserDTO)request.getSession().getAttribute(C.PRINCIPAL);
			UserDTO writeUser = list.get(0).getUser();
			if(loggedUser.getId() != writeUser.getId()) {
				response.sendRedirect(request.getContextPath() + "/user/rejectAuth");
				return;
			}
			
			request.setAttribute("list", list);
			
			sqlSession.commit();
		} catch (SQLException e) {  
			e.printStackTrace();
		} finally {
			if(sqlSession!= null) sqlSession.close();
		}
	}
}
