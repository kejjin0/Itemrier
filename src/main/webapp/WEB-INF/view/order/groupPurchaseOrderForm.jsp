<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공동 구매 주문</title>
</head>
<style>
.title {
	background-color: #fff0f5;
	font-size: 25px;
	font-weight: bold;
	height: 100px;
	border-radius: 20px;
	padding-left: 30px;
	text-align: center;
}

.info {
	display: flex;
	justify-content: center;
}

.write {
	height: 100%;
	margin: 50px;
	padding: 50px;
}

.orderForm {
	font-size: 20px;
	width: 700px;
	height: 500px;
}

textarea {
	height: 100px;
	width: 500px;
	border: 1px solid gray;
	resize: none;
}

.longInfo {
	height: 150px;
	width: 400px;
}

.smallText {
	width: 250px;
	height: 30px;
}

.item {
	widtd: 600px;
	margin: 50px;
	background-color: #f8f8ff;
	padding: 50px;
	border-radius: 10px;
}

.itemTable {
	border: 1px solid gray;
	margin: 10px;
	border-radius: 30px;
	height: 250px;
	width: 450px;
}

img {
	margin: 20px;
}

button {
	width: 150px;
	height: 60px;
	border-radius: 10px;
	background-color: #add8e6;
	font-size: 18px;
	margin-top: 200px;
}

td {
	width: 250px;
}
</style>
<body>
	<div class="title">
		<br>공동 구매 주문<br>
	</div>
	<div class="info">
		<div class="write">
			<table class="orderForm">
				<tr>
					<td>주문자</td>
					<td>&nbsp;<input type="text" class="smallText"></td>
				</tr>
				<tr>
					<td>우편번호</td>
					<td>&nbsp;<input type="text" class="smallText"></td>
				</tr>
				<tr>
					<td rowspan="2">주소<br></td>
					<td>&nbsp;<input type="text" class="smallText" placeholder="건물명"></td>
				</tr>
				<tr>
					<td>&nbsp;<input type="text" class="smallText" placeholder="상세 주소"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td>&nbsp;<input type="text" class="smallText"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>&nbsp;<input type="text" class="smallText"></td>
				</tr>
				<tr>
					<td>배송 위치</td>
					<td>&nbsp;<input type="text" class="smallText"></td>
				</tr>
				<tr class="longInfo">
					<td>배송 요청 사항</td>
					<td><textarea id="longinput"></textarea></td>
				</tr>
			</table>
		</div>
		<div class="item">
			<table class="itemTable">
				<tr>
					<td rowspan="3"><img src="https://placehold.co/180" /></td>
					<td>상품 이름</td>
				</tr>
				<tr>
					<td>$가격</td>
				</tr>
				<tr>
					<td>판매자</td>
				</tr>
			</table>
			<button>결제</button>
		</div>
	</div>
</body>
</html>