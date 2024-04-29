<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link href="style/joinForm.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<div class="joinFormContainer">
		<form>
			아이디<br />
			<input type="text" name="email" />
			<br />
			비밀번호<br />
			<input type="text" name="pwd" />
			<br />
			비밀번호 확인<br />
			<input type="text" name="pwdcheck" />
			<p />
			이름<br />
			<input type="text" name="name" />
			<br />
			핸드폰 번호<br />
			<input type="text" name="phoneNum" />
			<br />		
			닉네임<br />
			<input type="text" name="nickName" />
			<br />
			주소<br />
			<input type="text" name="address.address1" />
			<br />
			<input type="text" name="address.address2" />
			<br />
			<input type="text" name="address.zipcode" />
			<br />
		
			<input type="submit" value="수정" />
		</form>
	</div>
</body>
</html>