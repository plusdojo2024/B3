<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KyoronP</title>
<link rel="stylesheet" href="/B3/css/todaylist.css">
<link rel="stylesheet" href="/B3/css/common.css">
</head>
<body>
<header id ="header">
  <a href=/B3/MypageServlet><img src="img/logo.png" alt="logo" height="100" width="150"></a>
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
<main class="main">
	<h1>当日リスト</h1>
	<form action="post">
		<div id="wrapper">
			<div id="area_ticket">
				<div id="now_time" class="now_time">現在時刻 0:00</div>
			<table id="t_list" class="t_list">
				<tr id="t_full" class="t_full">
					<td >
						<img src="img/ticket-main.png" alt="ticket_main" class="t_main">
						<textarea name="suhedule" class="text_s" placeholder="式目"></textarea>
						<textarea name="schedule_time" class="text_st" placeholder="予定時刻"></textarea>
						<textarea name="actual_time" class="text_at" placeholder="完了時刻"></textarea>
					</td>
					<td>
						<img src="img/ticket-sub.png" alt="ticket_sub" id="t_sub" class="t_sub" onclick="t_sub()">
					</td>
				</tr>
				<tr class="t_full">
					<td >
						<img src="img/ticket-main.png" alt="ticket_main" class="t_main">
						<textarea name="suhedule" class="text_s" placeholder="式目"></textarea>
						<textarea name="schedule_time" class="text_st" placeholder="予定時刻"></textarea>
						<textarea name="actual_time" class="text_at" placeholder="完了時刻"></textarea>
					</td>
					<td>
						<img src="img/ticket-sub.png" alt="ticket_sub" id="t_sub" class="t_sub" onclick="t_sub()">
					</td>
				</tr>
			</table>
				<div class="button">
					<a id="add_ticket" class="t_button">追加</a>
					<a id="del_ticket" class="t_button">削除</a>
				</div>

			</div>
			<div id="area_memo">
				<div class="m_today">
					<textarea name="memo_id" class="memo" placeholder="メモ欄"></textarea>
				</div>
				<div class="button">
					<input type="submit" name="submit" value="保存">
				</div>

			</div>
		</div>
	</form>


</main>
<footer>
  <p class="copyright">Copyright KyoronP. All rights reserved.</p>
</footer>
<script>
  const hmbBtn=document.getElementById("hmb");
  const header=document.getElementById("header");
  hmbBtn.addEventListener("click",function(){header.classList.toggle("active");
  });

  const ticketlick=document.getElementById('t_sub')
  ticketlick.addEventListener("click", function() {
  	alert("チケット！");
  });

//追加ボタン
	//追加を押した回数をカウント
	var i = 2;
	const t_add=document.getElementById('add_ticket')
	t_add.addEventListener("click", function() {
		//テーブル取得
		var table = document.getElementById("t_list")
		//行を行末に追加
		var row = table.insertRow(-1);
		//<tr>を取得
		var tr = document.getElementsByTagName("tr");
		//i番目の<tr>にclass="t_full"を追加　←解決
		tr[i].classList.add("t_full");
		//セルの挿入
		var cell1 = row.insertCell(-1);
		var cell2 = row.insertCell(-1);
		//セル内のHTML
		var t_main = '<img src="img/ticket-main.png" alt="ticket_main" class="t_main">'
					+ '<textarea name="suhedule" class="text_s" placeholder="式目"></textarea>'
					+ '<textarea name="schedule_time" class="text_st" placeholder="予定時刻"></textarea>'
					+ '<textarea name="actual_time" class="text_at" placeholder="完了時刻"></textarea>';
		var t_sub = '<img src="img/ticket-sub.png" alt="ticket_sub" id="t_sub" class="t_sub" onclick="t_sub()">';
		//セルの内容入力
		cell1.innerHTML = t_main;
		cell2.innerHTML = t_sub;
		//カウント+1
		i++;
	})

/*入れると追加もできなくなる
//削除ボタン
 	const add=document.getElementById('del_ticket')
 	add.addEventListener("click", function() {
		var table = document.getElementById("t_list")
		var rows = table.deleteRow(-1);
	})
*/


</script>
</body>
</html>

	<!--<style>* {outline: 1px solid #FF0000;}</style>-->