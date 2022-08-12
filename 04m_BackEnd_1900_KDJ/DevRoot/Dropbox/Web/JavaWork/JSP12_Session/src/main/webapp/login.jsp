<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>login 페이지</title>
</head>
<body>
<%
	// 현재 로그인 상태인지 확인.  로그인 세션 (name 이 'userid' 인 세션값) 이 존재하는지 확인
	if(session.getAttribute("userid") != null){ 
%>
		<h2>로그인 상태입니다 </h2>
		<p><%=session.getAttribute("userid") %> 님 환영합니다</p>
		<form action="logout.jsp">
			<input type="submit" value="로그아웃"><br>
		</form>
<%
	} else {
		// 로그인 상태가 아니라면
%>
		<h2>로그인 상태가 아닙니다</h2>
		<form action="loginOk.jsp">
			id: <input type="text" name="id"><br>
			pw: <input type="password" name="pw"><br>
			<input type="submit" value="로그인"><br>
		</form>	
<%
	}
%>

</body>
</html>