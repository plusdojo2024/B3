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
          <a href="HomeServlet"><img src="img/logo.png" alt="logo"height="100" width="150"></a>
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
                 <img src="img/Sinterior.png" alt="内装"class="photo"id="mainImage" data-modal-target="modal1"style="width: 500px; height: 300px;">
             </div>
             <div class="column">
                 <img src="img/Scostume.png" alt="衣装" class="photo" id="costumePhoto1" data-modal-target="modal2"style="width: 300px; height: 300px;">
             </div>
             <div class="column">
                <img src="img/Scostume.png" alt="衣装" class="photo" id="costumePhoto2" data-modal-target="modal2"style="width: 300px; height: 300px;">
            </div>
           </div>
         <div class="row">
             <div class="column">
                 <img src="img/Scake.png" alt="ケーキ" class="photo" id="cakesPhoto1" data-modal-target="modal3">
             </div>
             <div class="column">
                <img src="img/Scaketop .png" alt="ケーキトップ" class="photo" data-modal-target="modal4">
             </div>
             <div class="column">
                <img src="img/Scard.png" alt="カード" class="photo" id="cardsPhoto1"data-modal-target="modal5">
             </div>
             <div class="column">
                <img src="img/Scard.png" alt="カード" class="photo" id="cardsPhoto2"data-modal-target="modal5">
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
        <div class="content-wrapper">
        <div class="button-container">
        <button onclick="showImages('button1')">会場イメージ</button>
        <button onclick="showImages('button2')">テーブルクロス</button>
        <button onclick="showImages('button3')">トップクロス</button>
        <button onclick="showImages('button4')">ナフキン</button>
        <button onclick="showImages('button5')">チェア</button>
        <button onclick="showImages('button6')">フラワー</button>
        </div>

        <div class="image-wrapper">
        <div class="image-container">

            <img class="button1" src="img/back_church.jpeg" alt="会場イメージ1"onclick="showLargeImage('img/back_church.jpeg')">
            <img class="button1" src="img/back_shrine.png" alt="会場イメージ2"onclick="showLargeImage('img/back_shrine.png')">
            <img class="button1" src="img/back_venue.png" alt="会場イメージ3"onclick="showLargeImage('img/back_venue.png')">

            <img class="button2" src="img/table_blue.png" alt="テーブルクロス1"onclick="showLargeImage('img/t_blue.png')">
            <img class="button2" src="img/table_green.png" alt="テーブルクロス2"onclick="showLargeImage('img/t_green.png')">
            <img class="button2" src="img/table_pink.png" alt="テーブルクロス3"onclick="showLargeImage('img/t_pink.png')">
            <img class="button2" src="img/table_purple.png" alt="テーブルクロス4"onclick="showLargeImage('img/t_purple.png')">
            <img class="button2" src="img/table_red.png" alt="テーブルクロス5"onclick="showLargeImage('img/t_red.png')">
            <img class="button2" src="img/table_white.png" alt="テーブルクロス6"onclick="showLargeImage('img/t_white.png')">
            <img class="button2" src="img/table_yellow.png" alt="テーブルクロス7"onclick="showLargeImage('img/t_yellow.png')">

            <img class="button3" src="img/cloth_black.png" alt="トップクロス1"onclick="showLargeImage('img/c_black.png')">
            <img class="button3" src="img/cloth_blue.png" alt="トップクロス2"onclick="showLargeImage('img/c_blue.png')">
            <img class="button3" src="img/cloth_gray.png" alt="トップクロス3"onclick="showLargeImage('img/c_gray.png')">
            <img class="button3" src="img/cloth_brown.png" alt="トップクロス4"onclick="showLargeImage('img/c_brown.png')">
            <img class="button3" src="img/cloth_green.png" alt="トップクロス5"onclick="showLargeImage('img/c_green.png')">
            <img class="button3" src="img/cloth_pink.png" alt="トップクロス6"onclick="showLargeImage('img/c_pink.png')">
            <img class="button3" src="img/cloth_purple.png" alt="トップクロス7"onclick="showLargeImage('img/c_purple.png')">
            <img class="button3" src="img/cloth_red.png" alt="トップクロス8"onclick="showLargeImage('img/c_red.png')">
            <img class="button3" src="img/cloth_white.png" alt="トップクロス9"onclick="showLargeImage('img/c_white.png')">
            <img class="button3" src="img/cloth_whiteblue.png" alt="トップクロス10"onclick="showLargeImage('img/c_whiteblue.png')">
            <img class="button3" src="img/cloth_yellow.png" alt="トップクロス11"onclick="showLargeImage('img/c_yellow.png')">

            <img class="button4" src="img/napkin_blue.png" alt="ナフキン1"onclick="showLargeImage('img/n_blue.png')">
            <img class="button4" src="img/napkin_green.png" alt="ナフキン2"onclick="showLargeImage('img/n_green.png')">
            <img class="button4" src="img/napkin_pink.png" alt="ナフキン3"onclick="showLargeImage('img/n_pink.png')">
            <img class="button4" src="img/napkin_red.png" alt="ナフキン4"onclick="showLargeImage('img/n_red.png')">
            <img class="button4" src="img/napkin_white.png" alt="ナフキン5"onclick="showLargeImage('img/n_white.png')">
            <img class="button4" src="img/napkin_whiteblue.png" alt="ナフキン6"onclick="showLargeImage('img/n_whiteblue.png')">
            <img class="button4" src="img/napkin_yellow.png" alt="ナフキン7"onclick="showLargeImage('img/n_yellow.png')">

            <img class="button5" src="img/chair_beige.png" alt="チェア1"onclick="showLargeImage('img/cha_beige.png')" >
            <img class="button5" src="img/chair_brown.png" alt="チェア2"onclick="showLargeImage('img/cha_brown.png')">
            <img class="button5" src="img/chair_green.png" alt="チェア3"onclick="showLargeImage('img/cha_green.png')">
            <img class="button5" src="img/chair_pink.png" alt="チェア4"onclick="showLargeImage('img/cha_pink.png')">
            <img class="button5" src="img/chair_red.png" alt="チェア5"onclick="showLargeImage('img/cha_red.png')">
            <img class="button5" src="img/chair_white.png" alt="チェア6"onclick="showLargeImage('img/cha_white.png')">
            <img class="button5" src="img/chair_whiteblue.png" alt="チェア7"onclick="showLargeImage('img/cha_whiteblue.png')">

            <img class="button6" src="img/flower_blue.png" alt="フラワー1"onclick="showLargeImage('img/f_blue.png')">
            <img class="button6" src="img/flower_brown.png" alt="フラワー2"onclick="showLargeImage('img/f_brown.png')">
            <img class="button6" src="img/flower_pink.png" alt="フラワー3"onclick="showLargeImage('img/f_pink.png')">
            <img class="button6" src="img/flower_purple.png" alt="フラワー4"onclick="showLargeImage('img/f_purple.png')">
            <img class="button6" src="img/flower_red.png" alt="フラワー5"onclick="showLargeImage('img/f_red.png')">
            <img class="button6" src="img/flower_whiteblue.png" alt="フラワー6"onclick="showLargeImage('img/f_whiteblue.png')">
            <img class="button6" src="img/flower_yellow.png" alt="フラワー7"onclick="showLargeImage('img/f_yellow.png')">
        </div>
        <div>
    <img id="largeImage" src="" >
</div>
        </div>
        </div>
        <input type="submit" id="saveButton"name="save" value="保存" onclick="saveLargeImage()">
    </div>
</div>
<div id="modal2" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>衣装シミュレーション</p>
        <div class="clothes">
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_blue.png">
                <img src="img/dress_blue.png" alt="青" >
                <p>¥500,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_green.png">
                <img src="img/dress_green.png" alt="緑">
                <p>¥320,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_pink.png">
                <img src="img/dress_pink.png" alt="ピンク">
               <p>¥400,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_purple.png">
                <img src="img/dress_purple.png" alt="紫">
                <p>¥420,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_red.png">
                <img src="img/dress_red.png" alt="赤">
                <p>¥480,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_whiteblue.png">
                <img src="img/dress_whiteblue.png" alt="水色">
               <p>¥450,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_yellow.png">
                <img src="img/dress_yellow.png" alt="黄">
               <p>¥470,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_white.png">
                <img src="img/dress_white.png" alt="白">
               <p>¥1,000,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_jp_white">
                <img src="img/dress_jp_white.png" alt="白無垢">
                <p>¥1,000,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_jp_brown.png">
                <img src="img/dress_jp_brown.png" alt="茶">
                <p>¥340,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_jp_green.png">
                <img src="img/dress_jp_green.png" alt="緑">
               <p>¥300,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_jp_pink">
                <img src="img/dress_jp_pink.png" alt="ピンク">
                <p>¥310,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_jp_red.png">
                <img src="img/dress_jp_red.png" alt="赤">
                <p>¥370,000</p>
            </div>
            <div class="dress">
                <input type="checkbox" name="cloth[]" value="img/dress_jp_whiteblue.png">
                <img src="img/dress_jp_whiteblue.png" alt="水色">
               <p>¥470,000</p>
            </div>
            <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_black.png">
                <img src="img/suit_black.png" alt="黒">
               <p>¥210,000</p>
            </div>
            <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_blue.png">
                <img src="img/suit_blue.png" alt="青">
               <p>¥240,000</p>
            </div>
            <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_brown.png">
                <img src="img/suit_brown.png" alt="茶">
               <p>¥220,000</p>
            </div>
            <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_orange.png">
                <img src="img/suit_orange.png" alt="オレンジ">
               <p>¥250,000</p>
            </div>
            <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_pink.png">
                <img src="img/suit_pink.png" alt="ピンク">
               <p>¥230,000</p>
            </div>
            <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_red.png">
                <img src="img/suit_red.png" alt="赤">
               <p>¥260,000</p>
            </div>
            <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_whiteblue.png">
                <img src="img/suit_whiteblue.png" alt="水色">
               <p>¥250,000</p>
            </div>
            <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_yellow.png">
                <img src="img/suit_yellow.png" alt="黄">
               <p>¥210,000</p>
            </div>
            <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_jp_black.png">
                <img src="img/suit_jp_black.png" alt="黒">
               <p>¥200,000</p>
            </div>
             <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_jp_blue.png">
                <img src="img/suit_jp_blue.png" alt="青">
               <p>¥230,000</p>
            </div>
             <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_jp_brown.png">
                <img src="img/suit_jp_brown.png" alt="茶">
               <p>¥220,000</p>
            </div>
             <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_jp_purple.png">
                <img src="img/suit_jp_purple.png" alt="紫">
               <p>¥220,000</p>
            </div>
            <div class="suit">
                <input type="checkbox" name="cloth[]" value="img/suit_jp_red.png">
                <img src="img/suit_jp_red.png" alt="赤">
               <p>¥220,000</p>

        </div>

</div>
    </div>

    <input type="submit" name="save" value="保存" onclick="updateCostumePhoto()">
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
            <input type="checkbox" name="cake[]" value="img/cake_white.png">
                <img src="img/cake_white.png" alt="ショートケーキ">
               <p>¥80,000</p>
            </div>
            <div class="cake">
            <input type="checkbox" name="cake[]" value="img/cake_choko.png">
                <img src="img/cake_choco.png" alt="チョコレートケーキ">
               <p>¥90,000</p>
            </div>
            <div class="cake">
            <input type="checkbox" name="cake[]" value="img/cake_orange.png">
                <img src="img/cake_orange.png" alt="オレンジケーキ">
               <p>¥50,000</p>
            </div>
            <div class="cake">
            <input type="checkbox" name="cake[]" value="img/cake_purple.png">
                <img src="img/cake_purple.png" alt="ブルーベリーレアチーズケーキ">
               <p>¥50,000</p>
            </div>
            <div class="cake">
            <input type="checkbox" name="cake[]" value="img/cake_green.png">
                <img src="img/cake_green.png" alt="抹茶チーズケーキ">
               <p>¥70,000</p>
            </div>

        </div>

         <input type="submit" name="save" value="保存" onclick="updateCakesPhoto()">
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
          <input type="checkbox" name="card[]" value="img/inv_clover.png">
                <img src="img/inv_clover.jpg" alt="クローバー">
               <p>招待状：¥3,000</p>
        </div>
        <div class="card">
         <input type="checkbox" name="card[]" value="img/inv_flower.png">
                <img src="img/inv_flower.jpg" alt="花">
               <p>招待状：¥3,000</p>
        </div>
        <div class="card">
         <input type="checkbox" name="card[]" value="img/inv_heart.png">
                <img src="img/inv_heart.jpg" alt="ハート">
               <p>招待状：¥2,000</p>
        </div>
        <div class="card">
         <input type="checkbox" name="card[]" value="img/inv_checkbox.png">
                <img src="img/inv_simple.jpg" alt="標準">
               <p>招待状：¥1,000</p>
        </div>
        <div class="card">
         <input type="checkbox" name="card[]" value="img/inv_clover_back.png">
                <img src="img/inv_clover_back.jpg" alt="クローバー">
               <p>ネームプレート：¥300</p>
        </div>
        <div class="card">
        <input type="checkbox" name="card[]" value="img/inv_flower_back.png">
                <img src="img/inv_flower_back.jpg" alt="花">
               <p>ネームプレート：¥300</p>
        </div>
        <div class="card">
        <input type="checkbox" name="card[]" value="img/inv_heart_back.png">
                <img src="img/inv_heart_back.jpg" alt="ハート">
               <p>ネームプレート：¥200</p>
        </div>
        <div class="card">
        <input type="checkbox" name="card[]" value="img/inv_simple_back.png">
                <img src="img/inv_simple_back.jpg" alt="標準">
               <p>ネームプレート：¥100</p>
        </div>
        </div>
         <input type="submit" name="save" value="保存"onclick="updateCardsPhoto()">
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
    // すべての画像を非表示にする
    var images = document.querySelectorAll('.image-container img');
    images.forEach(function(img) {
        img.style.display = 'none';
    });

    // 指定されたボタンに対応するクラス名を持つ画像を表示する
    var className = '.' + buttonId;
    var selectedImages = document.querySelectorAll(className);
    selectedImages.forEach(function(img) {
        img.style.display = 'block';
    });
}
</script>
<script>
    function showLargeImage(imageSrc) {
        var largeImageElement = document.getElementById('largeImage');
        largeImageElement.src = imageSrc;
        largeImageElement.style.display = 'block';
    }
    function saveLargeImage() {
    var largeImageSrc = document.getElementById('largeImage').src;
    document.getElementById('mainImage').src = largeImageSrc;
}



</script>

<!-- model2の Javascript-->
<script>
    function saveSelections() {
        const checkboxes = document.querySelectorAll('#modal2 input[type="checkbox"]');
        const selectedItems = [];

        checkboxes.forEach((checkbox) => {
            if (checkbox.checked) {
                selectedItems.push(checkbox.value);
            }
        });

        console.log(selectedItems);

    }
    </script>
   <script>
    function updateCostumePhoto() {
        const checkboxes = document.querySelectorAll('input[name="cloth[]"]:checked');
        const costumePhoto1 = document.getElementById('costumePhoto1');
        const costumePhoto2 = document.getElementById('costumePhoto2');
        costumePhoto1.src = 'img/Scostume.png';
        costumePhoto2.src = 'img/Scostume.png';


        checkboxes.forEach((checkbox, index) => {
            if (index === 0) {
                costumePhoto1.src = checkbox.value;
            } else if (index === 1) {
                costumePhoto2.src = checkbox.value; }
        });


        checkboxes.forEach(checkbox => {
            checkbox.checked = false;
        });
    }
</script>
<!-- model3のJavascript -->


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
