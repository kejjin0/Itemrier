<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>경매 물품 구매자(배송 등)</title>
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
	
	.orders{
		border-collapse: collapse;
		border: 1px solid black;
		margin: 10px;
		width: 85%;
		font-size: 18px;
		text-align: center;
	}
	
	tr{
		height: 40px;
	}
	
	th, td{
		border: 1px solid black;
	}

	button{
		width: 150px;
		height: 30px;
		background-color: #add8e6;
	}
	
	.update{
		font-size: 20px;
		line-height: 35px;
		text-indent: 65px;
	}
</style>
<body>
	<div class="myPageUsedGoods">
		<jsp:include page="../../myPage.jsp" />
		<div class="itemList">
			<div class="title">
				<br>경매 물품 구매자(배송 등)<br>
			</div>
			<div class="item">
				<table class="orders">
					<tr>
						<th>id</th>
						<th>성함</th>
						<th>전화번호</th>
						<th>주소</th>
						<th>송장번호</th>
					</tr>
					<tr>
						<td>id</td>
						<td>성함</td>
						<td>전화번호</td>
						<td>주소(zipCode 등)</td>
						<td>송장번호</td>
					</tr>
				</table>
				<br>
				<div class="update">
					id : <input type="text"> <br>
					송장번호 : <input type="text"> <br>
					<button>송장번호 입력</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>