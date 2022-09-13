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
	<h1>!! my page !!</h1>
	<h3>${dto.ID }</h3>
	<h3>${dto.name }</h3>
	<h3>${dto.email }</h3>
	<h3>${dto.phone }</h3>
	
	<c:forEach items="${dto.accountDTOs }" var="account">
	
		<table border="1">
			<thead></thead>
			<tbody>
				<tr>
					<td>${account.accountNum}</td>
					<td>${account.bankBookDTO.bookName}</td>
					<td>${account.accountDate}</td>
					
					
				</tr>
			
			</tbody>
		
		</table>
	</c:forEach>
	<div class = "row">
		<img alt="" src="../resources/upload/member/${dto.bankMembersFileDTO.fileName }">
	</div>
	
	<div class = "row">
		<c:forEach items="${member.roleDTOs }" var="roleDTO">
			<div>${roleDTO.roleNum } ${roleDTO.roleName }</div>
		</c:forEach>
		
		
		<h1>당신은 ${member.roleDTOs.get(0).roleName }</h1>
		<h1>당신은 ${member.roleDTOs["0"].roleName }</h1>
	</div>
	
	</div></div></div>
	
	
	<c:import url="../template/footer.jsp"></c:import>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	
</body>
</html>