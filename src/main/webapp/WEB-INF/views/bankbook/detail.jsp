<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>this is detail page</h1>
	
	<table border="1">
		<thead></thead>
		<tbody>
				<tr>
					<td>${detail.bookNum}</td>
					<td>${detail.bookName}</td>
					
					<td>${detail.bookRate}</td>
					<td>${detail.bookSale}</td>
					
				</tr>
		</tbody>
	
	
	
	</table>
	
	
	<a href="./delete?bookNum=${detail.bookNum}"> Delete </a>
	<a href="./update?bookNum=${detail.bookNum}"> Update </a>
</body>
</html>