<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD Page</title>
<script type="text/javascript" src="//code.jquery.com/jquery-3.6.0.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">


 <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
    
</head>
<style>
   
</style>
<body>

<c:import url="../template/header.jsp"></c:import>


<section class="container-fluid col-lg-4">
	<h1>${board } ADD</h1>
	
	
	<form action ="./add"  method="post" enctype="multipart/form-data">
	     
	  
    	<div class="mb-3 mt-4">
	    	<label class="form-label">Title</label>
	    	<input type ="text" name ="title"> 
	    </div>
	    
    	<div class="mb-3 mt-4">
	    	<label class="form-label">Writer</label>

	    	<input type ="text" name ="writer"> 
	    </div>
	    
	    
	    
	 	<div class="mb-3 mt-4">
	    	<label  class="form-label">Contents</label>
	    	<textarea class="form-control" name="contents" id="contents" rows="3"></textarea>
	    	
	  	</div>
	  	
			<div id = "FileDiv">

				<!-- 파일이 들어가는 자리 -->

			</div>
	  <button type="button" id = "addFileBtn" class="btn btn-primary mt-4">파일 추가</button>
	  <button type="submit" class="btn btn-primary mt-4">글 작성</button>
	  
	  
	</form>

   
   
   
   </section>
   <c:import url="../template/footer.jsp"></c:import> 
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
   <script type="text/javascript">
   		$("#contents").summernote();
   </script>
   <script src="/resources/js/add.js"></script>
</body>
</html>