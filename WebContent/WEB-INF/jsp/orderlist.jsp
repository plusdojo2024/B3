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

		<div class="boxA">
			<div class="arrange">
				<div class="items">


					<!-- お客様の名前欄 -->
					<img src="img/Owaku.png">

					<!-- 内装 -->
					<img src="img/Ointerior.png">

					<!-- 衣装 -->
					<img src="img/Ocostume.png" alt="衣装" class="photo"
						data-modal-target="modal2">

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


		<div id="modal2" class="modal">
			<div class="modal-content">
				<span class="close">&times;</span>
				<!-- 大枠 -->
				<div class="box2">
					<!-- タイトル -->
					<div class="box3">
						<p>衣装</p>
					</div>
					<!-- 項目 -->
					<input type="checkbox" id="check" value="clothing"  checked><label
						for="check"></label>
					<form>



						<div class="box4">
							<img src="" alt="シミュレーションの画像を取得">
						</div>
						<div class="container">
							<div class="box box5">
								<label> 商品名 <input type="text" name="name">
								</label>
							</div>
						</div>
						<div class="container">
							<div class="box box5">
								<label> 値段 <input type="text" name="price">
								</label>
							</div>
							<div class="box box5">
								<label> 個数 <input type="text" name="number">
								</label>
							</div>
						</div>
						<div class="container">
							<div class="left box5">
								<label> 期限（手入力） <input type="date" name="ded">
								</label>
							</div>
						</div>
						<!-- 期日カウントダウン -->
					</form>
				</div>
				<input type="submit" name="save" value="保存">
			</div>
		</div>


		<!-- モーダルウインドウ 終了 -->

	</main>
	<footer>
		<p class="copyright">Copyright KyoronP. All rights reserved.</p>
	</footer>
	<script>

	 const hmbBtn=document.getElementById("hmb");
	  const header=document.getElementById("header");
	  hmbBtn.addEventListener("click",function(){header.classList.toggle("active");
	  });



	document.addEventListener("DOMContentLoaded", function() {
	    const photos = document.querySelectorAll(".photo");
	    const modals = document.querySelectorAll(".modal");

	    photos.forEach(photo => {
	        photo.addEventListener("click", function() {
	            const modalId = this.getAttribute("data-modal-target");
	            const modal = document.getElementById(modalId);

	            if (modal) {
	                modal.style.display = "block";
	                modal.querySelector(".close").addEventListener("click", function() {
	                    modal.style.display = "none";
	                });
	            }
	        });
	    });
	});


	</script>
</body>
</html>