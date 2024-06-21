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
                <img src="img/Sinterior.png" alt="内装"class="photo" data-modal-target="modal1"style="width: 500px; height: 300px;">
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
        <div class="button-container">
        <button onclick="showImages('button1')">会場イメージ</button>
        <button onclick="showImages('button2')">テーブルクロス</button>
        <button onclick="showImages('button3')">トップクロス</button>
        <button onclick="showImages('button4')">ナフキン</button>
        <button onclick="showImages('button5')">チェア</button>
        <button onclick="showImages('button6')">フラワー</button>
        </div>
        <div class="image-container">
            <img class="button1" src="img/back_church.jpeg" alt="会場イメージ1">
            <img class="button1" src="img/back_shrine.png" alt="会場イメージ2">
            <img class="button1" src="img/back_venue.png" alt="会場イメージ3">

            <img class="button2" src="img/table_blue.png" alt="テーブルクロス1">
            <img class="button2" src="img/table_green.png" alt="テーブルクロス2">
            <img class="button2" src="img/table_pink.png" alt="テーブルクロス3">
            <img class="button2" src="img/table_purple.png" alt="テーブルクロス4">
            <img class="button2" src="img/table_red.png" alt="テーブルクロス5">
            <img class="button2" src="img/table_white.png" alt="テーブルクロス6">
            <img class="button2" src="img/table_yellow.png" alt="テーブルクロス7">

            <img class="button3" src="img/cloth_black.png" alt="トップクロス1">
            <img class="button3" src="img/cloth_blue.png" alt="トップクロス2">
            <img class="button3" src="img/cloth_gray.png" alt="トップクロス3">
            <img class="button3" src="img/cloth_brown.png" alt="トップクロス4">
            <img class="button3" src="img/cloth_green.png" alt="トップクロス5">
            <img class="button3" src="img/cloth_pink.png" alt="トップクロス6">
            <img class="button3" src="img/cloth_purple.png" alt="トップクロス7">
            <img class="button3" src="img/cloth_red.png" alt="トップクロス8">
            <img class="button3" src="img/cloth_white.png" alt="トップクロス9">
            <img class="button3" src="img/cloth_whiteblue.png" alt="トップクロス10">
            <img class="button3" src="img/cloth_yellow" alt="トップクロス11">

            <img class="button4" src="img/napkin_blue.png" alt="ナフキン1">
            <img class="button4" src="img/napkin_green.png" alt="ナフキン2">
            <img class="button4" src="img/napkin_pink.png" alt="ナフキン3">
            <img class="button4" src="img/napkin_red.png" alt="ナフキン4">
            <img class="button4" src="img/napkin_white.png" alt="ナフキン5">
            <img class="button4" src="img/napkin_whiteblue.png" alt="ナフキン6">
            <img class="button4" src="img/napkin_yellow" alt="ナフキン7">

            <img class="button5" src="img/chair_beige.png" alt="チェア1">
            <img class="button5" src="img/chair_brown.png" alt="チェア2">
            <img class="button5" src="img/chair_green.png" alt="チェア3">
            <img class="button5" src="img/chair_pink.png" alt="チェア4">
            <img class="button5" src="img/chair_red.png" alt="チェア5">
            <img class="button5" src="img/chair_white.png" alt="チェア6">
            <img class="button5" src="img/chair_whiteblue.png" alt="チェア7">

            <img class="button6" src="img/flower_blue.png" alt="フラワー1">
            <img class="button6" src="img/flower_brown.png" alt="フラワー2">
            <img class="button6" src="img/flower_pink.png" alt="フラワー3">
            <img class="button6" src="img/flower_purple.png" alt="フラワー4">
            <img class="button6" src="img/flower_red.png" alt="フラワー5">
            <img class="button6" src="img/flower_whiteblue.png" alt="フラワー6">
            <img class="button6" src="img/flower_yellow.png" alt="フラワー7">
        </div>


        <input type="submit" name="save" value="保存"style="padding: 10px 20px,
    margin-top: 20px,
    border: none,
    border-radius: 30px,
    background-color: #b8860b,
    color: white,
    cursor: pointer,
    width: 20%,
    text-align: center">
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
	    <label>　　<select name="table" class="select" onchange="showPhoto(document.getElementsByName('people')[0].value, this.value)">
	        <option value="">-</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>

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
<!-- ハンバーガメニュの Javascript-->
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
<!-- modelの Javascript-->
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
<!-- model1の Javascript-->
<script>
    function showImages(buttonId) {
        // 一旦すべての画像を非表示にする
        var allImages = document.querySelectorAll('.image-container > img');
        allImages.forEach(function(img) {
            img.style.display = 'none';
        });

        // 選択されたボタンに対応する画像を表示する
        var selectedImages = document.querySelectorAll('.image-container > img.' + buttonId);
        selectedImages.forEach(function(img) {
            img.style.display = 'block';
        });
    }
</script>

<!-- model4の Javascript-->
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
<!-- model6の Javascript-->
<script>
    function showPhoto(peopleValue, tableValue) {
        var photoDisplay = document.getElementById('photoDisplay');
        photoDisplay.innerHTML = '';

        var photoURLs = {
            '1': {

                '1': ['img/table_4.png'],
                '2': ['img/table_4.png', 'img/table_4.png'],
                '3': ['img/table_4.png', 'img/table_4.png', 'img/table_4.png'],
                '4':['img/table_4.png','img/table_4.png','img/table_4.png','img/table_4.png'],
                '5':['img/table_4.png','img/table_4.png','img/table_4.png','img/table_4.png','img/table_4.png'],
                '6':['img/table_4.png','img/table_4.png','img/table_4.png','img/table_4.png','img/table_4.png','img/table_4.png'],
                '7':['img/table_4.png','img/table_4.png','img/table_4.png','img/table_4.png','img/table_4.png','img/table_4.png','img/table_4.png']

            },
            '2': {
                '1': ['img/table_5.png'],
                '2': ['img/table_5.png', 'img/table_5.png'],
                '3': ['img/table_5.png', 'img/table_5.png', 'img/table_5.png'],
                '4':['img/table_5.png','img/table_5.png','img/table_5.png','img/table_5.png'],
                '5':['img/table_5.png','img/table_5.png','img/table_5.png','img/table_5.png','img/table_5.png'],
                '6':['img/table_5.png','img/table_5.png','img/table_5.png','img/table_5.png','img/table_5.png','img/table_5.png'],
                '7':['img/table_5.png','img/table_5.png','img/table_5.png','img/table_5.png','img/table_5.png','img/table_5.png','img/table_5.png']

            },
            '3': {
                '1': ['img/table_6.png'],
                '2': ['img/table_6.png', 'img/table_6.png'],
                '3': ['img/table_6.png', 'img/table_6.png', 'img/table_6.png'],
                '4':['img/table_6.png','img/table_6.png','img/table_6.png','img/table_6.png'],
                '5':['img/table_6.png','img/table_6.png','img/table_6.png','img/table_6.png','img/table_6.png'],
                '6':['img/table_6.png','img/table_6.png','img/table_6.png','img/table_6.png','img/table_6.png','img/table_6.png'],
                '7':['img/table_6.png','img/table_6.png','img/table_6.png','img/table_6.png','img/table_6.png','img/table_6.png','img/table_6.png']

            },
            '4': {
                '1': ['img/table_7.png'],
                '2': ['img/table_7.png', 'img/table_7_.png'],
                '3': ['img/table_7.png', 'img/table_7.png', 'img/table_7.png'],
                '4':['img/table_7.png','img/table_7.png','img/table_7.png','img/table_7.png'],
                '5':['img/table_7.png','img/table_7.png','img/table_7.png','img/table_7.png','img/table_7.png'],
                '6':['img/table_7.png','img/table_7.png','img/table_7.png','img/table_7.png','img/table_7.png','img/table_7.png'],
                '7':['img/table_7.png','img/table_7.png','img/table_7.png','img/table_7.png','img/table_7.png','img/table_7.png','img/table_7.png']

            },
            '5': {
                '1': ['img/table_8.png'],
                '2': ['img/table_8.png', 'img/table_8.png'],
                '3': ['img/table_8.png', 'img/table_8.png', 'img/table_8.png'],
                '4':['img/table_8.png','img/table_8.png','img/table_8.png','img/table_8.png'],
                '5':['img/table_8.png','img/table_8.png','img/table_8.png','img/table_8.png','img/table_8.png'],
                '6':['img/table_8.png','img/table_8.png','img/table_8.png','img/table_8.png','img/table_8.png','img/table_8.png'],
                '7':['img/table_8.png','img/table_8.png','img/table_8.png','img/table_8.png','img/table_8.png','img/table_8.png','img/table_8.png']

            }
        };

        if (peopleValue in photoURLs && tableValue in photoURLs[peopleValue]) {
            var photos = photoURLs[peopleValue][tableValue];
            photos.forEach(function(url) {
                var img = document.createElement('img');
                img.src = url;
                img.classList.add('phototable');
                photoDisplay.appendChild(img);
            });
        }
    }
</script>
</body>
</html>
