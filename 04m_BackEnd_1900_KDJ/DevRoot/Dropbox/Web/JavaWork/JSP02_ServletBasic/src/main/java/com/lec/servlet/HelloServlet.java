package com.lec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello/Serv")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    // ↓ GET 방식 request가 오면 동작
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("안녕하세요 첫번째 Servlet 입니다");
		
		// 서블릿으로 HTML 문서 response 맛보기
		// 1. content type(MIME TYPE) 설정 
		//(★주의★ PrintWriter 뽑기 전에 설정해야 합니다)
		response.setContentType("text/html;charset=utf-8");
		
		// 2. PrintWriter 객체생성 <-- response 객체로부터
		PrintWriter out = response.getWriter();
		
		// 3. PrintWriter 객체로 HTML 스트림에 쓰기
		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>서블릿 response</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>HTML 문서 response</h2>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}
	
    // ↓ POST 방식 request가 오면 동작
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
