<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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

	<script src="https://kit.fontawesome.com/51772bd9bd.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/list.js"></script>

    <title>목록</title>
</head>

<body style="margin-bottom: 200px">
	<%-- 인증 헤더 --%>
	<jsp:include page="/WEB-INF/views/common/header.jsp"/>

    <div class="container mt-3">
        <h2>목록</h2>
        <hr>
        
        <!-- 페이징 헤더 -->
        <div class="mb-3 mt-3 clearfix">
            <span class="float-start me-2">총 ${cnt }개</span>
            <span class="float-start">page ${page }/${totalPage }</span>
            <span class="float-end">
            	<form name="frmPageRows">
            		<input type="hidden" name="page" value="${page }">
	                <select class="form-select" name="pageRows">
	                    <option value="10" ${pageRows==10 ? 'selected' : '' }>10</option>
	                    <option value="15" ${pageRows==15 ? 'selected' : '' }>15</option>
	                    <option value="20" ${pageRows==20 ? 'selected' : '' }>20</option>
	                    <option value="50" ${pageRows==50 ? 'selected' : '' }>50</option>
	                </select>
                </form>
            </span>
        </div>          
        <!-- 페이징 헤더 -->        
        
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
            <div class="col-12">
            	<sec:authorize access="hasAnyRole('ADMIN', 'MEMBER')">
                <a class="btn btn-outline-dark" href="write">작성</a>
                </sec:authorize>
            </div>
        </div>
    </div>

    <!-- pagination -->
    <div class="container mt-1">
        <ul class="pagination justify-content-center">
            <%-- << 표시 여부 --%>   
            <c:if test="${page > 1 }">
            <li class="page-item"><a class="page-link" href="${url }" title="처음"><i class='fas fa-angle-double-left'></i></a></li>
            </c:if>     
        
            <%-- < 표시 여부 --%>
            <c:if test="${startPage > 1 }">
            <li class="page-item"><a class="page-link" href="${url }?page=${startPage - 1 }"><i class='fas fa-angle-left'></i></a></li>
            </c:if>
            
            <%-- 페이징 안의 '숫자' 표시 --%> 
            <c:if test="${totalPage > 1 }">
                <c:forEach var="k" begin="${startPage }" end="${endPage }">
                <c:choose>
                    <c:when test="${k != page }">
                        <li class="page-item"><a class="page-link" href="${url }?page=${k }">${k }</a></li>        			
                    </c:when>
                    <c:otherwise>
                        <li class="page-item active"><a class="page-link" href="javascript:void(0);">${k }</a></li>
                    </c:otherwise>
                </c:choose>
                </c:forEach>    
            </c:if>
                        
            <%-- > 표시 여부 --%>
            <c:if test="${totalPage > endPage }">
            <li class="page-item"><a class="page-link" href="${url }?page=${endPage + 1 }"><i class='fas fa-angle-right'></i></a></li>
            </c:if>
            
            <%-- >> 표시 여부 --%>
            <c:if test="${page < totalPage }">
            <li class="page-item"><a class="page-link" href="${url }?page=${totalPage }"><i class='fas fa-angle-double-right'></i></a></li>
            </c:if>
            
        </ul>
    </div>
    <!-- pagination -->    




</body>
</html>
