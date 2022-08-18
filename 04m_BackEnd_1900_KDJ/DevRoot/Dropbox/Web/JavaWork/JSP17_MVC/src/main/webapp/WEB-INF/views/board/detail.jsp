<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
 
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
 
    <title>조회 - 좋은아침입니다</title>
</head>
 
 
<body>
    <div class="container mt-3">
        <h2>조회 - 좋은아침입니다</h2>
        <hr>
        <div class="mb-3 mt-3 clearfix">
            <span class="float-start me-2">id: 34</span>
            <span class="float-end ms-4">작성일: 2021-10-21 13:33:23</span>
            <span class="float-end">조회수: 8</span>
        </div>
 
        <section>
            <div class="mb-3">
                <label for="name">작성자:</label>
                <span class="form-control" >홍길동</span>
            </div>    
            <div class="mb-3 mt-3">
                <label for="subject">제목:</label>
                <span class="form-control" >좋은아침입니다</span>
            </div>    
            <div class="mb-3 mt-3">
                <label for="content">내용:</label>
                <span class="form-control" >어쩌구 저쩌구 주저리주저리</span>
            </div>    
 
            <!-- 하단 링크 -->
            <a class="btn btn-outline-dark" href="#">수정</a>
            <a class="btn btn-outline-dark" href="#">목록</a>
            <button type="button" class="btn btn-outline-dark">삭제</button>
            <a class="btn btn-outline-dark" href="#">작성</a>
            <!-- 하단 링크 -->        
 
        </section>
    </div>
</body>
 
</html>