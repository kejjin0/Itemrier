<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>입찰</title>
<style>
    table {
        width: 480px;
        height: 100px;
        margin-bottom: 100px;
    }
    table td {
        padding-left: 40px;
    }
    hr {
        width: 500px;
    }
</style>
</head>
<body>
	<center>
		<form action="" method="post">
		    <table>
		        <h4>경매 상품</h4><hr>
		        <tr>
		            <td>상품명</td>
		            <td>상품명</td>
		        </tr>
		        <tr>
		            <td>남은 시간</td>
		            <td>3일 6시간 30분</td>
		        </tr>
		    </table>
		
		    <table>
		        <h4>입찰하기</h4><hr>
		        <tr>
		            <td>현재가</td>
		            <td>14000원</td>
		        </tr>
		        <tr>
		            <td>입찰금액</td>
		            <td>
		                <input type="number" placeholder="입찰 가격을 입력하세요" min="0">
		                <span>원</span>
		            </td>
		        </tr>
		    </table>
		
		    <input type="submit" value="입찰하기">
		</form>
	</center>
</body>
</html>