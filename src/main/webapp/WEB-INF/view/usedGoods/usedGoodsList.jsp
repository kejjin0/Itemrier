<!-- 중고거래 상품 리스트 페이지 + 검색기능 -->
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Itemrior</title>
        <link rel="stylesheet" href="../css/reset.css">
        <link rel="stylesheet" type="text/css" href="../css/gpList.css">
    </head>
    <body>
        <header id="header">
            <h1>Itemrior - 중고거래</h1>
            <form action="/search" method="get">
                <input type="text" name="q" placeholder="공동구매 상품을 검색하세요.">
                <button type="submit">검색</button>
              </form>
            <nav class="cat">
                <p>카테고리</p>
            </nav>
        </header>
        
        <hr> 
        <p class="order"><a href="#">최신 등록 순</a></p>
        <main>
            <div class="product-card">
                <a href=""><img src="../img/product.jpg" alt="Product 1" class="product-image"></img></a>
                <p>Product 1</p>
            </div>
            <div class="product-card">
                <a href=""><img src="../img/product.jpg" alt="Product 2" class="product-image"></a>
                <p>Product 2<p>
            </div>
            <div class="product-card">
                <a href=""><img src="../img/product.jpg" alt="Product 3" class="product-image"></a>
                <p>Product 3<p>
            </div>
            <div class="product-card">
                <a href=""><img src="../img/product.jpg" alt="Product 4" class="product-image"></a>
                <p>Product 4<p>
            </div>
            <div class="product-card">
                <a href=""><img src="../img/product.jpg" alt="Product 5" class="product-image"></a>
                <p>Product 5<p>
            </div>
            <div class="product-card">
                <a href=""><img src="../img/product.jpg" alt="Product 6" class="product-image"></a>
                <p>Product 6<p>
            </div>
        </main>
        
        <footer>
            <p>&copy; Itemrior 잇템리어 </p>
        </footer>
    </body>
    </html>