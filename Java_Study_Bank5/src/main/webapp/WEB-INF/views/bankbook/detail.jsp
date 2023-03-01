<%@page import="com.iu.start.bankBook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
   // 스크립틀릿 <% javacode 작성
   
  	BankBookDTO bankBookDTO = (BankBookDTO)request.getAttribute("detail");
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>detail page</h1>
	
	<% if (bankBookDTO != null) { %>
	
	<table border =1 >
		<tr>
		<td>
		<%= bankBookDTO.getBookname() %>
		</td>
		<td>
		<%= bankBookDTO.getBooknum() %>
		</td>
		<td>
		<%= bankBookDTO.getBookrate() %>
		</td>
		<td>
		<%= bankBookDTO.isBooksale() %>
		</td>
		</tr>
	
	</table>
	<% } else {%>
		<h3> no data</h3>
		<%} %>
	
	
	
	
	
	
	<a href="../member/login">Login</a>
	
	<a href="/member/join">Join</a><br>
	<a href="./list">List</a>
</body>
</html>