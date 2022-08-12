<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Enumeration"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Session List</title>
</head>
<body>
<%
	// jsp 에선 session 내부 객체 사용
	// ※ 서블릿 에서는 request.getSession() 으로 Session 객체 얻어올수 있다.

	// session 안에 있는 'userid' 란 name 값을 꺼냄 (없으면 null)
	// 리턴값은 Object 다.   
	// session 값은 어떠한 타입도 가능
	out.println(session.getAttribute("userid"));

	session.setAttribute("age", 20);
	out.println(session.getAttribute("age"));
	out.println("<br>");
	
	
	String sessionName, sessionValue;
	// 세션에 담겨 있는 '모든' attribute names 들 봅아내기
	Enumeration<String> enumration =  session.getAttributeNames();
	
	int i = 0;
	while(enumration.hasMoreElements()){
		sessionName = enumration.nextElement();
		sessionValue = session.getAttribute(sessionName).toString();
		out.println((i + 1) + "] " + sessionName + " : " + sessionValue + "<br>");
		i++;
	}
	if(i == 0){
		out.println("세션안에 attribute 가 없습니다<br>");
	}
	
%>
<br>
<form action="sessionCreate.jsp" method="get">
<input type="submit" value="세션 attr 생성">
</form>

<br>
<form action="sessionDelete.jsp" method="get">
<input type="submit" value="세션 attr 삭제">
</form>

<br>


</body>
</html>
