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
		String price = request.getParameter("price");
		String title = request.getParameter("title");
		String summary = request.getParameter("summary");
		// TODO parameter 검증
			
		// 위 값들을 DTO에 담기
		WriteDTO dto = new WriteDTO();
		dto.setPrice(price);
		dto.setTitle(title);
		dto.setSummary(summary);
		
		
		int cnt = 0;
		
		// 트랜잭션을 위한 객체
		SqlSession sqlSession = null;
		WriteDAO dao = null;
		
		try {
			sqlSession = SqlSessionManager.getInstance().openSession();
			dao = sqlSession.getMapper(WriteDAO.class); //MyBatis가 생성한 DAO
			cnt = dao.insert(dto);
			System.out.println("책 업로드 성공" + cnt + " : " + dto.getId());
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
