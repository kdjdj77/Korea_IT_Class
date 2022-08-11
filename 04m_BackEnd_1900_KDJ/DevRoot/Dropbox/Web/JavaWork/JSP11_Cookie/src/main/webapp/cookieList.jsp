<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Cookie 리스트</title>
</head>
<body>
<%
	// request 안에 담겨 있는 Cookie를 추출
	Cookie[] cookies = request.getCookies(); //Cookie[] 리턴
	// 쿠키가 없으면 null 리턴
	if (cookies != null) {
		for(int i = 0; i < cookies.length; i++) {
			String name = cookies[i].getName();
			String value = cookies[i].getValue();
			out.println((i + 1) + "] " + name + " : " + value + "<br>");
		}
	} 
	else {
		out.println("쿠키가 없습니다<br>");
	}
%>
	<br>
	<form action="cookieCreate.jsp" method="get">
	<input type="submit" value="쿠키생성&갱신">
	</form>
	
	<br>
	<form action="cookieDelete.jsp" method="get">
	<input type="submit" value="쿠키삭제">
	</form>

</body>
</html>