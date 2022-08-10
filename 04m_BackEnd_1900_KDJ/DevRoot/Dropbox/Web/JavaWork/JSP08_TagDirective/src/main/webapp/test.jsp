<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.*" %>
<%@ page import="java.time.format.DateTimeFormatter" %>

<% LocalDateTime now = LocalDateTime.now(); %>
<%= now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) %>