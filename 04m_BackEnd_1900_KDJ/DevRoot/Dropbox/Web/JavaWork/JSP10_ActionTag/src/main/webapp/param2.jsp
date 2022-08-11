<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>param2</title>
</head>
<body>
	<p>현재 페이지는 param2 페이지 입니다</p>
<%
	int num = 788;
	String id = "홍길동";
%>
	<jsp:forward page="subParam.jsp">
		<jsp:param value='<%= URLEncoder.encode(id, "utf-8") %>' name="id"/>
		<jsp:param value="<%= num %>" name="pw"/>
	</jsp:forward>
	<p>위 라인의 내용은 subParam 페이지의 내용입니다</p>
</body>
</html>