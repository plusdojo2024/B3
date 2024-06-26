<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アンケート</title>
  <link rel="stylesheet" href="/B3/css/survey.css">
  <link rel="stylesheet" href="/B3/css/common.css">
</head>
<body>

<header id ="header">
  <a href=MypageServlet><img src="img/logo.png" alt="logo" height="100" width="150"></a>

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
      <li><a href="SurveyServlet">式後アンケート</a></li>
      <li><a href="SearchServlet">お客様変更</a></li>
      <li><a href="LogoutServlet">ログアウト</a></li>
    </ul>
  </nav>

</header>
<main>

  <div class="top">
    <p class="survey">式後アンケート</p>
	<p class="time">記入日時：<span id="time"></span></p>
  </div>

    <div class="couple"><img src="/B3/img/matutiName.png" width="400" height="200"></div>
	<p class="displaycouple"></p>

  <div class="menu">
  <div>
    <label for="sutisfy">満足度</label>
    <select name="sutisfy">
      <option value="100">非常に良かった</option>
      <option value="80">良かった</option>
      <option value="50">普通</option>
      <option value="30">悪かった</option>
      <option value="0">非常に悪かった</option>
    </select>
  </div>
  <div>
    <label for="good">良かった点</label>
    <textarea name="good" placeholder="" ></textarea>
  </div>
  <div>
    <label for="fix">改善点</label>
    <textarea name="fix" placeholder="" ></textarea>
  </div>
    <input type="submit" value="保存" class = "button">
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
<script>
'use strict';
  const now = new Date();
  const year = now.getFullYear();
  const month = now.getMonth()+1;
  const date = now.getDate();
  const output = year+"/"+month + "/"+date;
  document.getElementById('time').textContent = output;

  function getLoggedInUsername() {
      return "";
  }
  document.getElementById('displaycouple').innerText = getLoggedInUsername();
</script>

</body>
</html>