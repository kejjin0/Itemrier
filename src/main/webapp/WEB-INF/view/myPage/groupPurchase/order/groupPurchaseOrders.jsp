<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구매한 공동구매 물품</title>
</head>
<style>
	.myPageUsedGoods{
		display: flex;
	}
	
	.itemList{
		float: rigth;
		margin-top: 10px;
		margin-left: 30px;
		flex-grow:1;
	}
	
	.title{
		background-color: #fff0f5;
		font-size: 25px;
		font-weight: bold;
		height: 10%;
		border-radius: 20px;
		padding-left: 30px; 
	}
	
	.item{
		margin-left: 10px;
		margin-top: 40px;
	}
	
	table{
		border: 1px solid gray;
		margin: 10px;
		border-radius: 30px;
		height: 250px;
		width: 450px;
	}
	
	td{
		width : 50%;
	}
	
	img{
		margin: 20px;
	}
	
</style>
<body>
	<div class="myPageUsedGoods">
		<jsp:include page="../../myPage.jsp" />
		<div class="itemList">
			<div class="title">
				<br>공동구매 내역<br>
			</div>
			<div class="item">
				<table>
					<tr>
						<td rowspan="6"><img src="https://placehold.co/180"/></td>
						<td> </td>
					</tr>
					<tr>
						<td>상품 이름</td>
					</tr>
					<tr>
						<td>$가격</td>
					</tr>
					<tr>
						<td>판매자</td>
					</tr>
					<tr>
						<td>날짜</td>
					</tr>
					<tr>
						<td> </td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>