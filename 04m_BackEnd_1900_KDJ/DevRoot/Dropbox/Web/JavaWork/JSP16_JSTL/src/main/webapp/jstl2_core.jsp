<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>JSTL Core</title>
</head>
<body>
	<h2>set, remove, out</h2>
	이름 : <c:out value="jang"/><br>
	<c:set var="name" value="홍길동"/>
<%-- JSTL의 변수는 EL에서 사용가능 --%>
	이름 : <c:out value="${name }"/><br>
<%-- set은 page의 attribute로 저장됨 --%>
	이름 : ${pageScope.name}<br>
	
	<c:remove var="name"/>
	이름 : <c:out value="${name }"/><br>
	
	<hr>
	
	<%
		int age = 10;
	%>
	나이 : ${age }<br>
	<c:set var="age" value="<%= age %>"/>
	나이 : ${age }<br>
	
	<hr>
	<h2>catch</h2>
	<%-- c:catch 태그 안에서 예외 발생하면 예외 처리 
	발생한 예외는 error 변수에 담는다--%>
	<c:catch var="error">
		<%= 2/0 %>
	</c:catch>
	<c:out value="${error }"/>
	
	<br>
	<c:catch var="ex">
		name parameter 값 = <%= request.getParameter("name") %><br>
		<% if (request.getParameter("name").equals("test")) { %>
				${param.name}은 test 입니다
		<% } %>
	</c:catch>
	<c:if test="${ex != null }">
		예외발생<br>
		${ex }
	</c:if>
</body>
</html>