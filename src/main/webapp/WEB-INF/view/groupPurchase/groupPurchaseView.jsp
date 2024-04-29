<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>공동구매 상품 정보</title>
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
    input{
        margin-right: 50px;
    }
</style>
</head>
<body>
	<center>
	    <h1>공동구매 상품 정보</h1>
	    
	    <table>
	        <tr>
	            <td rowspan="6">
	                사진
	            </td>
	        </tr>
	        <tr>
	            <td>제목</td>
	        </tr>
	        <tr>
	            <td>가격</td>
	        </tr>
	        <tr>
	            <td>남은 수량</td>
	        </tr>
	        <tr>
	            <td>카테고리</td>
	        </tr>
	        <tr>
	            <td>마감일</td>
	        </tr>
	        <tr>
	            <td colspan="2" class="btnSize">
	                <input type="submit" value="결제하기">
	                <input type="submit" value="장바구니">
                    <!-- 상품 찜 추가 -->
	                <input type="submit" value="찜">
	            </td>
	        </tr>
	    </table>
	</center>

	<hr>

	<h4>상품 정보</h4>
	<div>
	    상품 정보 내용
	</div>
	
    <!-- 관련 상품 추천 -->
    <div class="rec">
        <p>비슷한 상품 추천</p>
        <img src="../img/product.jpg" alt="상품1" style="width: 300px; height: auto; padding: 20px 30px;">
        <img src="../img/product.jpg" alt="상품2" style="width: 300px; height: auto; padding: 20px 50px;">
        <img src="../img/product.jpg" alt="상품3" style="width: 300px; height: auto; padding: 20px 50px;">
    </div>
</body>
</html>