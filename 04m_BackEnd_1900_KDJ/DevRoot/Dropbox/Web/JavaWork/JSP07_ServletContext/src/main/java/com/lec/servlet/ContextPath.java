package com.lec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConPath")
public class ContextPath extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ContextPath() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//URL : Uniform Resource Locator 통합파일식별자
		StringBuffer url = request.getRequestURL();
		
		//URI : Uniform Resource Identifier 통합자원식별자
		String uri = request.getRequestURI();
		
		//ContextPath
		String conPath = request.getContextPath();
		
		//domain 추출
		String url_domain = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
		
		//물리적인 Servlet constext 객체(context path가 아니다)
		ServletContext context = request.getServletContext();
		String servletContextName = context.getServletContextName();
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
	
		out.println("URL : " + url + "<br>");
		out.println("URI: " + uri + "<br>");
		out.println("ContextPath: " + conPath + "<br>");
		out.println("URL_domain: " + url_domain + "<br>");
		out.println("Servlet ContextName: " + servletContextName + "<br>");
		
		out.flush();
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
