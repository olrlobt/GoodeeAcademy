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

            <h1> 회원가입 약관 동의 </h1>

            <form action="./join" >
                <div>
                    <textarea name="" id="" cols="30" rows="5"></textarea><br>
                    모두 읽고 동의함 <input type="checkbox" class="joinCheck" name = "joinCheck">
                </div>
                <div>
                    <textarea name="" id="" cols="30" rows="5"></textarea><br>
                    모두 읽고 동의함 <input type="checkbox" class="joinCheck" name = "joinCheck">
                </div>
                <div>
                    <textarea name="" id="" cols="30" rows="5"></textarea><br>
                    모두 읽고 동의함 <input type="checkbox" class="joinCheck" name = "joinCheck">
                </div>
                <hr>
                <div>
                    전체 동의 <input type="checkbox" id="joinAllCheck" name = "joinCheck">
                </div>
                
                <input type="submit" id="joinCheckSubmit" disabled >


            </form>
            
            



        </div>
	</div>
</div>

    <c:import url="../template/footer.jsp"></c:import>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
    
    <script src="/resources/js/board.js"></script>
</body>
</html>