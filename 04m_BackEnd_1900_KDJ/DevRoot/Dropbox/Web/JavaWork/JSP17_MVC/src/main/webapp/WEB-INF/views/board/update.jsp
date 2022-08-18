<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
 
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
 
    <title>수정 - 좋은아침입니다</title>
</head>
 
 
<body>
    <div class="container mt-3">
        <h2>수정</h2>
        <hr>
        <div class="mb-3 mt-3 clearfix">
            <span class="float-start me-2">id: 34</span>
            <span class="float-end ms-4">작성일: 2021-10-21 13:33:23</span>
            <span class="float-end">조회수: 8</span>
        </div>
 
        <form action="#">
            <input type="hidden" name="uid" value="#"/>
            <div class="mb-3">
                <label for="name">작성자:</label>
                <span class="form-control" readonly>홍길동</span>
            </div>    
            <div class="mb-3 mt-3">
                <label for="subject">제목:</label>
                <input type="text" class="form-control" id="subject" placeholder="제목을 입력하세요" name="subject" value="좋은아침입니다" required>
            </div>
            <div class="mb-3 mt-3">
                <label for="content">내용:</label>
                <textarea class="form-control" rows="5" id="content" placeholder="내용을 입력하세요" name="content">어쩌구 저쩌구 주저리주저리</textarea>
            </div>
 
            <!-- 하단 링크 -->
            <button type="submit" class="btn btn-outline-dark">수정완료</button>
            <button type="button" class="btn btn-outline-dark">이전으로</button>
            <a class="btn btn-outline-dark" href="#">목록</a>
            <!-- 하단 링크 -->
 
        </form>
    </div>
</body>
 
</html>