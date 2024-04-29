<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>공동구매 상품 등록</title>
<style>
    table {
        width: 1000px; 
        height: 800px;
        border-collapse: collapse;
    }
    th, td {
        border: 1px solid black;
        padding: 8px; 
        text-align: center; 
    }
    .imgSize {
        padding: 70px 0;
    }
</style>
</head>
<body>
	<center>
        <h1>공동구매 상품 등록</h1>

        <form action="" method="post">
            <table border="1">
                <tr>
                    <td class="imgSize">상품 사진</td>
                    <td></td>
                </tr>
                <tr>
                    <td>제목(상품명)</td>
                    <td><input type="text" placeholder="등록할 제목을 입력하세요"></td>
                </tr>
                <tr>
                    <td>상품 정보</td>
                    <td><input type="text" placeholder="상품 정보를 입력해주세요"></td>
                </tr>
                <tr>
                    <td>등록 가격</td>
                    <td>
                        <input type="number" placeholder="등록 가격을 입력하세요" min="0">
                        <span>원</span>
                    </td>
                </tr>
                <tr>
                    <td>목표 수량</td>
                    <td>
                        최대: <input type="number" pattern="[0-9]*" min="0">
                        <span>개</span> <br>
                        최소: <input type="number" pattern="[0-9]*" min="0">
                        <span>개</span>
                    </td>
                </tr>
                <tr>
                    <td>카테고리</td>
                    <td>
                        <select id="category">
                            <option value="가구">가구</option>
                            <option value="생활용품">생활용품</option>
                            <option value="주방용품">주방용품</option>
                            <option value="조명">조명</option>
                            <option value="수납/정리">수납/정리</option>
                            <option value="벽지">벽지</option>
                        </select>
                        <select id="subcategory">
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>마감일</td>
                    <td>        
                        <input type="date">
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="등록하기"></td>
                </tr>
            </table>
        </form>
    </center>

    <script>
        function updateSubCategory() {
            var ctg = document.getElementById("category").value;
            var subctg = document.getElementById("subcategory");

            subctg.innerHTML = "";

            if (ctg === "가구") {
                subctg.innerHTML = `
                <option value="침실 가구">침실 가구</option>
                <option value="거실 가구">거실 가구</option>
                <option value="방 가구">방 가구</option>
                `;
            }
        }
        document.getElementById("category").addEventListener("change", updateSubCategory);

        updateSubCategory();
    </script>
</body>
</html>