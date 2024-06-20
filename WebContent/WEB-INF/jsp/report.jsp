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
      <li><a href="mypage.jsp">マイページ</a></li>
      <li><a href="update.jsp">お客様情報編集</a></li>
      <li><a href="orderlist.jsp">発注リスト</a></li>
      <li><a href="todaylist.jsp">当日リスト</a></li>
      <li><a href="simulation,jsp">シミュレーション</a></li>
      <li><a href="report.jsp">報告書作成</a></li>
      <li><a href="survay.jsp">式後アンケート</a></li>
      <li><a href="serch.jsp">お客様変更</a></li>
      <li><a href="logout.jsp">ログアウト</a></li>
    </ul>
  </nav>
</header>

<main>

  <div class="disp-img"></div>

  <div class="top">
    <p class="report">報告書</p>
	<p class="time">記入日時：<span id="time"></span></p>
  </div>

    <div class="couple"><img src="/B3/img/mypagename.png" width="400" height="200"></div>

  <div class="menu">
  <div>
    <label for="guest">参加者数</label>
    <input name="guest" placeholder="" ></input>　  人
  </div>
  <div>
    <label for="change">当日の変更点</label>
    <textarea name="change" placeholder="" ></textarea>
  </div>
  <div>
    <label for="trouble">トラブルの内容</label>
    <textarea name="trouble" placeholder="" ></textarea>
  </div>
  <p>
    <input type="submit" value="保存" class = "button">
  </p>
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
</script>

</body>
</html>