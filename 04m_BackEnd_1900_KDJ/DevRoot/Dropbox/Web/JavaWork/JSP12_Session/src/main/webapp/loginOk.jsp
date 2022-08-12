<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	// 예제용 로그인 아이디, 비번 세팅
	public static final String ADMIN_ID = "admin";
	public static final String ADMIN_PW = "1234";
%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	
	// 세션 name-value 
	String sessionName = "userid";
	String sessionValue = id; 
	
	// 제출된 id /pw 값이 일치하면 로그인 성공 + 세션 attr 생성
	if(ADMIN_ID.equalsIgnoreCase(id) && ADMIN_PW.equals(pw)){
		out.println("<script>");
		out.println("alert('로그인 성공');");
		out.println("</script>");
		// 세션 attr 생성
		session.setAttribute(sessionName, sessionValue);
	} else {
		out.println("<script>");
		out.println("alert('로그인 실패');");
		out.println("</script>");
		// 혹시 세션 있었으면 삭제
		session.removeAttribute(sessionName);
	}

%>

<script>
location.href = "login.jsp";
</script>
