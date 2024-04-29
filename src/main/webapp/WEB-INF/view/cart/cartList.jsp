<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>장바구니</title>
<style>
	table {
	    width: 900px;
	    height: 150px;
	    border-collapse: collapse;
	}
	th, td {
	    border: 1px solid black;
	    padding: 15px;
	    text-align: center;
	}
	.img {
	    width: 200px;
	    height: 170px;
	}
	.remove {
	    width: 80px;
	}
	hr {
	    margin-top: 35px;
	}
</style>
</head>
<body>
<center>
	<h1>장바구니</h1>
	
	<table>
	    <tr>
	        <td rowspan="5" class="img">사진</td>
	        <td>제목</td>
	        <td rowspan="5" class="remove"><input type="submit" value="삭제"></td>
	    </tr>
	    <tr>
	    </tr>
	    <tr>
	        <td>개수</td>
	    </tr>
	    <tr>
	        <td>총가격</td>
	    </tr>
	</table>
	
	<table>
	    <tr>
	        <td rowspan="5" class="img">사진</td>
	        <td>제목</td>
	        <td rowspan="5" class="remove"><input type="submit" value="삭제"></td>
	    </tr>
	    <tr>
	    </tr>
	    <tr>
	        <td>개수</td>
	    </tr>
	    <tr>
	        <td>총가격</td>
	    </tr>
	</table>
	
	<hr>
	
	<div>
	    <h2>총 가격: 23000 원</h2>
	    <form action="" method="post">
	        <input type="submit" value="결제하기">
	    </form>
	</div>
	</center>
</body>
</html>