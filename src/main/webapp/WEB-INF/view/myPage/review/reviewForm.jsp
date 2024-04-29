<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰</title>
</head>
<style>
.myPageUsedGoods {
	display: flex;
}

.cancelItem {
	float: rigth;
	margin-top: 10px;
	margin-left: 30px;
	flex-grow: 1;
}

.title {
	background-color: #fff0f5;
	font-size: 25px;
	font-weight: bold;
	height: 10%;
	border-radius: 20px;
	padding-left: 30px;
}

.item {
	margin-left: 38%;
	margin-top: 40px;
	width: 480px;
	height: 550px;
	background-color: #f0f8ff;
	border-radius: 10px;
}

table {
	border: 1px solid gray;
	margin: 15px;
	border-radius: 30px;
	height: 250px;
	width: 450px;
}

td {
	width: 50%;
}

img {
	margin: 20px;
}

button {
	width: 150px;
	height: 40px;
	background-color: #add8e6;
	border-radius: 10px;
}

.update {
	font-size: 20px;
	line-height: 35px;
	margin-top: 20px;
	text-align:center;
	border-radius: 10px;
	width: 300px;
	height: 300px;
	margin-left: 75px;
}

.userId {
	height: 30px;
}
</style>
<body>
	<div class="myPageUsedGoods">
		<jsp:include page="../myPage.jsp" />
		<div class="cancelItem">
			<div class="title">
				<br>리뷰<br>
			</div>
			<div class="item">
				<table>
					<tr>
						<td rowspan="3"><img src="https://placehold.co/180" /></td>
						<td>상품 이름</td>
					</tr>
					<tr>
						<td>$가격</td>
					</tr>
					<tr>
						<td>날짜</td>
					</tr>
				</table>
				<div class="update">
					<br>
					총 만족도 
					<select>
						<option value="1">★☆☆☆☆</option>
						<option value="2">★★☆☆☆</option>
						<option value="3">★★★☆☆</option>
						<option value="4">★★★★☆</option>
						<option value="5">★★★★★</option>
					</select><br>
					답변 속도
					<select>
						<option value="1">★☆☆☆☆</option>
						<option value="2">★★☆☆☆</option>
						<option value="3">★★★☆☆</option>
						<option value="4">★★★★☆</option>
						<option value="5">★★★★★</option>
					</select> <br>
					시간 약속
					<select>
						<option value="1">★☆☆☆☆</option>
						<option value="2">★★☆☆☆</option>
						<option value="3">★★★☆☆</option>
						<option value="4">★★★★☆</option>
						<option value="5">★★★★★</option>
					</select><br><br>
					<button>리뷰 작성</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>