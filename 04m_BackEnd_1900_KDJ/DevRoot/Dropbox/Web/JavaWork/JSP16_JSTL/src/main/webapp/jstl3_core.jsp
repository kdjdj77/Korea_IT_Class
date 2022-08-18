<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.time.*" %>    
<%-- Core --%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%-- Functions --%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
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

<%
	if(1 + 2 == 3){
%>
		1 + 2 = 3<br>
<%
	}
%>

<%
	if(1 + 2 == 3){
		out.println("1 + 2 = 3<br>");
	}
%>

<!-- JSTL 을 사용하면 -->
<c:if test="${1 + 2 == 3 }">
	1 + 2 = 3: EL식 사용 가능 <br>
</c:if>

<c:if test="true"> <%-- 항상 참 --%>
	true <br>
</c:if>

<c:if test="<%= 1 + 2 == 3 %>">
	1 + 2 = 3: JSP 표현식 가능<br>
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

	<!-- JSTL 을 사용하는 경우 -->
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
	
	<!-- JSTL 을 사용하는 경우 -->
	<c:forEach var="i" begin="0" end="30" step="3">
		<span>${i } </span>
	</c:forEach>
	
	<!--  구구단 3단 
		3 * 1 = 3
		3 * 2 = 6
		..
		3 * 9 = 27
	 -->
	 <ul>
	 <c:forEach var="i" begin="1" end="9">
	 	<li>3 * ${i } = ${3 * i }</li>
	 </c:forEach>
	 </ul>

	<c:set var="intArray" value="<%= new int[]{1, 2, 3, 4, 5} %>"/>
	
	<%-- 배열원소에 대해 순환 --%>
	<c:forEach var="element" items="${intArray }">
		<span>${element } </span>
	</c:forEach>
	<br>
	
	<%-- 배열인덱스 2 ~ 4 에 대해 순환 --%>
	<c:forEach var="element" items="${intArray }" begin="2" end="4">
		<span>${element }</span>
	</c:forEach>
	<br>
	
	<%-- varStatus 속성에 순환정보들이 담겨 있다. 이 정보를 status 라는 변수에 담아서 순환 --%>
	<c:forEach var="element" items="${intArray }" begin="2" end="4" varStatus="status">
		<%-- <span>${element }</span>  --%>
		${status.count } : intArray[${status.index }] = ${element }, ${intArray[status.index] }<br>
	</c:forEach>
	<br>
	
	<%-- forEach 는 배열뿐 아니라 Collections 에서도 사용 가능! --%>
<%
	List<String> myList = Arrays.asList("월", "화", "수");
%>

<%-- List<> 를 순환 --%>
<c:set var="arr2" value="<%= myList %>"/>
<ul>
<c:forEach var="e" items="${arr2 }">
	<li>${e }</li>
</c:forEach>
</ul>

<%-- 동시에 복수개의 객체 순환 --%>
<c:set var="arr1" value='<%= new String[]{"MON", "TUE", "WED"} %>'/>
<table>
	<tr>
		<th>index</th><th>Day</th><th>요일</th>
	</tr>
	<c:forEach var="e" items="${arr1 }" varStatus="status">
		<tr>
			<td>${status.index }</td>
			<td>${e }</td>
			<td>${arr2[status.index] }</td>
		</tr>
	</c:forEach>
</table>
<br>

arr1의 길이: ${fn:length(arr1) }<br>
<c:set var="cnt" value="${fn:length(arr1) }"/>
<ul>
<c:forEach var="i" begin="0" end="${cnt - 1 }" varStatus="status">
	<li>${status.index } : ${arr1[i] } - ${arr2[i] }</li>
</c:forEach>
</ul>
<br>
	<%
		
		HashMap<String, Object> hMap = new HashMap<>(); // import 하기
		hMap.put("name", "홍길동");
		hMap.put("age", 33);
		hMap.put("today", LocalDateTime.now());  //  현재시간
	%>
<c:set var="map1" value="<%= hMap %>"/>
<table>
	<tr><th>key</th><th>value</th></tr>
	<c:forEach var="item" items="${map1 }">
		<tr>
			<td>${item.key }</td>
			<td>${item.value }</td>
		</tr>
	</c:forEach>
</table>



<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>
