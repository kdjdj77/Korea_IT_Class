<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="person1" class="com.lec.beans.Person"/>    
<%-- 다음과 같은 일 수행
	Person person1 = new com.lec.beans.Person();  // 기본생성자 호출
	request.setAttribute("person1", person1);	 //<-- 좀더 정확히는 이코드까지 수행
 --%>
<%-- 기본생성자로 bean 생성 후 setter로 초기화 --%>
<jsp:useBean id="person2" class="com.lec.beans.Person">
	<jsp:setProperty name="person2" property="name" value="토르"/>
	<jsp:setProperty name="person2" property="age" value="1000"/>
	<jsp:setProperty name="person2" property="id" value="777"/>
	<jsp:setProperty name="person2" property="gender" value="Male"/>
</jsp:useBean>

<%-- form 에서 넘어온 값을 bean 객체가 바로 받을수 있다
	bean 의 필드명(getter/setter명) 과 form 의 name 이 일치해야 한다  --%>
<jsp:useBean id="person3" class="com.lec.beans.Person"/>
<jsp:setProperty name="person3" property="name"/>
<jsp:setProperty name="person3" property="age"/>
<jsp:setProperty name="person3" property="id"/>
<jsp:setProperty name="person3" property="gender"/>
<%-- 다음과 같이 실행되었다고 볼수 있다
	person3.setGender(request.getParameter("gender")) --%>

<%-- parameter를 일괄로 가져올 수 있다 --%>
<jsp:useBean id="person4" class="com.lec.beans.Person"/>
<jsp:setProperty name="person4" property="*"/>

<jsp:useBean id="student1" class="com.lec.beans.Student">
	<jsp:setProperty name="student1" property="name" value="고질라"/>
	<jsp:setProperty name="student1" property="age" value="15"/>
	<jsp:setProperty name="student1" property="grade" value="3"/>
	<jsp:setProperty name="student1" property="gender" value="M"/>
</jsp:useBean>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>자바빈</title>
</head>
<body>
	<jsp:setProperty property="name" name="person1" value="고길동"/>
	<jsp:setProperty property="age" name="person1" value="24"/>
	<jsp:setProperty property="id" name="person1" value="1515"/>
	<jsp:setProperty property="gender" name="person1" value="남"/>
	<%-- 다음과 같은 일을 수행한다.
		person1.setName("고길동");
		person1.setAge(24);
		person1.setId(1515);
		person1.setGender("남");
	--%>
	<h3>person1</h3>
	이름: <jsp:getProperty property="name" name="person1"/><br>
	나이: <jsp:getProperty property="age" name="person1"/><br>
	아이디: <jsp:getProperty property="id" name="person1"/><br>
	성별: <jsp:getProperty property="gender" name="person1"/><br>
	<%-- 다음과 같은 일을 수행한다
		<%= person1.getName() %>
		<%= person1.getAge() %>
		<%= person1.getId() %>
		<%= person1.getGender() %>
	--%>	
	<h3>person2</h3>
	이름: <jsp:getProperty property="name" name="person2"/><br>
	나이: <jsp:getProperty property="age" name="person2"/><br>
	아이디: <jsp:getProperty property="id" name="person2"/><br>
	성별: <jsp:getProperty property="gender" name="person2"/><br>
	
	<h3>person3</h3>
	이름: <jsp:getProperty property="name" name="person3"/><br>
	나이: <jsp:getProperty property="age" name="person3"/><br>
	아이디: <jsp:getProperty property="id" name="person3"/><br>
	성별: <jsp:getProperty property="gender" name="person3"/><br>	
	
	<h3>person4</h3>
	이름: <jsp:getProperty property="name" name="person4"/><br>
	나이: <jsp:getProperty property="age" name="person4"/><br>
	아이디: <jsp:getProperty property="id" name="person4"/><br>
	성별: <jsp:getProperty property="gender" name="person4"/><br>	

	<h3>student1</h3>
	이름: <jsp:getProperty property="name" name="student1"/><br>
	나이: <jsp:getProperty property="age" name="student1"/><br>
	아이디: <jsp:getProperty property="grade" name="student1"/><br>
	성별: <jsp:getProperty property="gender" name="student1"/><br>	

		 
</body>
</html>