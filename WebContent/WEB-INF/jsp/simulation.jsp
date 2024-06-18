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
      <li><a href=home.html>マイページ</a></li>
      <li><a href=regist.html>お客様様情報編集</a></li>
      <li><a href=search.html>発注リスト</a></li>
      <li><a href=login.html>当日リスト</a></li>
      <li><a href=login.html>シミュレーション</a></li>
      <li><a href=login.html>報告書作成</a></li>
      <li><a href=login.html>お客様変更</a></li>
      <li><a href=login.html>ログアウト</a></li>
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
    </div>
</div>

<div id="modal3" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>ケーキ</p>
    </div>
</div>

<div id="modal4" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>ケーキトップ</p>
    </div>
</div>

<div id="modal5" class="modal">
    <div class="modal-content">
        <span class="close">&times;</span>
        <p>カード</p>
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