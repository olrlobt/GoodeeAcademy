<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
 
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	<h1>this is list page</h1>
	
	<div class = "">
	
	<table border="1">
		<thead></thead>
		<tbody>
		
		
			
				<c:forEach items="${list}" var="ar" >
				<tr>
					<td><a href="./detail?bookNum=${ar.bookNum}">${ar.bookNum}</a></td>
					<td>${ar.bookName}</td>
					
					<td>${ar.bookRate}</td>
					<td>${ar.bookSale}</td>
					
				</tr>
				</c:forEach>
			
		</tbody>
	
	
	
	</table>
<a href="./add"> Add </a>
	
	
	
	</div>
	

	
	
	
	
	
	<c:import url="../template/footer.jsp"></c:import>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
 
	
</body>
</html>