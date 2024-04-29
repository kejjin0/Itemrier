<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 완료</title>
</head>
<style>
	.myPageUsedGoods{
		display: flex;
	}
	
	.cancelItem{
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
		margin-left: 35%;
		margin-top: 40px;
		width: 450px;
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
	
	button{
		width: 150px;
		height: 30px;
		background-color: #add8e6;
	}
	
	.info{
		text-align: center;
	}
	
</style>
<body>
	<div class="myPageUsedGoods">
		<jsp:include page="../myPage.jsp" />
		<div class="cancelItem">
			<div class="title">
				<br>주문 완료<br>
			</div>
			<div class="item">
				<table>
					<tr>
						<td rowspan="3"><img src="https://placehold.co/180"/></td>
						<td>상품 이름</td>
					</tr>
					<tr>
						<td>$가격</td>
					</tr>
					<tr>
						<td>판매자</td>
					</tr>
				</table>
				<div class="info">
				결제가 완료되었습니다.
				</div>
			</div>
		</div>
	</div>
</body>
</html>