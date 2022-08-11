
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



<c:if test="${empty log}">
	<div style= " left: 815px; top: 275px; position: absolute;">
		<a href= "./member/login" > <img src = "resources/images/intologin.png"> </a>
	</div>
	<div  style= " left: 1060px; top: 330px ; position: absolute;">
		<a href= "./member/join" style="width: 30px;"><img src = "resources/images/intojoin.png"></a>
	</div>
	<br>
</c:if>
<c:if test="${not empty log}">
	<div style= " left: 100px; top: 400px; position: absolute;">
		<a href= "#">LogOut</a>
		<a href= "#">MyPage</a>
	</div>
</c:if>

<div style= " left: 257px; top: 49px; position: absolute;">
	<a href= "./member/search"><img src = "resources/images/searchBtn.png"></a>
</div>


<div style= " left: 100px; top: 400px; position: absolute;">
<a href= "/bankbook/list"> @list  </a>

</div>



</div>

</body>
</html>
