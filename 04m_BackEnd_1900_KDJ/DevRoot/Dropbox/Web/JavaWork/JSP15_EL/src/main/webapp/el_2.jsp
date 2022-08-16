<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="dto" class="com.lec.beans.WriteDTO"/>
<jsp:setProperty name="dto" property="id" value="123"/>    
<jsp:setProperty name="dto" property="subject" value="제목입니다"/>    
<jsp:setProperty name="dto" property="name" value="작성자입니다"/>    
    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	id: <%= dto.getId() %><br>
	제목: <%= dto.getSubject() %><br>
	작성자: <%= dto.getName() %><br>
	내용: <%= dto.getContent() %><br>
	<hr>
	
	id: <jsp:getProperty name="dto" property="id"/><br>
	제목: <jsp:getProperty name="dto" property="subject"/><br>
	작성자: <jsp:getProperty name="dto" property="name"/><br>
	내용: <jsp:getProperty name="dto" property="content"/><br>
	<hr>
	
	id: ${dto.id }<br>  <%-- dto객체의 getId() 값 --%>
	제목: ${dto.subject }<br>
	작성자: ${dto.name }<br>
	내용: ${dto.content }<br>  <%-- 없거나 null 이면 표현안함 --%>
	dto: ${dto }<br>  <%-- dto 객체의 toString() 값 --%>
	<%--xxx: ${dto.xxx }<br>  --%>  <%-- dto.getXxx() ??? --%>


</body>
</html>