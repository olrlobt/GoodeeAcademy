<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<ul>
			<li><a href="/bankbook/list">상품 리스트</a></li>
			<li><a href="/board/list">게시판</a></li>
			<li><a href="/member/login">로그인</a></li>
			<li><a href="/member/join">회원가입</a></li>
		</ul>

	</div>

	<form action="login" method="post">
		<div>
		ID를 입력 : <input type="text" value="AA" name="user_name">
		</div>
		<div>
		비밀번호를 입력 : <input type="password" value="aa" name="password">
		</div>
		<input type="submit" value="로그인">
	</form>

</body>
</html>