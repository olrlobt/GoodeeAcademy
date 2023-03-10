<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
 <link href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
    body {
		font-family: 'Varela Round', sans-serif;
	}
	.modal-login {		
		color: #636363;
		width: 350px;
		margin: 80px auto 0;
	}
	.modal-login .modal-content {
		padding: 20px;
		border-radius: 5px;
		border: none;
	}
	.modal-login .modal-header {
		border-bottom: none;   
        position: relative;
        justify-content: center;
	}
	.modal-login h4 {
		text-align: center;
		font-size: 26px;
		margin: 30px 0 -15px;
	}
	.modal-login .form-control:focus {
		border-color: #70c5c0;
	}
	.modal-login .form-control, .modal-login .btn {
		min-height: 40px;
		border-radius: 3px; 
	}
	.modal-login .close {
        position: absolute;
		top: -5px;
		right: -5px;
	}	
	.modal-login .modal-footer {
		background: #ecf0f1;
		border-color: #dee4e7;
		text-align: center;
        justify-content: center;
		margin: 0 -20px -20px;
		border-radius: 5px;
		font-size: 13px;
	}
	.modal-login .modal-footer a {
		color: #999;
	}		
	.modal-login .avatar {
		position: absolute;
		margin: 0 auto;
		left: 0px;
		right: 0;
		top: -45px;
		width: 95px;
		height: 95px;
		border-radius: 50%;
		z-index: 9;
		background: #60c7c1;
		padding: 2px;
		box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.1);
	}
	.modal-login .avatar img {
		width: 100%;
	}
    .modal-login .btn {
        color: #fff;
        border-radius: 4px;
		background: #60c7c1;
		text-decoration: none;
		transition: all 0.4s;
        line-height: normal;
        border: none;
    }
	.modal-login .btn:hover, .modal-login .btn:focus {
		background: #45aba6;
		outline: none;
	}
	.trigger-btn {
		display: inline-block;
		margin: 100px auto;
	}
</style>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

<div class="container-fluid">
	<div class="row justify-content-center mt-5">
	<div class = "col-lg-6">

		<div class="text-center">
			<!-- Button HTML (to Trigger Modal) -->
			<a href="#myModal" class="trigger-btn" data-toggle="modal">Click to Open Login Modal</a>
		</div>
		
		<!-- Modal HTML -->
		<div id="myModal" class="modal fade">
			<div class="modal-dialog modal-login">
				<div class="modal-content">
					<div class="modal-header">
						<div class="avatar">
							<img src="/resources/images/chunsik.png" alt="Avatar" style="border-radius: 50%;">
						</div>				
						<h4 class="modal-title">Member Login</h4>	
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">
						<form action="login" method="post">
							<div class="form-group">
								<input type="text" class="form-control" name="ID" placeholder="Username" value = "ID1" required="required">		
							</div>
							<div class="form-group">
								<input type="password" class="form-control" name="PW" placeholder="Password" value="PW1" required="required">	
							</div>        
							<div class="form-group">
								<button type="submit" class="btn btn-primary btn-lg btn-block login-btn">Login</button>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<a href="#">Forgot Password?</a>
					</div>
				</div>
			</div>
		</div> 
</div></div></div>
	
	
	
	
	<c:import url="../template/footer.jsp"></c:import>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
  
</body>
</html>