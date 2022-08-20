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
    <style>
 		input::-webkit-outer-spin-button,
		input::-webkit-inner-spin-button {
				-webkit-appearance: none;
		}
 	</style>
</head>
 
<body>
    <div class="container mt-3">
        <h2>작성</h2>
        <hr>
        <form name="frm" action="write" method="POST">
            <div class="mb-3">
                <label for="name">도서 제목:</label>
                <input type="text" class="form-control" id="title" placeholder="도서 제목을 입력하세요" name="title" required maxlength='20'>
            </div>
            <div class="mb-3 mt-3">
                <label for="price">가격:</label>
                <input type="number" class="form-control" id="price" placeholder="가격을 입력하세요" name="price" required min="0">
            </div>
            <div class="mb-3 mt-3">
                <label for="content">도서 소개:</label>
                <textarea class="form-control" rows="5" id="summary" placeholder="내용을 입력하세요" name="summary"></textarea>
            </div>
 
            <button type="submit" class="btn btn-outline-dark">작성완료</button>
            <a class="btn btn-outline-dark" href="list">목록</a>
        </form>
 
    </div>
 
</body>
 
</html>