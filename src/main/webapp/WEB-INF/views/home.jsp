
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>NAVER</title>
</head>
<style>
    .align-center {
    
    width : 1180px; 
    margin: 0 auto;}
</style>
<body>

<div class = "align-center" style="background: url('/resources/images/home.png'); background-repeat: no-repeat; background-size: fill;
	position: relative;">


<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



<c:if test="${empty sessionScope.log}">
	<div style= " left: 815px; top: 275px; position: absolute;">
		<a href= "./member/login" > <img src = "resources/images/intologin.png"> </a>
	</div>
	<div  style= " left: 1060px; top: 330px ; position: absolute;">
		<a href= "./member/join" style="width: 30px;"><img src = "resources/images/intojoin.png"></a>
	</div>
	<br>
</c:if>

<c:if test="${not empty sessionScope.log}">
	<div style= " left: 798px; top: 229px; position: absolute; background: url('/resources/images/logining.jpg');
		 background-repeat: no-repeat; width: 400px; height: 200px;" >
		 
		 <h4 style= " position: absolute; left: 90px; top: -4px;">${sessionScope.log.name} 님	</h4> 
		 <a href= "./member/logout" style="position: absolute;   left: 274px; top: 15px; ">
		 <img src = "resources/images/logout.png"></a>
		 <h5 style=" position: absolute; color: #323232;  left: 90px; top: 13px; ">${sessionScope.log.email}</h5> 
		
		<a href= "#" style=" position: absolute; left: 5px; top: 5px;"><img alt="" src="/resources/images/mypage.png"></a>
		
		
		
	</div>
</c:if>


<div style= " left: 257px; top: 49px; position: absolute;">
	<a href= "./member/search"><img src = "resources/images/searchBtn.png"></a>
</div>


<div style= " left: 375px; top: 173px; position: absolute;">
<a href= "/bankbook/list"><img alt="" src="/resources/images/banklistBtn.png"></a>

</div>



</div>

</body>
</html>
