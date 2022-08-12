<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div style="background: url('/resources/images/banklistpage.png'); background-repeat: no-repeat; 
		background-size: fill; position: relative; height: 800px; width: 1200px;
	    margin: 0 auto; ">

	<div style="position: absolute; top: 120px; left :300px;">

	<h1> update page 입니당 </h1>
	
	${update.booknum }
	<form action="" method="post">
		<div>
			Name : <input type="text" name = "bookname" value = ${update.bookname }>
		
		</div>
	
		<div>
			Rate : <input type="text" name = "bookrate" value = ${update.bookrate }>
		
		</div>
		
		<input type="submit" value="수정">
		<button type="submit">수정</button>
	
	</form>
	</div>
	
	</div>
	
</body>
</html>