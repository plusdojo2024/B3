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
      <li><a href=home.jsp>マイページ</a></li>
      <li><a href=regist.jsp>お客様様情報編集</a></li>
      <li><a href=search.jsp>発注リスト</a></li>
      <li><a href=login.jsp>当日リスト</a></li>
      <li><a href=login.jspl>シミュレーション</a></li>
      <li><a href=login.jsp>報告書作成</a></li>
      <li><a href=login.jspl>お客様変更</a></li>
      <li><a href=login.jspl>ログアウト</a></li>
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
        <p>内装</p>
    </div>
</div>

<div id="modal2" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>衣装</p>
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
                <img src="img/dress_jp_white.PNG" alt="白無垢">
                <p>¥1,000,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_brown.PNG" alt="茶">
                <p>¥340,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_green.PNG" alt="緑">
               <p>¥300,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_pink.PNG" alt="ピンク">
                <p>¥310,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_red.PNG" alt="赤">
                <p>¥370,000</p>
            </div>
            <div class="dress">
                <img src="img/dress_jp_whiteblue.PNG" alt="水色">
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
                <img src="img/suit_jp_black.PNG" alt="黒">
               <p>¥200,000</p>
            </div>
             <div class="suit">
                <img src="img/suit_jp_blue.PNG" alt="青">
               <p>¥230,000</p>
            </div>
             <div class="suit">
                <img src="img/suit_jp_brown.PNG" alt="茶">
               <p>¥220,000</p>
            </div>
             <div class="suit">
                <img src="img/suit_jp_purple.PNG" alt="紫">
               <p>¥220,000</p>
            </div>
            <div class="suit">
                <img src="img/suit_jp_red.PNG" alt="赤">
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
        <p>ケーキ</p>
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
        <p>ケーキトップ</p>
        <input type="submit" name="save" value="保存">
    </div>
</div>

<div id="modal5" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>招待状</p>
        <div class="cards">
        <div class="invation">
                <img src="img/inv_clover.jpg" alt="クローバー">
               <p>¥3,000</p>
        </div>
        <div class="invation">
                <img src="img/inv_flower.jpg" alt="花">
               <p>¥3,000</p>
        </div>
        <div class="invation">
                <img src="img/inv_heart.jpg" alt="ハート">
               <p>¥2,000</p>
        </div>
        <div class="invation">
                <img src="img/inv_simple.jpg" alt="標準">
               <p>¥1,000</p>
        </div>
        <div class="nameplate">
                <img src="img/inv_clover_back.jpg" alt="クローバー">
               <p>¥300</p>
        </div>
        <div class="invation">
                <img src="img/inv_flower_back.jpg" alt="花">
               <p>¥300</p>
        </div>
        <div class="invation">
                <img src="img/inv_heart_back.jpg" alt="ハート">
               <p>¥200</p>
        </div>
        <div class="invation">
                <img src="img/inv_simple_back.jpg" alt="標準">
               <p>¥100</p>
        </div>
        <div class="invation">

        </div>
        <div class="invation">

        </div>



        </div>
    </div>
</div>
<div id="modal6" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>席配置</p>
    </div>
</div>
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
