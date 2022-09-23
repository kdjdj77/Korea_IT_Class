<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>title</title>
</head>
<body>
	<h2>title.jsp - /aaa/bbb</h2>
	${first} - ${second}<br>
	<img src="img/face01.png"><br>
	<img src="../img/face01.png"><br>
	<img src="${pageContext.request.contextPath}/img/face01.png"><br>
	
	<img src="face02.png"><br>
</body>
</html>