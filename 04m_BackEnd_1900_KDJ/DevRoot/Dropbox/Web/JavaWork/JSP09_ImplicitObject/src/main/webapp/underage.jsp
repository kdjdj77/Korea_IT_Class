<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>미성년자 페이지</title>
</head>
<body>
<%
	String str = request.getParameter("age");
	int age = Integer.parseInt(str);
%>
	당신은 <%= age %>세 입니다
	당신은 미성년입니다. 이 사이트를 이용하실 수 없습니다 <br>
	<%= (19 - age) %>년 뒤에 사용 가능합니다.
	<a href="input_age.html">처음으로</a>
</body>
</html>