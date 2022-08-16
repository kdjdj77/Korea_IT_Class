<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<style>
	table, th, td {
		border: 1px solid black;
		border-collapse: collapse;
	}
</style>
<head>
<meta charset="UTF-8">
<title>JSTL Core</title>
</head>
<body>

<h2>if</h2>
	<% if(1 +  2 == 3) { %>
		1 + 2 = 3<br>
	<% } %>
	<%
		if (1 + 2 == 3) {
			out.println("1 + 2 = 3<br>");
		}
	%>
	<%-- JSTL을 사용하면 --%>
	<c:if test="${1 + 2 == 3 }">
		1 + 2 = 3 : EL식 사용 가능
	</c:if>
	<c:if test="true">
		true<br>
	</c:if>
	<c:if test="<%= 1 + 2 == 3 %>">
		1 + 2 = 3 : JSP 표현식 가능<br>
	</c:if>
	<c:if test="${1 + 2 != 3 }">
		1 + 2 != 3<br>
	</c:if>
	
	<%-- JSTL 에서 c:else 는 따로 없고,  아래와 같이 choose, when 을 조합해서 사용해야 한다 --%>
<h2>choose, when, otherwise</h2>
	<!-- 스크립트릿만 사용 하는 경우1 -->
	<%
		switch(10 % 2){
		case 0:
	%>
			"짝수입니다"<br>
	<%
			break;
		case 1:
	%>
			"홀수입니다"<br>
	<%
			break;
		default:
	%>
			"이도 저도 아닙니다"<br>
	<%
		} // end switch
	%>
	<%-- JSTL을 사용하는 경우 --%>
	<c:choose>
		<c:when test="${10 % 2 == 0 }">
			"짝수입니다"<br>
		</c:when>
		<c:when test="${10 % 2 == 1 }">
			"홀수입니다"<br>
		</c:when>
		<c:otherwise>
			"이도 저도 아닙니다"<br>
		</c:otherwise>
	</c:choose>

	<hr>
<h2>ForEach</h2>
	<hr>
<h2>forEach</h2>
	<!-- 스크립트릿만 사용 하는 경우1 -->
	<%
		for(int i = 0; i <= 30; i += 3 ){
	%>
			<span><%= i %> </span> 
	<%
		}
	%>
	<br>
	
	<%-- JSTL을 사용하는 경우 --%>
	<c:forEach var="i" begin="0" end="30" step="3">
		<span>${i }</span>
	</c:forEach>

	<!--구구단 3단 
	3 * 1 = 3
	3 * 2 = 6
	..
	3 * 9 = 27 -->
	<ul>
		<c:forEach var="i" begin="1" end="9">
			<li>3 * ${i } = ${3 * i }</li>
		</c:forEach>
	</ul>


	



	
	
	
	
	
	
	
	
</body>
</html>