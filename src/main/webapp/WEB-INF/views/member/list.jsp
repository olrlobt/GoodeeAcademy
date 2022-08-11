<%@page import="com.iu.start.members.BankMembersDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% ArrayList<BankMembersDTO> ar = (ArrayList<BankMembersDTO>)request.getAttribute("search");%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> List Page Search 결과 입니다</h1>
	
	<table border=1>
		<thead>
		
		</thead>
		<tbody>
			<%for(BankMembersDTO bankMembersDTO : ar){ %>
			
			<tr>
				<td><%= bankMembersDTO.getID() %></td>
			</tr>
			<%} %>
	
		</tbody>
	</table>
	
</body>
</html>