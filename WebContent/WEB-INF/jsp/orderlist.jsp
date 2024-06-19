<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KyoronP</title>
<link rel="stylesheet" href="/B3/css/common.css">
<link rel="stylesheet" href="/B3/css/orderlist.css">
<style>
* {
	outline: 1px solid #FF0000;
}
</style>
</head>
<body>

	<header id="header">
		<img src="img/logo.png" alt="logo">
		<div id="hmb">
			<span></span> <span></span> <span></span>
		</div>
		<nav>
			<ul>
				<li><a href=home.html>ホーム</a></li>
				<li><a href=regist.html>お客様情報登録</a></li>
				<li><a href=search.html>お客様検索</a></li>
				<li><a href=login.html>ログアウト</a></li>
			</ul>
		</nav>
	</header>
	<main>
		<!-- お客様発注リストの枠組 開始 -->

		<div class="box">
			<div class="arrange">
				<div class="items">


					<!-- お客様の名前欄 -->
					<img src="img/Owaku.png">

					<!-- 内装 -->
					<img src="img/Ointerior.png">

					<!-- 衣装 -->
					<img src="img/Ocostume.png">

					<!-- ケーキ -->
					<img src="img/Ocake.png">

					<!-- カード -->
					<img src="img/Ocard.png">

					<!-- その他 -->
					<img src="img/Oothers.png">

				</div>
			</div>
		</div>
		<!-- お客様発注リストの枠組 終了 -->
		<!-- モーダルウインドウ 開始 -->

		<!-- モーダルウインドウ 終了 -->

	</main>
	<footer>
		<p class="copyright">Copyright KyoronP. All rights reserved.</p>
	</footer>
	<script>
		const hmbBtn = document.getElementById("hmb");
		const header = document.getElementById("header");
		hmbBtn.addEventListener("click", function() {
			header.classList.toggle("active");
		});
	</script>
</body>
</html>