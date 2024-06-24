<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--taglibディレクティブ Coreタグライブラリを使うなら書く--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KyoronP</title>
<link rel="stylesheet" href="/B3/css/common.css">
<link rel="stylesheet" href="/B3/css/search.css">
</head>
<body>
<header id ="header">
  <a href=/B3/HomeServlet><img src="img/logo.png" alt="logo" height="100" width="150"></a>
  <div id="hmb">
    <span></span>
    <span></span>
    <span></span>
  </div>
  <nav>
    <ul>
      <li><a href=/B3/HomeServlet>ホーム</a></li>
      <li><a href=/B3/RegistServlet>お客様情報登録</a></li>
      <li><a href=/B3/SearchServlet>お客様情報検索</a></li>
      <li><a href=/B3/LogoutServlet>ログアウト</a></li>
    </ul>
  </nav>
</header>
<main class="main">
	<h1>お客様情報検索結果</h1>

		<form method="post" action="/B3/MypageServlet" onSubmit="return check()">
			<table class="cards" id="card">
				<tr>
					<td class="card">
						<img src="img/pin.png" alt="pin" id="pin1" class="pin">
						<a href=/B3/MypageServlet>
							<input type="text" name="fname_1" value="${e.fname_1 }" class="card_name">様<br>
							<input type="text" name="fname_2" value="${e.fname_2 }" class="card_name">様
						</a>
					</td>
					<td class="card">
						<img src="img/pin.png" alt="pin" id="pin2" class="pin">
						<a href=/B3/MypageServlet>
							<input type="text" name="fname_1" value="${e.fname_1 }" class="card_name">様<br>
							<input type="text" name="fname_2" value="${e.fname_2 }" class="card_name">様
						</a>
					</td>
					<td class="card">
						<img src="img/pin.png" alt="pin" id="pin3" class="pin">
						<a href=/B3/MypageServlet>
							<input type="text" name="fname_1" value="${e.fname_1 }" class="card_name">様<br>
							<input type="text" name="fname_2" value="${e.fname_2 }" class="card_name">様
						</a>
					</td>
				</tr>
			</table>

			<c:if test="${empty customerList}">
				<p>一致するお客様情報はありませんでした</p>
			</c:if>

			<c:forEach var="e" items="${customerList}">
				<div class="customer_info">
					<a href=/B3/MypageServlet>
						<input type="text" name="thedate" value="${e.thedate}" class="thedate_info"><br>
						<input type="text" name="lname_1" value="${e.lanme_1 }" class="lname_info"><input type="text" name="fname_1" value="${e.fanme_1 }" class="fname_info">様<br>
						<input type="text" name="lname_2" value="${e.lanme_2 }" class="lname_info"><input type="text" name="fname_2" value="${e.fanme_2 }" class="fname_info">様
					</a>
				</div>
			</c:forEach>
		</form>



</main>
<footer>
  <p class="copyright">Copyright KyoronP. All rights reserved.</p>
</footer>
<script src="/B3/js/result.js"></script>
<script>
  const hmbBtn=document.getElementById("hmb");
  const header=document.getElementById("header");
  hmbBtn.addEventListener("click",function(){header.classList.toggle("active");
  });
</script>
</body>
</html>

	<!--<style>* {outline: 1px solid #FF0000;}</style>-->