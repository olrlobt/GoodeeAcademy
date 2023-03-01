
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<img src = "resources/images/chunsik.png" width="500dx">



<a href= "./member/login" > <img src = "resources/images/login.png"> </a>

<a href= "./member/join"> Join </a>

<a href= "/bankbook/list"> list </a>

<a href= "./bankbook/detail"> detail </a>
<a href= "./bankbook/add"> Add </a>

<br>

<a href= "./member/search" > Search </a>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
