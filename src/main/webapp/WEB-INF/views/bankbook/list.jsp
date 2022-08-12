<%@page import="com.iu.start.bankBook.BankBookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NAVER:은행</title>

	
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
		<a href="./add" style="position: absolute; left: 500px ; top :150px;">
		<img alt="" src="/resources/images/addBtn.png"></a>
		<h3>은행 정보</h3>
		<table  style="background: url('/resources/images/list.png');">
			<thead>
				<tr>
					<th > 은행 이름 </th><th> 이자 율(%)</th>
				</tr>
			</thead>
				
			<tbody>
	        	 
	        	 <c:forEach items="${requestScope.list}" var="dto" >
					<tr>
						<td><a href = "./detail?booknum=${dto.booknum}">${pageScope.dto.bookname}</a></td>
						<td>${pageScope.dto.bookrate}</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>
	
	</div>
	
	
	
	
	</div>


	
	
	
	
	
	
	
	
	
</body>
</html>