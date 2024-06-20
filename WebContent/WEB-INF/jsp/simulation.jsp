<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KyoronP</title>
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/simulation.css">

</head>
<body>
<header id ="header">
  <img src="img/logo.png" alt="logo">
  <div id="hmb">
    <span></span>
    <span></span>
    <span></span>
  </div>
  <nav>
    <ul>
      <li><a href="/B3/MypageServlet">マイページ</a></li>
      <li><a href="/B3/UpdateServlet">お客様様情報編集</a></li>
      <li><a href="/B3/OrdelistServlet">発注リスト</a></li>
      <li><a href="/B3/TodaylistServlet">当日リスト</a></li>
      <li><a href="/B3/SimulationServlet">シミュレーション</a></li>
      <li><a href="/B3/ReportServlet">報告書作成</a></li>
      <li><a href="/B3/SearchServlet">お客様変更</a></li>
      <li><a href="/B3/LogoutServlet">ログアウト</a></li>
    </ul>
  </nav>
</header>
<main>
    <div class="container">
        <div class="row">
            <div class="column">
                <img src="img/Sinterior.png" alt="内装" class="photo" data-modal-target="modal1">
            </div>
            <div class="column">
                <img src="img/Scostume.png" alt="衣装" class="photo" data-modal-target="modal2">
            </div>
        </div>
        <div class="row">
            <div class="column">
                <img src="img/Scake.png" alt="ケーキ" class="photo" data-modal-target="modal3">
            </div>
            <div class="column">
                <img src="img/Scaketop .png" alt="ケーキトップ" class="photo" data-modal-target="modal4">
            </div>
            <div class="column">
                <img src="img/Scard.png" alt="カード" class="photo" data-modal-target="modal5">
            </div>
            <div class="column">
                <img src="img/Stable.png" alt="席配置" class="photo" data-modal-target="modal6">
            </div>
        </div>
    </div>

<!-- モーダルウィンドウ -->
<div id="modal1" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>内装シミュレーション</p>
         <div class="selection-area">
            <button class="selection-button" data-image="img/back_church.jpeg,img/back_shrine.jpeg,img/back_venue.jpeg">会場イメージ</button>
            <button class="selection-button" data-image="table_image1.jpg">テーブル</button>
            <button class="selection-button" data-image="tablecloth_image1.jpg">テーブルクロス</button>
            <button class="selection-button" data-image="topcloth_image1.jpg">トップクロス</button>
            <button class="selection-button" data-image="napkin_image1.jpg">ナフキン</button>
            <button class="selection-button" data-image="chair_image1.jpg">チェア</button>
            <button class="selection-button" data-image="flower_image1.jpg">フラワー</button>
        </div>
        <div class="image-gallery">
            <img src="img/back_church.jpeg" alt="会場イメージ1">
            <img src="img/back_shrine.jpeg" alt="会場イメージ2">
            <img src="img/back_venue.jpeg" alt="会場イメージ3">
           </div>
        <div class="display-area">
            <img id="selectedImage" src="#" alt="選択した画像">
        </div>
        <input type="submit" name="save" value="保存">

    </div>
</div>

<div id="modal2" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>衣装シミュレーション</p>
        <div class="clothes">
            <div class="dress">
                <img src="img/dress_blue.png" alt="青">
                <p>¥500,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_green.png" alt="緑">
                <p>¥320,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_pink.png" alt="ピンク">
               <p>¥400,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_purple.png" alt="紫">
                <p>¥420,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_red.png" alt="赤">
                <p>¥480,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_whiteblue.png" alt="水色">
               <p>¥450,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_yellow.png" alt="黄">
               <p>¥470,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_white.png" alt="白">
               <p>¥1,000,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_white.png" alt="白無垢">
                <p>¥1,000,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_brown.png" alt="茶">
                <p>¥340,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_green.png" alt="緑">
               <p>¥300,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_pink.png" alt="ピンク">
                <p>¥310,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_red.png" alt="赤">
                <p>¥370,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_whiteblue.png" alt="水色">
               <p>¥470,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_black.png" alt="黒">
               <p>¥210,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_blue.png" alt="青">
               <p>¥240,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_brown.png" alt="茶">
               <p>¥220,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_orange.png" alt="オレンジ">
               <p>¥250,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_pink.png" alt="ピンク">
               <p>¥230,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_red.png" alt="赤">
               <p>¥260,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_whiteblue.png" alt="水色">
               <p>¥250,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_yellow.png" alt="黄">
               <p>¥210,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_jp_black.png" alt="黒">
               <p>¥200,000</p>
            </div>
             <div class="suit">
                <img src="img/suit_jp_blue.png" alt="青">
               <p>¥230,000</p>
            </div>
             <div class="suit">
                <img src="img/suit_jp_brown.png" alt="茶">
               <p>¥220,000</p>
            </div>
             <div class="suit">
                <img src="img/suit_jp_purple.png" alt="紫">
               <p>¥220,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_jp_red.png" alt="赤">
               <p>¥220,000</p>
            </div>
            <div class="suit">
            </div>
            <div class="suit">
            </div>
        </div>
         <input type="submit" name="save" value="保存">
    </div>

</div>

<div id="modal3" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>ケーキシミュレーション</p>
        <div class="cakes">
        <div class="cake">
               <p>ケーキなし</p>
            </div>
            <div class="cake">
                <img src="img/cake_white.png" alt="ショートケーキ">
               <p>¥80,000</p>
            </div>
            <div class="cake">
                <img src="img/cake_choco.png" alt="チョコレートケーキ">
               <p>¥90,000</p>
            </div>
            <div class="cake">
                <img src="img/cake_orange.png" alt="オレンジケーキ">
               <p>¥50,000</p>
            </div>
            <div class="cake">
                <img src="img/cake_purple.png" alt="ブルーベリーレアチーズケーキ">
               <p>¥50,000</p>
            </div>
            <div class="cake">
                <img src="img/cake_green.png" alt="抹茶チーズケーキ">
               <p>¥70,000</p>
            </div>
            <div class="cake">
            </div>
            <div class="cake">
            </div>


        </div>
         <input type="submit" name="save" value="保存">
    </div>
</div>

<div id="modal4" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>ケーキトップシミュレーション</p>
        <textarea id="memoTextarea" placeholder="ケーキトップの内容入力してください。"></textarea>
        <input type="submit" name="save" value="保存">
    </div>
</div>

<div id="modal5" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>カードシミュレーション</p>
        <div class="cards">
        <div class="card">
                <img src="img/inv_clover.jpg" alt="クローバー">
               <p>招待状：¥3,000</p>
        </div>
        <div class="card">
                <img src="img/inv_flower.jpg" alt="花">
               <p>招待状：¥3,000</p>
        </div>
        <div class="card">
                <img src="img/inv_heart.jpg" alt="ハート">
               <p>招待状：¥2,000</p>
        </div>
        <div class="card">
                <img src="img/inv_simple.jpg" alt="標準">
               <p>招待状：¥1,000</p>
        </div>
        <div class="card">
                <img src="img/inv_clover_back.jpg" alt="クローバー">
               <p>ネームプレート：¥300</p>
        </div>
        <div class="card">
                <img src="img/inv_flower_back.jpg" alt="花">
               <p>ネームプレート：¥300</p>
        </div>
        <div class="card">
                <img src="img/inv_heart_back.jpg" alt="ハート">
               <p>ネームプレート：¥200</p>
        </div>
        <div class="card">
                <img src="img/inv_simple_back.jpg" alt="標準">
               <p>ネームプレート：¥100</p>
        </div>
        <div class="card">

        </div>
        <div class="card">
        </div>
         <input type="submit" name="save" value="保存">
        </div>
    </div>
</div>
<div id="modal6" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>席配置シミュレーション</p>
        <label>　　<select name="people" class="select" onchange="showPhoto(this.value)" >
            <option value="">-</option>
			<option value="1">4</option>
			<option value="2">5</option>
			<option value="3">6</option>
			<option value="4">7</option>
			<option value="5">8</option>
		</select>人</label>
	    <label>　　<select name="table" class="select">
	        <option value="">-</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
		</select>卓</label>
		<div id="photoDisplay">
       <!-- ここに選択された写真が表示されます -->
       </div>
        <input type="submit" name="save" value="保存">
    </div>
</div>
</main>


<footer>
  <p class="copyright">Copyright KyoronP. All rights reserved.</p>
</footer>
<script>
const hmbBtn = document.getElementById("hmb");
const header = document.getElementById("header");
const logo = document.getElementById("logo"); // ロゴの要素を取得
const footer = document.querySelector("footer"); // フッターの要素を取得

hmbBtn.addEventListener("click", function() {
  header.classList.toggle("active");
  logo.classList.toggle("active"); // ロゴの表示切り替え
  footer.classList.toggle("active"); // フッターの表示切り替え
});
</script>
<script>
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
<script>
document.addEventListener("DOMContentLoaded", function() {
    const modal = document.getElementById("modal4");
    const closeButton = modal.querySelector(".close");

    // 閉じるボタンをクリックした時の処理を定義
    closeButton.addEventListener("click", function() {
        closeModal(modal);
    });

    // モーダルを表示するための関数
    function openModal() {
        modal.style.display = "block";
    }

    // モーダルを非表示にするための関数
    function closeModal(modalElement) {
        modalElement.style.display = "none";
    }

    // モーダルを表示するトリガーとなる要素にイベントリスナーを追加
    // ここでは例として、モーダルを表示するボタンがクリックされた時を想定しています
    const showModalButton = document.getElementById("showModalButton");

    if (showModalButton) {
        showModalButton.addEventListener("click", function() {
            openModal();
        });
    }
});
</script>
<script>
    function showPhoto(peopleValue) {
        var photoDisplay = document.getElementById('photoDisplay');
        photoDisplay.innerHTML = '';

        // Define photo URLs corresponding to people options
        var photoURLs = {
            '1': 'img/table_4.png',
            '2': 'img/table_5.png',
            '3': 'img/table_6.png',
            '4': 'img/table_7.png',
            '5': 'img/table_8.png'
        };

        // Display photo if a valid people option is selected
        if (peopleValue in photoURLs) {
            var img = document.createElement('img');
            img.src = photoURLs[peopleValue];
            img.style.maxWidth = '100%'; // Adjust styling as needed
            photoDisplay.appendChild(img);
        }
    }
</script>
</body>
</html>
