<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script src="https://kit.fontawesome.com/51772bd9bd.js" crossorigin="anonymous"></script>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%-- 로그인한 사용자 정보 Authentication 객체의 필요한 property 들을 변수에 담아 사용 가능  --%>
<sec:authentication property="name" var="username"/>  
<sec:authentication property="authorities" var="authorities"/> 
<sec:authentication property="principal" var="userdetails"/>

<!-- 댓글 -->
<div class="container my-3 border rounded">
    <div class="mb-3 mt-3">
        <label>댓글: <span id="cmt_cnt"></span> 개</label>
        
		<%--  ROLE_MEMBER 가진 사용자만 댓글 작성 가능 --%>
  		<sec:authorize access="hasAnyRole('ADMIN', 'MEMBER')">
	        <div class="input-group my-2">
	            <input type="text" class="form-control" id="input_comment">
	            <button type="button" class="btn btn-outline-primary" id="btn_comment">작성</button>
	        </div>
	    </sec:authorize>
        <table class="table table-hover mt-3" id="cmt_table">
            <thead>
              <tr>
                <th style="width: 16.66%">작성자</th>
                <th>내용</th>
                <th style="width: 16.66%">작성일</th>
              </tr>
            </thead>
            <tbody id="cmt_list">
              
            </tbody>
        </table>
    </div>
</div>
<!-- 댓글 -->
