<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.*, com.lec.beans.*" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>EL 우선순위</title>
</head>
<body>
<%
	//scope 우선순위 pageContext > request > session > application
	application.setAttribute("myage", "application 홀리몰리");
	session.setAttribute("myage", "session 과카몰리");
	request.setAttribute("myage", "request 로보카폴리");
	pageContext.setAttribute("myage", "page 롤리폴리");
%>
myage: ${myage }<br>
appliactionScope.myage: ${applicationScope.myage }<br>
sessionScope.myage: ${sessionScope.myage} <br> <%-- 꼭 찝어서 session 의 attribute값 --%>
requestScope.myage: ${requestScope.myage }<br> <%-- 꼭 찝어서 request 의 attribute값 --%>
pageScope.myage: ${pageScope.myage} <br> <%-- 콕 찝어서 pageContext 의 attribute값 --%>
<hr>

<%
	request.setAttribute("mydto", new WriteDTO(100, "제목", "내용", "작성자", 3, LocalDateTime.now()));
%>

${mydto }<br>  <%-- toString() 값 --%>
${mydto.id }<br> <%-- mydto.getId() 값 --%>
<%= ((WriteDTO)request.getAttribute("mydto")).getId() %><br> <%-- 이러니 EL 써야지! --%>
${mydto.subject }<br>
${mydto.content }<br>
${mydto.regDate }<br>
${mydto.regDateTime }<br>  <%-- mydto.getRegDateTime() 값 --%>

</body>
</html>













