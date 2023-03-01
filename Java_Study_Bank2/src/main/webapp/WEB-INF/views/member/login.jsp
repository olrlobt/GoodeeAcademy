<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NAVER</title>
</head>
<style>
    .align-center {text-align: center;}
    
    
    
</style>
<body>
	
	
	<div  style="background: url('/resources/images/loginpage.png'); background-repeat: no-repeat; position: relative;
	height: 600px; margin:0 auto; width: 500px;
	">
		
		
		
		<form action="./login" method = "post"  >
		<div style="position: absolute; top: 190px; left: 30px; background: url('/resources/images/loginID.png'); background-repeat:no-repeat; height: 50px;width: 410px;border: 0; ">
		<input type="text" name="ID" value="ID1" placeholder="아이디" style="width: 300px; border: 0;  margin-left: 50px; margin-top: 15px;"></div>
		<div style="position: absolute; top: 240px; left: 30px; background: url('/resources/images/loginPW.png'); background-repeat:no-repeat; height: 50px;width: 410px;border: 0;">
		<input type="text" name="PW" value="PW1" placeholder="비밀번호" style="width: 300px; border: 0;  margin-left: 50px; margin-top: 15px;"></div>
		<div style="position: absolute; top: 355px; left: 30px; ">
		<input type="submit" name="login" value="" style="background: url('/resources/images/login.png'); background-repeat:no-repeat; height: 60px ; width: 410px;border: 0"></div>
		</form>
		
		<form action="./join" method = "get"  >
		<div style="position: absolute; top: 435px; left: 70px; " >
		<input type="submit" name="join" value="" style="background: url('/resources/images/join.png'); background-repeat: no-repeat; height: 30px;width: 290px;border: 0"></div>
		<!-- <div style="position: absolute; top: 400px; left: 60px;"><img src = "/resources/images/loginPW.png"></div> -->
		</form>
	<div><h1></h1></div>
	<div><h1></h1></div>
	
	
	</div>
	
	<!-- <img src = "/resources/images/loginpage.png"> -->
        
        
  
	
</body>
</html>