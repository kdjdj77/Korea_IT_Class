<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>성인용 페이지</title>
</head>
<body>
<%
	String str = request.getParameter("age");
	int age = Integer.parseInt(str);
%>
	당신은 <%= age %>세 입니다
	당신은 성인입니다. 이 사이트를 이용하실 수 있습니다 <br>
	
	<a href="input_age.html">처음으로</a>
</body>
</html>