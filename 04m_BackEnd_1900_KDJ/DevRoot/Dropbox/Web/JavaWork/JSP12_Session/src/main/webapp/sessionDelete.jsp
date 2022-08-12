<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 세션 attribute 삭제
	// removeAttribute(name)
	
	String sessionName1 = "num1";
	session.removeAttribute(sessionName1);
%>

<script>
alert("세션 attribute 삭제: <%= sessionName1%>");
location.href = "sessionList.jsp";
</script>