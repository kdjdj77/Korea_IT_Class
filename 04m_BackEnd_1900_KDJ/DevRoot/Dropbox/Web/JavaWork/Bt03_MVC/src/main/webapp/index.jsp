<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- JSTL core --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h1>Hello jsp</h1>
	${10 + 2}<br>
	이름 : <c:out value="jang"/><br>
	<h2>index.jsp</h2>
</body>
</html>