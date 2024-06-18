<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ホーム</title>
  <link rel="stylesheet" href="/B3/css/common.css">
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
      <li><a href=home.jsp>ホーム</a></li>
      <li><a href=RegistServlet>お客様情報登録</a></li>
      <li><a href=SerchServlet>お客様検索</a></li>
      <li><a href=LogoutServlet>ログアウト</a></li>
    </ul>
  </nav>
</header>

<main>
  <div class="title">
    <a href="/B3/HomeServlet"><img src="/B3/img/home.png" alt="KyoronpTitle" width="900" height="400"></a>
  </div>

  <div class="menu">
    <a href="/B3/RegistServlet"><img src="/B3/img/regist.png" alt="登録" width="350" height="200"></a>
    <a href="/B3/SerchServlet"><img src="/B3/img/search.png" alt="検索" width="350" height="200"></a>
    <a href="/B3/LogoutServlet"><img src="/B3/img/logout.png" alt="ログアウト" width="350" height="200"></a>
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
</script>

</body>
</html>