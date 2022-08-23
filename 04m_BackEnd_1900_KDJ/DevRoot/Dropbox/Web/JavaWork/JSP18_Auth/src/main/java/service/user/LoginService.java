package service.user;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import common.C;
import domain.UserDAO;
import domain.UserDTO;
import service.Service;
import sqlmapper.SqlSessionManager;

public class LoginService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //입력한 값을 받아오기
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String conPath = request.getContextPath();
       
        // ※ 파라미터 유효성 검증 필요(생략)
        username = username.trim(); 
        password = password.trim();
        
        UserDTO dto = new UserDTO();
        
        // 회원가입도 대문자로 저장되기 때문에 대문자로 비교
        dto.setUsername(username.toUpperCase());
        
		SqlSession sqlSession = null;
		UserDAO dao = null;		
		
		try {
			sqlSession = SqlSessionManager.getInstance().openSession();
			dao = sqlSession.getMapper(UserDAO.class);
			
			// 존재하지 않는 아이디(username)인 경우
			List<UserDTO> list = dao.selectByUsername(dto);
			if (list.size() == 0) {
				C.addRedirectAttribute(request, "error", "존재하지 않는 아이디(username)");
				C.addRedirectAttribute(request, "username", username);
				response.sendRedirect(conPath + "/user/login");
				return;
			}
			
			// 패스워드가 다른 경우
			dto = list.get(0);
			if(!dto.getPassword().equals(password)) {
				C.addRedirectAttribute(request, "error", "비밀번호가 다릅니다");
				C.addRedirectAttribute(request, "username", username);
				response.sendRedirect(conPath + "/user/login");
				return;
			}
			
			// 로그인 진행
			HttpSession session = request.getSession();
			session.setAttribute(C.PRINCIPAL, dto);
			
			sqlSession.commit();
		} catch (SQLException e) {  
			e.printStackTrace();
		} finally {
			if(sqlSession!= null) sqlSession.close();
		}



	}

}
