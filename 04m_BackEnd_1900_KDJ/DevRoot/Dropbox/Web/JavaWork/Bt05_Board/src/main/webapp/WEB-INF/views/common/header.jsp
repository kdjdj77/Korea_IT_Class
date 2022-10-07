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
<html>

<head>
  <title>NavBar</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>

  <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="javascript:void(0)">Security</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="mynavbar">
        <ul class="navbar-nav me-auto">
          <!-- 누구에게나 보이는 메뉴 -->
          <sec:authorize access="isAnonymous()">
	          <li class="nav-item" TODO="">
	            <a class="nav-link" href="javascript:void(0)">Anonymous</a>
	          </li>
          </sec:authorize>
         
          <!-- 로그인한 사람에게만 보이는 메뉴 -->
          <sec:authorize access="isAuthenticated()">
	          <li class="nav-item" TODO="">
	            <a class="nav-link" href="javascript:void(0)">Authenticated</a>
	          </li>          
          </sec:authorize>
         
          <!-- 로그인한 사람중 ROLE_MEMBER 나 ROLE_ADMIN 권한 있는 사람에게만 보이는 메뉴 -->
          <sec:authorize access="hasAnyRole('ADMIN', 'MEMBER')">
	          <li class="nav-item" TODO="">
	            <a class="nav-link" href="javascript:void(0)">Member</a>
	          </li>
          </sec:authorize>
            
         
          <!-- 로그인한 사람중 ROLE_ADMIN 권한 있는 사람에게만 보이는 메뉴 -->
          <sec:authorize access="hasRole('ADMIN')">
	          <li class="nav-item" TODO="">
	            <a class="nav-link" href="javascript:void(0)">Admin</a>
	          </li>
          </sec:authorize>
          
         
        </ul>
       
         <!-- 로그인 안했을때는 로그인 form 보여주기 -->
         <sec:authorize access="isAnonymous()">
         	<a class="btn btn-primary" type="submit" href="${pageContext.request.contextPath}/user/login">Login</a>       		
         </sec:authorize>

         <!-- 로그인 했을때는 username 과 로그아웃 form 보여주기 -->
         <sec:authorize access="isAuthenticated()">
	         <form action="${pageContext.request.contextPath}/user/logout" method="POST" TODO="">
	           <!--TODO : 로그아웃후 다시 돌아오기 -->
	           <span class="d-flex">
	             <span class="text-light p-2"><span TODO="">${username }(${userdetails.user.name })</span> 님 환영합니다</span>
	             <span><button class="btn btn-danger" type="submit">Logout</button></span>
	           </span>
	         </form>       		
         </sec:authorize>
         
      </div>
    </div>
  </nav>

  <div class="container-fluid mt-3">
  	<!-- 로그인 하지 않았을때 보여주는 화면 -->
	<sec:authorize access="isAnonymous()">
         <div TODO="" class="alert alert-warning alert-dismissible">
             <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
             로그인하지 않은 상태입니다 <br>
         </div>          
	</sec:authorize>
    <!-- 로그인 했을때 보여주는 화면 -->  
    <sec:authorize access="isAuthenticated()">         
         <div TODO="" class="alert alert-info alert-dismissible">
             <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
             ${userdetails.user}<br>  
             ${authorities}<br>              
             로그인 하셨습니다 <br>
         </div>  		
  	</sec:authorize> 
           
	</div>
</body>
</html>