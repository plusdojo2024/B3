<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>マイページ</title>
  <link rel="stylesheet" href="/B3/css/home.css">
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
      <li><a href="MypageServlet">マイページ</a></li>
      <li><a href="UpdateServlet">お客様情報編集</a></li>
      <li><a href="OrderlistServlet">発注リスト</a></li>
      <li><a href="TodaylistServlet">当日リスト</a></li>
      <li><a href="SimulationServlet">シミュレーション</a></li>
      <li><a href="ReportServlet">報告書作成</a></li>
      <li><a href="SurvayServlet">式後アンケート</a></li>
      <li><a href="SerchSuervlet">お客様変更</a></li>
      <li><a href="LogoutServlet">ログアウト</a></li>
    </ul>
  </nav>
</header>

<main>


  <div class="mymenu1">
    <p class="survay"><a href="/B3/OrderlistServlet"><img src="/B3/img/orderlist.png" alt="発注リスト"></a>
    <div class="couple"><img src="/B3/img/mypagename.png" width="500" height="250"></div>
    <p class="survay"><a href="/B3/SurveyServlet"><img src="/B3/img/survey.png" alt="アンケート"></a></p>
  </div>
  <div class="mymenu2">
    <a href="/B3/TodaylistServlet"><img src="/B3/img/todayslist.png" alt="当日リスト"></a>
    <a href="/B3/SimulationServlet"><img src="/B3/img/simulation.png" alt="シミュレーション"></a>
    <a href="/B3/ReportServlet"><img src="/B3/img/report.png" alt="報告書"></a>
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