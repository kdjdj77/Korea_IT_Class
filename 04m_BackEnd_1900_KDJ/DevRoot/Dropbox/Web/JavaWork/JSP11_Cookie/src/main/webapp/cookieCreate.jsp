<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.*, java.time.format.*" %>
<%--
	쿠키 생성 절차
	1. 쿠키(javax.servlet.http.Cookie) 클래스로 생성  
	2. 쿠키속성 설정(setter)  
	3. 쿠키의 전송 (response 객체에 탑재:addCookie()) 
--%>
<%
	String cookieName1 = "num1";
	String cookieValue1 = "" + (int)(Math.random() * 10);
	
	//이름-값 쌍으로 쿠키 생성
	Cookie cookie1 = new Cookie(cookieName1, cookieValue1);
	//쿠키 파기(expiry) 시간 설정(단위 : 초)
	cookie1.setMaxAge(30);
	//response에 Cookie 탑재
	response.addCookie(cookie1);
	
	//쿠키는 얼마든지 생성 가능
	String cookieName2 = "dateTime";
	String cookieValue2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddhhmmss"));
	Cookie cookie2 = new Cookie(cookieName2, cookieValue2);
	cookie2.setMaxAge(40);
	response.addCookie(cookie2);
%>
<script>
	alert("<%= cookieName1 %> <%= cookieName2 %>쿠키 생성");
	location.href = "cookieList.jsp";
</script>