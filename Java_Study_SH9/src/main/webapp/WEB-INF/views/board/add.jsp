<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<style>
    .align-center {text-align: center;}
</style>
<body>

<c:import url="../template/header.jsp"></c:import>
	<h1 class="align-center">${board } ADD</h1>
	
	
	<form action ="./add" class="align-center" method="post">
	     
	  
    	<div class="mb-3 mt-4">
	    	<label class="form-label">Title</label>
    	</div>
    	
	    <div>
	    	<input type ="text" name ="title"> 
	    </div>
	    
    	<div class="mb-3 mt-4">
	    	<label class="form-label">Writer</label>
    	</div>
    	
	    <div>
	    	<input type ="text" name ="writer"> 
	    </div>
	    
	    
	    
	 	<div class="mb-3 mt-4">
	    	<label  class="form-label">Contents</label>
	    </div>
	    <div>
	    	<input type="text" class="col-lg-2" name="contents">
	  	</div>
	  <button type="submit" class="btn btn-primary mt-4">글 작성</button>
	  
	  
	</form>

   
   <c:import url="../template/footer.jsp"></c:import>
    
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
   

</body>
</html>