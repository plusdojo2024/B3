<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KyoronP</title>
<link rel="stylesheet" href="/B3/css/common.css">
<link rel="stylesheet" href="/B3/css/orderlist.css">
<!--  <style>
* {
	outline: 1px solid #FF0000;
}
</style>-->
<script src="/B3/js/oredlist.js"></script>
</head>
<body>

	<header id="header">
		<a href="MypageServlet"><img src="img/logo.png" alt="logo"
			height="100" width="150"></a>
		<div id="hmb">
			<span></span> <span></span> <span></span>
		</div>
		<nav>
			<ul>
				<li><a href="MypageServlet">マイページ</a></li>
				<li><a href="UpdateServlet">お客様情報編集</a></li>
				<li><a href="OrderlistServlet">発注リスト</a></li>
				<li><a href="TodaylistServlet">当日リスト</a></li>
				<li><a href="SimulationServlet">シミュレーション</a></li>
				<li><a href="ReportServlet">報告書作成</a></li>
				<li><a href="SurveyServlet">式後アンケート</a></li>
				<li><a href="SerchServlet">お客様変更</a></li>
				<li><a href="LogoutServlet">ログアウト</a></li>
			</ul>
		</nav>
	</header>
	<main>
		<!-- お客様発注リストの枠組 開始 -->

		<div class="boxA">
			<div class="arrange">
				<div class="items">

					<div class="polo">
						<p style="font-size: xx-large; color: white; text-align: center;">
							剛史様<br> ＆<br> 沙織様
						</p>

					</div>
					<!-- お客様の名前欄 -->
					<img src="img/Owaku.png">

					<!-- 内装 -->
					<img src="img/Ointerior.png" class="photo"
						data-modal-target="modal1">

					<!-- 衣装 -->
					<img src="img/Ocostume.png" alt="衣装" class="photo"
						data-modal-target="modal2">

					<!-- ケーキ -->
					<img src="img/Ocake.png" class="photo" data-modal-target="modal3">

					<!-- カード -->
					<img src="img/Ocard.png" class="photo" data-modal-target="modal4">

					<!-- その他 -->
					<img src="img/Oothers.png" class="photo" data-modal-target="modal5">

				</div>
			</div>
		</div>
		<!-- お客様発注リストの枠組 終了 -->
		<!-- モーダルウインドウ 内装 開始 -->


		<div id="modal1" class="modal">
			<div class="modal-content">
				<span class="close">&times;</span>
				<!-- 大枠 -->
				<div class="box2">
					<!-- タイトル -->
					<div class="box3">
						<p>内装</p>
					</div>
					<!-- 項目 -->

					<div class="box4">
						<img src="img/napkin_pink.png" alt="シミュレーションの画像を取得" width="220px"
							height="150px">
					</div>

					<form class="fo1">

						<div class="container">

							<label> <input type="text" name="name" value="ナプキンピンク">
							</label>

						</div>

						<div class="container">

							<label> <input type="text" name="price" value="200円">
							</label> <label> <input type="text" name="number" value="100個">
							</label>

						</div>

						<div class="container">

							<label for="ded"></label> <input type="date" id="ded" name="ded"
								onchange="calculateRemainingDays()"> <br> <label>
								<input type="checkbox" id="check" name="myCheckbox"
								onchange="toggleRemainingDays()">
							</label> <br> <span id="event_name"></span> <span id="days"></span>
						</div>
						<!-- 期日カウントダウン -->
					</form>




					<!-- 項目ここまで -->
					<!-- 項目 -->

					<input type="checkbox" id="checka" value="clothing">
					<div class="box7">
						<img src="img/flower_blue.png" alt="シミュレーションの画像を取得">
					</div>

					<form class="fo2">




						<div class="container">

							<label> <input type="text" name="name" value="花　ブルー">
							</label>

						</div>

						<div class="container">

							<label> <input type="text" name="price" value="1000円">
							</label> <label> <input type="text" name="number" value="10個">
							</label>

						</div>

						<div class="container">

							<label for="ded2"> <input type="date" id="ded2"
								onchange="calculateRemainingDays()"></label>
							<p>
								<span id="event_name"></span><span id="days"></span>
							</p>
						</div>
						<!-- 期日カウントダウン -->
					</form>

				</div>
			</div>
			<input type="submit" name="save" value="保存">



			<!-- 項目ここまで -->

		</div>
		<!-- モーダルウインドウ 終了 -->
		<!-- モーダルウインドウ 衣装 開始 -->


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
					<input type="checkbox" id="check" value="clothing" checked><label
						for="check"></label>

					<div class="box4">
						<img src="" alt="シミュレーションの画像を取得">
					</div>

					<form>




						<div class="container">

							<label> 商品名 <input type="text" name="name">
							</label>

						</div>
						<div class="container"></div>
						<div class="container">

							<label> 値段 <input type="text" name="price">
							</label> <label> 個数 <input type="text" name="number">
							</label>

						</div>
						<div class="container"></div>
						<div class="container">

							<label for="targetDate">期日:</label> <input type="date"
								id="targetDate" onchange="calculateRemainingDays()">
							<p>
								<span id="event_name"></span><span id="days"></span>
							</p>
						</div>
						<!-- 期日カウントダウン -->
					</form>
				</div>
				<input type="submit" name="save" value="保存">
			</div>
		</div>


		<!-- モーダルウインドウ 終了 -->
		<!-- モーダルウインドウ ケーキ 開始 -->


		<div id="modal3" class="modal">
			<div class="modal-content">
				<span class="close">&times;</span>
				<!-- 大枠 -->
				<div class="box2">
					<!-- タイトル -->
					<div class="box3">
						<p>ケーキ</p>
					</div>
					<!-- 項目 -->
					<input type="checkbox" id="check" value="clothing" checked><label
						for="check"></label>

					<div class="box4">
						<img src="" alt="シミュレーションの画像を取得">
					</div>

					<form>




						<div class="container">

							<label> 商品名 <input type="text" name="name">
							</label>

						</div>
						<div class="container"></div>
						<div class="container">

							<label> 値段 <input type="text" name="price">
							</label> <label> 個数 <input type="text" name="number">
							</label>

						</div>
						<div class="container"></div>
						<div class="container">

							<label for="ded">期日:</label> <input type="date" id="ded"
								onchange="calculateRemainingDays()">
							<p>
								<span id="event_name"></span><span id="days"></span>
							</p>
						</div>
						<!-- 期日カウントダウン -->
					</form>
				</div>
				<input type="submit" name="save" value="保存">
			</div>
		</div>


		<!-- モーダルウインドウ 終了 -->
		<!-- モーダルウインドウ カード 開始 -->


		<div id="modal4" class="modal">
			<div class="modal-content">
				<span class="close">&times;</span>
				<!-- 大枠 -->
				<div class="box2">
					<!-- タイトル -->
					<div class="box3">
						<p>カード</p>
					</div>
					<!-- 項目 -->
					<input type="checkbox" id="check" value="clothing" checked><label
						for="check"></label>

					<div class="box4">
						<img src="" alt="シミュレーションの画像を取得">
					</div>

					<form>




						<div class="container">

							<label> 商品名 <input type="text" name="name">
							</label>

						</div>
						<div class="container"></div>
						<div class="container">

							<label> 値段 <input type="text" name="price">
							</label> <label> 個数 <input type="text" name="number">
							</label>

						</div>
						<div class="container"></div>
						<div class="container">

							<label for="targetDate">期日:</label> <input type="date"
								id="targetDate" onchange="calculateRemainingDays()">
							<p>
								<span id="event_name"></span><span id="days"></span>
							</p>
						</div>
						<!-- 期日カウントダウン -->
					</form>
				</div>
				<input type="submit" name="save" value="保存">
			</div>
		</div>


		<!-- モーダルウインドウ 終了 -->
		<!-- モーダルウインドウ その他 開始 -->


		<div id="modal5" class="modal">
			<div class="modal-content">
				<span class="close">&times;</span>
				<!-- 大枠 -->
				<div class="box2">
					<!-- タイトル -->
					<div class="box3">
						<p>その他</p>
					</div>
					<!-- 項目 -->
					<input type="checkbox" id="check" value="clothing" checked><label
						for="check"></label>

					<div class="box4">
						<img src="" alt="シミュレーションの画像を取得">
					</div>

					<form>




						<div class="container">

							<label> 商品名 <input type="text" name="name">
							</label>

						</div>
						<div class="container"></div>
						<div class="container">

							<label> 値段 <input type="text" name="price">
							</label> <label> 個数 <input type="text" name="number">
							</label>

						</div>
						<div class="container"></div>
						<div class="container">

							<label for="targetDate">期日:</label> <input type="date"
								id="targetDate" onchange="calculateRemainingDays()">
							<p>
								<span id="event_name"></span><span id="days"></span>
							</p>
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