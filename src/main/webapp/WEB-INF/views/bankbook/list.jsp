<%@page import="com.iu.start.bankBook.BankBookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   // 스크립틀릿 <% javacode 작성
   
   ArrayList<BankBookDTO> ar = (ArrayList<BankBookDTO>)request.getAttribute("list");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> List page </h1>
	
	<a href="./detail">detail</a>
	
	<table border = 1>
		<thead>
			<tr>
				<th>Nmae</th><th>Rate</th>
			</tr>
		</thead>
			
		<tbody>
			<%for (BankBookDTO bankBookDTO : ar ){%>
			 <tr>
               <td><a href = "./detail?booknum=<%=bankBookDTO.getBooknum()%>"><%=bankBookDTO.getBookname() %></a></td>
               <td><%=bankBookDTO.getBookrate() %></td>
            </tr>
        	 <%} %>
		</tbody>
	</table>
	
	
	
	
	
</body>
</html>