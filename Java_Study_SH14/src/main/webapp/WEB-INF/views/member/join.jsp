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
<c:import url="../template/header.jsp"></c:import>

<div class="container-fluid">
	<div class="row justify-content-center mt-5">
	<div class = "col-lg-6">
	<form action="./join" method="post" enctype="multipart/form-data">
	
			<div class="row mb-3">
			    <label for="inputUserName" class="col-sm-2 col-form-label">ID</label>
			    <div class="col-sm-10">
			      <input type="text" name="ID" class="form-control" id="inputUserName" placeholder="ID 입력">
			    </div>
			  </div>
			<div class="row mb-3">
			    <label for="inputPassword" class="col-sm-2 col-form-label">PW</label>
			    <div class="col-sm-10">
			      <input type="text" name="PW" class="form-control" id="inputPassword" placeholder="PW 입력">
			    </div>
			  </div>
			<div class="row mb-3">
			    <label for="inputNAME" class="col-sm-2 col-form-label">NAME</label>
			    <div class="col-sm-10">
			      <input type="text" name="name" class="form-control" id="inputNAME" placeholder="NAME 입력">
			    </div>
			  </div>
			<div class="row mb-3">
			    <label for="inputEMAIL" class="col-sm-2 col-form-label">EMAIL</label>
			    <div class="col-sm-10">
			      <input type="text" name="email" class="form-control" id="inputEMAIL" placeholder="EMAIL 입력">
			    </div>
			  </div>
			<div class="row mb-3">
			    <label for="inputPHONE" class="col-sm-2 col-form-label">PHONE</label>
			    <div class="col-sm-10">
			      <input type="text" name="phone" class="form-control" id="inputPHONE" placeholder="PHONE 입력">
			    </div>
			  </div>
			<div class="row mb-3">
			    <label for="inputPhoto" class="col-sm-2 col-form-label">Photo</label>
			    <div class="col-sm-10">
			      <input type="file" name="photo" class="form-control" id="inputPhoto" >
			    </div>
			  </div>
		
		<input type="submit" value="회원가입">
	
	</form>
	</div>
	</div>
</div>
<c:import url="../template/footer.jsp"></c:import>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

</body>
</html>