<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>forward</title>
</head>
<body>
	<p>현재 페이지는 forward 페이지 입니다..</p>
	<jsp:forward page="sub.jsp"/>
	<p>위 라인의 내용은 sub 페이지의 내용입니다</p>
</body>
</html>