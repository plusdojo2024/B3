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
<main class="main">
	<h1>お客様情報登録</h1>
	<form id="regist_form" method="post" action="/B3/RegistServlet" onSubmit="return check()">
		<table class="customer_inf">
			<tr>
				<td colspan="2">
					<label>　氏名　　<input type="text" name="lname1" class="text_name"></label>
									<input type="text" name="fname1" class="text_name">
				</td>
				<td colspan="2">
					<label>　氏名　　<input type="text" name="lname2" class="text_name"></label>
									<input type="text" name="fname2" class="text_name">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<label>フリガナ　<input type="text" name="lfurigana1" class="text_name"></label>
									<input type="text" name="ffurigana1" class="text_name">
				</td>
				<td colspan="2">
					<label>フリガナ　<input type="text" name="lfurigana2" class="text_name"></label>
									<input type="text" name="ffurigana2" class="text_name">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<label>電話番号　<input type="text" name="tell1" class="text_tell"></label>
				</td>
				<td colspan="2">
					<label>電話番号　<input type="text" name="tell2" class="text_tell"></label>
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
					<label>備考欄　　<textarea name="memo" class="text_memo" oninput="resizeTextarea()"></textarea></label>
				</td>
			</tr>
		</table>
		<div class="button">
			<input type="submit" name="submit" value="登録">
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

	!--<style>* {outline: 1px solid #FF0000;}</style>-->
