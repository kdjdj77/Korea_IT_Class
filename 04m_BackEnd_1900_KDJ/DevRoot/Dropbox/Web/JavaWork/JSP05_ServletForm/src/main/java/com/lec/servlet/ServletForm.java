package com.lec.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletForm
 */
@WebServlet("/FormOk")
public class ServletForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletForm() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//POST 방식으로 넘어오는 한글데이터 인코딩 세팅
		request.setCharacterEncoding("utf-8");
		
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String [] hobbys = request.getParameterValues("hobby");
		String gender = request.getParameter("gender");
		String local = request.getParameter("local");
		String memo = request.getParameter("memo");
		
		response.setContentType("Text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("hidden : " + data1 + ", " + data2 + "<br>");
		out.println("이름 : " + name + "<br>");
		out.println("아이디 :" + id + "<br>");
		out.println("비밀번호 :" + pw + "<br>");
		out.println("취미 : " + Arrays.toString(hobbys) + "<br>");
		out.println("성별 :" + gender + "<br>");
		out.println("지역 :" + local + "<br>");
		out.println("메모 :" + memo + "<br>");


		out.flush();
		out.close();
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
