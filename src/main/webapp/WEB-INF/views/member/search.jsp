<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onclick="history.back()">
	
	
<div style="background: url('/resources/images/home.png'); background-repeat: no-repeat; background-size: fill;
	position: relative;width : 1180px; 
    margin: 0 auto;" >

<c:if test="${empty sessionScope.log}">
	<div style= " left: 815px; top: 275px; position: absolute;">
		<a href= "/member/login" > <img src = "/resources/images/intologin.png"> </a>
	</div>
	<div  style= " left: 1060px; top: 330px ; position: absolute;">
		<a href= "/member/join" style="width: 30px;"><img src = "/resources/images/intojoin.png"></a>
	</div>
	<br>
</c:if>

<c:if test="${not empty sessionScope.log}">
	<div style= " left: 798px; top: 229px; position: absolute; background: url('/resources/images/logining.jpg');
		 background-repeat: no-repeat; width: 400px; height: 200px;" >
		 
		 <h4 style= " position: absolute; left: 90px; top: -4px;">${sessionScope.log.name} 님	</h4> 
		 <a href= "/member/logout" style="position: absolute;   left: 275px; top: 13px; ">
		 <img src = "/resources/images/logout.png"></a>
		 <h5 style=" position: absolute; color: #323232;  left: 90px; top: 13px; ">${sessionScope.log.email}</h5> 
		
		<a href= "#" style=" position: absolute; left: 5px; top: 5px;"><img alt="" src="/resources/images/mypage.png"></a>
	</div>
</c:if>

	
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>


	<form method = "post">
		<div 
		style="position: absolute; width: 600px; height: 350px; left: 257px; top: 49px; 
		background: url('/resources/images/searchPage.png');background-repeat: no-repeat;  " 
		 onclick="event.cancelBubble=true">
			
				<input type ="text" name = "search" style=" margin-top:20px; margin-left: 15px; width: 450px; border: 0;">
			
			
		
				<div style="position: absolute; width: 55px; height: 55px; left: 530px; top : 0px;
				">
					<input type="submit" value="" style="width: 55px; height: 55px; border: 0; background: url('/resources/images/searchsubmit.png');background-repeat: no-repeat;">
				</div>
		
			
		
		</div>
		
	
	</form>
	
	
</div>
</body>
</html>