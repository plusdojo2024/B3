<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>KyoronP</title>
<link rel="stylesheet" href="/simpleBC/css/common.css">
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
      <li><a href=home.html>ホーム</a></li>
      <li><a href=regist.html>お客様情報登録</a></li>
      <li><a href=search.html>お客様検索</a></li>
      <li><a href=login.html>ログアウト</a></li>
    </ul>
  </nav>
</header>
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
</body>
</html>