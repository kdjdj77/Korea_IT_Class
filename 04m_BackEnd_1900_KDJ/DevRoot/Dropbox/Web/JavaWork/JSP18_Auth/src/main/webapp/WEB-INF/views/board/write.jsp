<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                <input type="text" class="form-control" id="name" placeholder="작성자를 입력하세요" name="name" required>
            </div>
            <div class="mb-3 mt-3">
                <label for="subject">제목:</label>
                <span class="form-control">${PRINCIPAL.username}(${PRINCIPAL.name})</span>
            </div>
            <div class="mb-3 mt-3">
                <label for="content">내용:</label>
                <textarea class="form-control" rows="5" id="content" placeholder="내용을 입력하세요" name="content"></textarea>
            </div>
 
            <button type="submit" class="btn btn-outline-dark">작성완료</button>
            <a class="btn btn-outline-dark" href="list">목록</a>
        </form>
 
    </div>
 
</body>
 
</html>