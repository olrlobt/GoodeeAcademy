<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@page import="com.iu.start.bankBook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%
   // 스크립틀릿 <% javacode 작성
   
  	BankBookDTO bankBookDTO = (BankBookDTO)request.getAttribute("detail");
	
%> --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>detail page</h1>
	
	
	
	<table border =1 >
		<tr>
		<td>
		${requestScope.detail.getBooknum()}
		</td>
		<td>
		${requestScope.detail.bookname}
		</td>
		<td>
		${detail.bookrate}
		</td>
		<td>
		
		</td>
		</tr>
	
	</table>
	<a href= "./update?booknum=${detail.booknum}" > !! update</a>
	
	
	<a href="../member/login">Login</a>
	
	<a href="/member/join">Join</a><br>
	<a href="./list">List</a>
	<a href="./delete?booknum=${detail.booknum}"> ! ! delete</a>
	
	<br>
	<c:if test="${not empty sessionScope.log}">
		<a href= "../bankAccount/add?bookNum=${detail.booknum}" >가입하기</a>
	</c:if>
	
</body>
</html>