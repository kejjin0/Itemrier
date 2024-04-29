<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>경매 상품 정보</title>
<style>
	table {
	    width: 800px;
	    border-collapse: collapse;
	}
	th, td {
	    border: 1px solid black;
	    padding: 25px;
	    text-align: center;
	}
	hr {
	    margin-top: 30px;
	}
</style>
</head>
<body>
	<center>
		<h1>경매 상품 정보</h1>
		
		<table>
		    <tr>
		        <td rowspan="8">사진</td>
		    </tr>
		    <tr>
		        <td>제목</td>
		    </tr>
		    <tr>
		        <td>현재가</td>
		    </tr>
		    <tr>
		        <td>입찰수</td>
		    </tr>
		    <tr>
		        <td>남은 시간</td>
		    </tr>
		    <tr>
		        <td>상품 상태</td>
		    </tr>
		    <tr>
		        <td>카테고리</td>
		    </tr>
		</table>
		
		<p/>
		
		<button onclick="openBidForm()">입찰하기</button>
		</center>
		
		<hr>
		
		<h4>상품 정보</h4>
		<div>
		    상품 정보 내용 <br>
		    연락 수단: 
		</div>
		
		<hr>
		
		<h4>상품 정보</h4>
		<table>
		    <tr>
		        <th>입찰자 닉네임</th>
		        <th>입찰일자</th>
		        <th>입찰가격</th>
		    </tr>
		    <tr>
		        <td>닉네임1</td>
		        <td>2024-3-20 00:00:00</td>
		        <td>14000원</td>
		    </tr>
		    <tr>
		        <td>닉네임2</td>
		        <td>2024-3-12 00:00:00</td>
		        <td>12000원</td>
		    </tr>
		</table>
		
		<script>
		function openBidForm() {
		    window.open("bidForm.html", "입력 창", "width=600, height=600");
		}
		</script>
</body>
</html>