<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KyoronP</title>
<link rel="stylesheet" href="/B3/css/common.css">
<link rel="stylesheet" href="/B3/css/orderlist.css">
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

	<div class="box">
		<div class="arrange">
			<div class="items">


				<!-- お客様の名前欄 -->
				<h2 class="index">お客様の名前</h2>

				<!-- 内装 -->
				<img src="/B3/img/Ointerior.png">

				<!-- 衣装 -->
				<img src="/B3/img/Ocostume.png">

				<!-- ケーキ -->
				<img src="/B3/img/Ocake.png">

				<!-- カード -->
				<img src="/B3/img/Ocard.png">

				<!-- その他 -->
				<img src="/B3/img/Oothers.png">

			</div>
		</div>
	</div>

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