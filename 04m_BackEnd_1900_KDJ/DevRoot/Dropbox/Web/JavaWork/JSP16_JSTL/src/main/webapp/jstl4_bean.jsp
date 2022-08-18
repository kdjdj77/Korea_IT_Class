<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.lec.beans.*, java.util.*" %>    
<%-- Core --%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>JSTL & Beans</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>

<jsp:useBean id="p0" class="com.lec.beans.Person">
	<jsp:setProperty name="p0" property="name" value="홍길동"/>
	<jsp:setProperty name="p0" property="age" value="44"/>	
</jsp:useBean>

<body>
이름: ${p0.name }<br>  <%-- p0.getName() --%>
나이: ${p0.age }<br>
p0: ${p0 }<br>
<hr>
<%-- 빈(bean) 배열의 경우 --%>
<%
	Person p1 = new Person();
	p1.setName("고질라");
	p1.setAge(100);
	Person p2 = new Person();
	p2.setName("킹기도라");
	p2.setAge(200);
	Person p3 = new Person();
	p3.setName("모스라");
	p3.setAge(80);

	Person [] arr = {p1, p2, p3};
%>

<c:set var="dtoArr" value="<%= arr %>"/>

<table>
<tr><th>name</th><th>age</th><th>p</th></tr>
<c:forEach var="p" items="${dtoArr }">
	<tr>
		<td>${p.name }</td>  <%-- p.getName() 값 --%>
		<td>${p.age }</td>
		<td>${p }</td>
	</tr>
</c:forEach>
</table>

<hr>

<%-- 특정 id 의 bean 이 있는지 체크 --%>
<c:if test="${empty dto }">
	dto 는 없습니다<br>
</c:if>

<c:if test="${not empty dto }">
	dto 는 있습니다<br>
</c:if>

<c:if test="${dto == null }">  <%-- pageContext.getAttribute("dto") --%>
	dto 는 없습니다<br>
</c:if>

<%-- null 값 여부도 empty 로 체크 가능 --%>
<%
	Person park = null;
%>
<c:set var='v1' value="<%= park %>"/>
park: ${v1 }<br>

<c:if test="${empty v1 }">  <%-- null 값도 empty 다 --%> 
	v1 은 empty 입니다<br>
</c:if>

<c:if test="${empty v2 }">  <%-- 존재하지 않는 것도 empty 다 --%>
	v2 은 empty 입니다<br>
</c:if>

</body>
</html>
