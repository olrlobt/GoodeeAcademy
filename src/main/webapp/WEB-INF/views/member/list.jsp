<%@page import="com.iu.start.members.BankMembersDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="background: url('/resources/images/searchlist.png'); background-repeat: no-repeat; background-size: fill;
	position: relative; height: 800px; width: 1200px;
    margin: 0 auto; ">
	
	
	<table border=1 style="position: absolute; top: 180px; left: 70px;">
		<thead>
		
		</thead>
		<tbody>
			<%-- <c:forEach begin="0" end="10" var="i">
				<h3>${pageScope.i}</h3>
			
			</c:forEach> --%>
			<c:forEach items="${requestScope.search}" var="dto" >
				<tr>
					<td>${pageScope.dto.ID}</td>
					<td>${pageScope.dto.name}</td>
					<td>${pageScope.dto.email}</td>
					<td>${pageScope.dto.phone}</td>
				</tr>
			
			</c:forEach>
		</tbody>
	</table>
	
	</div>
	
	
	
	
	
	
</body>
</html>