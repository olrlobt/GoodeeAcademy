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
	<h1>this is detail page</h1>
	
	<table border="1">
		<thead></thead>
		<tbody>
				<tr>
					<td>${detail.bookNum}</td>
					<td>${detail.bookName}</td>
					
					<td>${detail.bookRate}</td>
					<td>${detail.bookSale}</td>
					
				</tr>
		</tbody>
	
	
	
	</table>
	
	
	<a href="./delete?bookNum=${detail.bookNum}"> Delete </a>
	<a href="./update?bookNum=${detail.bookNum}"> Update </a>
<!-- comment -->
	<div class="row">
		<div class="mb-3 mt-4">
	    	<label class="form-label" for="writer">Wirter</label>
			<textarea class="form-control" id="writer" rows="3"></textarea>
    	</div>
		<div class="mb-3 mt-4">
	    	<label class="form-label" for="contents">Contents</label>
			<textarea class="form-control" id="contents" rows="3"></textarea>
    	</div>
		<div class="mb-3">
		<button type="button" id = "commentBtn" data-booknum = "${detail.bookNum}">댓글작성</button>
		</div>
	</div>
<!-- /comment -->


<!-- commentList -->

	<div id = commentSector>
		<table  class="table" >
			<tbody id = "commentList" class = "table-striped table-hover">



			</tbody>
		</table>
	</div>
	<button id = "moreBtn" class="btn btn-danger">더 보기</button>

<!-- /commentList -->

<button type="button" class="btn btn-primary" style="display: none;" id="up" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@getbootstrap">Open modal for @getbootstrap</button>

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Update</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <form>
			<input type="hidden" id = "num">
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Wirter:</label>
            <input type="text" class="form-control" id="updateWriter">
          </div>
          <div class="mb-3">
            <label for="message-text" class="col-form-label">Contents:</label>
            <textarea class="form-control" id="updateContents"></textarea>
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" id = "updateBtn" data-bs-dismiss="modal">Update</button>
      </div>
    </div>
  </div>
</div>


</div></div></div>
	
	
	
	<c:import url="../template/footer.jsp"></c:import>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	<script src="/resources/js/bankbookComment.js"></script>
</body>
</html>