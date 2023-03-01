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
	<title>NAVER:디테일</title>
	
	<style>
		th{
			width: 180px; 
			height: 30px;
		}
		td{
			width: 180px; 
			height: 28px;
		}
	
	</style>

</head>
<body>
	<div style="background: url('/resources/images/banklistpage.png'); background-repeat: no-repeat; 
	background-size: fill; position: relative; height: 800px; width: 1200px;
    margin: 0 auto; ">
    
    <div style = "position: absolute; left: 300px; top: 120px;">
    	<h3>세부정보</h3>
    
	    <table  style="background: url('/resources/images/list.png');">
	    
	    <thead>
	    <tr>
	   	 	<th>은행 번호</th><th>은행 이름</th><th>이자 율(%)</th>
	    </tr>
	    
	    </thead>
	    
	    <tbody>
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
			</tr>
	    </tbody>
			
		
		</table>
	    
	    
	    
		
		
		<a href="../member/login">Login</a>
		
		<a href="/member/join">Join</a><br>
		
		
		<a href="./list" style="position: absolute; left: 380px ; top :150px;">
		<img alt="" src="/resources/images/backBtn.png"></a>
		<a href= "./update?booknum=${detail.booknum}" style="position: absolute; left: 440px ; top :150px;">
		<img alt="" src="/resources/images/updateBtn.png"> </a>
		<a href="./delete?booknum=${detail.booknum}" style="position: absolute; left: 500px ; top :150px;">
		<img alt="" src="/resources/images/deleteBtn.png"> </a>
		
		<br>
		<c:if test="${not empty sessionScope.log}">
			<a href= "../bankAccount/add?bookNum=${detail.booknum}" >가입하기</a>
		</c:if>
    </div>
    
   
    
    </div>
	
	
	
	
	
</body>
</html>