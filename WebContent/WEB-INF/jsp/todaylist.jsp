<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KyoronP</title>
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
      <li><a href=/B3/MypageServlet>マイページ</a></li>
      <li><a href=/B3/UpdateServlet>お客様情報編集</a></li>
      <li><a href=/B3/OrderlistServlet>発注リスト</a></li>
      <li><a href=/B3/TodaylistServlet>当日リスト</a></li>
      <li><a href=/B3/SimulationServlet>シミュレーション</a></li>
      <li><a href=/B3/ReportServlet>報告書作成</a></li>
      <li><a href=/B3/SurveyServlet>式後アンケート</a></li>
      <li><a href=/B3/SearchServlet>お客様変更</a></li>
      <li><a href=/B3/LogoutServlet>ログアウト</a></li>
    </ul>
  </nav>
</header>
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