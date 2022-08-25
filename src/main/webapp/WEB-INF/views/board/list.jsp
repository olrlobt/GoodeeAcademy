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
	<h1>${board} page  </h1>
	
	
	<table class="table">
	  <thead class = "table-light">
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">Title</th>
	      <th scope="col">Contents</th>
	      <th scope="col">Writer</th>
	    </tr>
	  </thead>
	  <tbody class="table-group-divider">
	  
	  <c:forEach items="${list}" var="dto">
	  
	  	<tr>
	     
	      <td>${dto.num }</td>
	      <td><a href = "./detail?num=${dto.num}">${dto.title }</a></td>
	      <td>${dto.contents }</td>
	      <td>${dto.writer }</td>
	      
	    </tr>
	  
	  </c:forEach>
	  
	  
	    
	    
	  </tbody>
	</table>
	
	
	<nav aria-label="Page navigation example">
	  <ul class="pagination justify-content-center">
	  
	  
	  	<c:choose>
	  		<c:when test="${pager.startNum <= 1}">
	  			<li class="page-item disabled">
	      			<a class="page-link">Previous</a>
				</li>
	  		</c:when>
	  	
	  		<c:otherwise> 
	  		<li class="page-item"><a class="page-link" href="./list?page=${pager.startNum-1}">Previous</a></li>
	  		</c:otherwise>
	  	
	  	</c:choose>
	  	
	  	
	  		<c:forEach begin="${pager.startNum }" end="${pager.lastNum }" var="i">
		  		
			  			<li class="page-item"><a class="page-link" href="./list?page=${i}">${i}</a></li>
		  		
			  		
		  			
		  	</c:forEach>
	  		
		   
	   	 	
	   	 	<c:choose>
	  		<c:when test="${pager.lastNum - pager.startNum < 4}">
	  			<li class="page-item disabled">
	  			<a class="page-link" href="./list?page=${pager.lastNum+1}">Next</a>
			  </li>
	  		</c:when>
	  		<c:otherwise> 
	  		 	<li class="page-item">
	  		 	<a class="page-link" href="./list?page=${pager.lastNum+1}">Next</a>
			  </li>
	  		</c:otherwise>
			  	
	  	</c:choose>
	  </ul>
	</nav>
	
	
	
<a href="./add"> Add </a>

	
	
	
	
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
 
</body>
</html>