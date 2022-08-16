<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<h3>Expression Language</h3>
	${10 }<br>
	${99.99 }<br>
	${"ABC" }<br>
	${true }<br>
	
	<hr>
	<h3>EL의 연산자</h3>
	${1 + 2 }<br>
	${1 - 2 }<br>
	${1 * 2 }<br>
	${1 / 2 }<br>
	${1 > 2 }<br>
	${1 < 2 }<br>
	${(1 > 2) ? 1 : 2 }<br>
	${(1 > 2) || (1 < 2) }<br>
	
	<hr>
	<%
		int num = 10;
	%>
	<%-- EL 은 Java 언어가 아니다  Java변수 그대로 표현은 안됨 --%>
	num: ${num }<br>
	num: <%= num %><br>
</body>
</html>