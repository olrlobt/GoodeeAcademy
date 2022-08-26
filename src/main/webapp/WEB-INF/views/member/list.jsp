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
<div class="container-fluid">
	<div class="row justify-content-center mt-5">
	<div class = "col-lg-6">
			<h1>Member List</h1>
			<table border="1" class="table table-striped-columns">
				<thead>
					<tr>
						<th>ID</th>
						<th>NAME</th>
						<th>EMAIL</th>
						<th>PHONE</th>
					</tr>
				</thead>
				<tbody>
					
					<c:forEach items="${list}" var="dto">
						<tr>
							
							<td>${pageScope.dto.ID }</td>
							<td>${pageScope.dto.name }</td>
							<td>${pageScope.dto.email }</td>
							<td>${pageScope.dto.phone }</td>
						</tr>
					
					</c:forEach>
			
				</tbody>
			</table>
</div></div></div>
	<c:import url="../template/footer.jsp"></c:import>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

</body>
</html>