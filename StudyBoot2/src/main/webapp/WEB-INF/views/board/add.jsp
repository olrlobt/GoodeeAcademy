<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> 집 가고 싶다</title>
		
		<link href="/css/board.css" rel="stylesheet">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.css">
		
		<link rel="stylesheet" href="/css/summernote/summernote-lite.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
   

	<section class="container-fluid container-lg-8 mt-5">
			<div class = "row justify-content-center mt-5">
				<div class = "col-lg-7 shadowBox" style="padding: 20px;">
		
					<hr>
					<form action="./add" method="post" id = "boardForm"  enctype="multipart/form-data">
					<input type="hidden" value="${update.boardNum }"  id="boardNum" name="boardNum" class="form-control" >
						        
					
					<table class = "table">
						<thead>
						</thead>
						
						<tbody>
							<tr>
								<td colspan="2">
						        	<input type="text" value="${update.title }"  id="title" name="title" class="form-control" placeholder="제목을 입력해 주세요." required>
						        	<input type="text" value="${member.writer }"  id="userId" name="writer"   class="form-control" placeholder="작성자" required>
						        </td>
							</tr>
							
							<tr>
								<td colspan="2"><textarea   id="summernote" name="contents"></textarea></td>
							</tr>
							
							<tr>
								<th width="100px"><p id = "addFileBtn" >파일추가</p></th>
							
								<td>
									<div id = "fileInputDiv" title = "${updateSize }">
									<!-- 파일선택 input -->
										<c:forEach items="${update.boardFileDTOs }" var="file" varStatus="status">
										<c:if test="${not file.sort}">
											<div></div>
											<label for="file${status.count }">${file.fileName }</label>
											<input type="file" id="file${status.count }" value="${file}" name="file" class="form-control boardFile hideBoardFile" title="${status.count }">
											<span class="boardFileDelete" title="${status.count }">❌</span>
											
										</c:if>
										</c:forEach>
									
									</div>
								</td>
								
								
							</tr>
						</tbody>
					</table>
					<div class = "addboardBtnDiv">
							<c:choose>
								<c:when test="${empty update }">
									<button id="boardBtn" class="boardBlueBtn floatRight" type="button" title = "add">게시</button>
								</c:when>
								<c:otherwise>
									<button id="boardBtn" class="boardBlueBtn floatRight" type="button" title = "update">수정</button>
								</c:otherwise>
								
							</c:choose>
						</div>
				</form>
						
							
			</div>
		</div>
	</section>
	

	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
   
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
   	<script src="/js/summernote/summernote-lite.js"></script>
	<script src="/js/summernote/lang/summernote-ko-KR.js"></script>
	<script src="/js/board.js"></script>
   	<script type="text/javascript">
   	verify();
   		board();
   		fileJs();
   		$(document).ready(function() {
   			
   			var toolbar = [
   				    // 글꼴 설정
   				    ['fontname', ['fontname']],
   				    // 글자 크기 설정
   				    ['fontsize', ['fontsize']],
   				    // 굵기, 기울임꼴, 밑줄,취소 선, 서식지우기
   				    ['style', ['bold', 'italic', 'underline','strikethrough', 'clear']],
   				    // 글자색
   				    ['color', ['forecolor','color']],
   				    // 표만들기
   				    ['table', ['table']],
   				    // 글머리 기호, 번호매기기, 문단정렬
   				    ['para', ['ul', 'ol', 'paragraph']],
   				    // 줄간격
   				    ['height', ['height']],
   				    // 그림첨부, 링크만들기, 동영상첨부
   				    ['insert',['picture','link','video']],
   				    // 코드보기, 확대해서보기, 도움말
   				    ['view', ['codeview','fullscreen', 'help']]
   				  ];

   			var setting = {
   		            height : 500,
   		            minHeight : null,
   		            maxHeight : null,
   		            focus : true,
   		            lang : 'ko-KR',
   		            toolbar : toolbar,
   		            callbacks : { //여기 부분이 이미지를 첨부하는 부분
   		            onImageUpload : function(files, editor,
   		            welEditable) {
   		            for (var i = files.length - 1; i >= 0; i--) {
   		            uploadSummernoteImageFile(files[i],
   		            this);
   		            		}
   		            	}
   		            }
   		         };

   		        $('#summernote').summernote(setting);
   		     $('#summernote').summernote('pasteHTML', '${update.contents}');
   		        });
   		
   		
   		function uploadSummernoteImageFile(file, el) {
			data = new FormData();
			data.append("file", file);
			$.ajax({
				data : data,
				type : "POST",
				url : "uploadSummernoteImageFile",
				contentType : false,
				enctype : 'multipart/form-data',
				processData : false,
				success : function(data) {
					$(el).summernote('editor.insertImage', data.url);
				}
			});
		}
   	</script>
   
</body>
</html>