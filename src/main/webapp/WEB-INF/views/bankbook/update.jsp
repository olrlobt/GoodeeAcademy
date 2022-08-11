<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1> update page 입니당 </h1>
	
	
	${update.booknum }
	haha
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
	
	
	
	
</body>
</html>