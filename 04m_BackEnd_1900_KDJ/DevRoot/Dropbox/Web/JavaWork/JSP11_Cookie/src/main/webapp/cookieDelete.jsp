<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cookieName1 = "num1";
	Cookie cookie1 = new Cookie(cookieName1, "");
	cookie1.setMaxAge(0);
	response.addCookie(cookie1);
%>

<script>
alert("<%= cookieName1 %> 쿠키 삭제");
location.href = "cookieList.jsp";
</script>