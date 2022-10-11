<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%-- 로그인한 사용자 정보 Authentication 객체의 필요한 property 들을 변수에 담아 사용 가능  --%>
<sec:authentication property="name" var="username"/>  
<sec:authentication property="authorities" var="authorities"/> 
<sec:authentication property="principal" var="userdetails"/>
<!DOCTYPE html>
<html lang="ko">
 
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>작성</title>
</head>
 
<body>
	<%-- 인증 헤더 --%>
	<jsp:include page="/WEB-INF/views/common/header.jsp"/>
    <div class="container mt-3">
        <h2>작성</h2>
        <hr>
        <form name="frm" action="write" method="POST">
            <div class="mb-3">
                <label for="name">작성자:</label>
                <span class="form-control">${username} (${userdetails.user.name})</span>
            </div>
            <div class="mb-3 mt-3">
                <label for="subject">제목:</label>
                <input type="text" class="form-control" id="subject" placeholder="제목을 입력하세요" name="subject" required>
            </div>
            <div class="mb-3 mt-3">
                <label for="content">내용:</label>
                <textarea class="form-control" rows="5" id="content" placeholder="내용을 입력하세요" name="content"></textarea>
            </div>
 
            <button type="submit" class="btn btn-outline-dark">작성완료</button>
            <a class="btn btn-outline-dark" href="list?page=${empty page?'':page}">목록</a>
        </form>
 
    </div>
 
</body>
 
</html>