<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <title>목록</title>
</head>

<body>
    <%-- 인증 헤더 --%>
    <jsp:include page="/WEB-INF/views/common/header.jsp"/>

    <div class="container mt-3">
        <h2>목록</h2>
        <table class="table table-hover">
            <thead class="table-success">
                <tr>
                    <th>#</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>조회수</th>
                    <th>작성일</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="dto" items="${list }">
                <tr>
                    <td>${dto.id }</td>
                    <td><a href="detail?id=${dto.id }">${dto.subject }</a></td>
                    <td>${dto.user.username }</td>
                    <td>${dto.viewCnt }</td>
                    <td>${dto.regDateTime}</td>
                </tr>            
            </c:forEach>           
            </tbody>
        </table>
        <div class="row">
        	<c:if test="${fn:contains(sessionScope.PRINCIPAL.authorities, 'ROLE_MEMBER' )}">
	            <div class="col-12">
	                <a class="btn btn-outline-dark" href="write">작성</a>
	            </div>
	        </c:if>
        </div>
    </div>
</body>
</html>
