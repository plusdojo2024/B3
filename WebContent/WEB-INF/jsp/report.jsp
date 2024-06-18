<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>報告書</title>
  <link rel="stylesheet" href="/B3/css/report.css">
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

<main>
  <div class="報告書トップ">
    <a class="報告書">報告書</a>
    <a class="記入日時"></a>
    <a href"/B3/UpdateServlet"><img src="/B3/img/mypagename.png" alt="夫婦カード" width="100" height="100"></a>
  </div>

  <div>
    <label for="guest">当日参加者数</label>
    <input type="text" id="guest" name="guest" placeholder="" >
  </div>
  <div>
    <label for="change">当日の変更点</label>
    <input type="text" id="change" name="change" placeholder="" >
  </div>
  <div>
    <label for="trouble">トラブルの対処と対策</label>
    <input type="text" id="trouble" name="trouble" placeholder="" >
  </div>
  <p>
    <input type="submit" value="保存" class = "button">
  </p>
</main>

 <footer>
  <p class="copyright">Copyright KyoronP. All rights reserved.</p>
</footer>
<script>
  const hmbBtn=document.getElementById("hmb");
  const header=document.getElementById("header");
  hmbBtn.addEventListener("click",function(){header.classList.toggle("active");
  });
</script>

</body>
</html>