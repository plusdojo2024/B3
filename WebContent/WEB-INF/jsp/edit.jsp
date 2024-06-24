<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KyoronP</title>
<link rel="stylesheet" href="/B3/css/common.css">
<link rel="stylesheet" href="/B3/css/regist.css">
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
	<h1>お客様情報編集</h1>
	<form id="edit_form" method="post" action="/B3/UpdateServlet" onSubmit="return check()">
		<table class="customer_regist">
			<tr>
				<td colspan="2">
					<label>　氏名　　<input type="text" name="lname_1" class="text_name"></label>
									<input type="text" name="fname_1" class="text_name">
				</td>
				<td colspan="2">
					<label>　氏名　　<input type="text" name="lname_2" class="text_name"></label>
									<input type="text" name="fname_2" class="text_name">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<label>フリガナ　<input type="text" name="lfurigana_1" class="text_name"></label>
									<input type="text" name="ffurigana_1" class="text_name">
				</td>
				<td colspan="2">
					<label>フリガナ　<input type="text" name="lfurigana_2" class="text_name"></label>
									<input type="text" name="ffurigana_2" class="text_name">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<label>電話番号　<input type="text" name="tel_1" class="text_tell"></label>
				</td>
				<td colspan="2">
					<label>電話番号　<input type="text" name="tel_2" class="text_tell"></label>
				</td>
			</tr>
			<tr>
				<td colspan="4" class="td_center">
					<label>住　所　　<input type="text" name="address" class="text_add"></label>
				</td>
			</tr>
			<tr>
				<td colspan="4" class="td_center">
					<label>式の予定日　<select name="year" class="select">
						<option value="">-</option>
						<option value="2024">2024</option>
						<option value="2025">2025</option>
						<option value="2026">2026</option>
						<option value="2027">2027</option>
						<option value="2028">2028</option>
						<option value="2029">2029</option>
						<option value="2030">2030</option>
						<option value="2031">2031</option>
						<option value="2032">2032</option>
						<option value="2033">2033</option>
						<option value="2034">2034</option>
					</select>年</label>
					<label>　　<select name="month" class="select">
						<option value="">-</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
					</select>月</label>
					<label>　　<select name="day" class="select">
						<option value="">-</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="16">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
						<option value="23">23</option>
						<option value="24">24</option>
						<option value="25">25</option>
						<option value="26">26</option>
						<option value="27">27</option>
						<option value="28">28</option>
						<option value="29">29</option>
						<option value="30">30</option>
						<option value="31">31</option>
					</select>日</label>
				</td>
			</tr>
			<tr>
				<td colspan="4" class="td_center">
					<label>備考欄　　<textarea name="memo_id" class="text_memo"></textarea></label>
				</td>
			</tr>
		</table>
		<div class="button">
			<input type="submit" name="submit" value="保存">
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
</script>
</body>
</html>

	<!--<style>* {outline: 1px solid #FF0000;}</style>-->