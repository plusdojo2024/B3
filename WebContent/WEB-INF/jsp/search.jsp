<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KyoronP</title>
<link rel="stylesheet" href="/B3/css/common.css">
<link rel="stylesheet" href="/B3/css/search.css">
</head>
<body>
<header id ="header">
  <a href=/B3/HomeServlet><img src="img/logo.png" alt="logo" height="100" width="150"></a>
  <div id="hmb">
    <span></span>
    <span></span>
    <span></span>
  </div>
  <nav>
    <ul>
      <li><a href=/B3/HomeServlet>ホーム</a></li>
      <li><a href=/B3/RegistServlet>お客様情報登録</a></li>
      <li><a href=/B3/SearchServlet>お客様情報検索</a></li>
      <li><a href=/B3/LogoutServlet>ログアウト</a></li>
    </ul>
  </nav>
</header>
<main class="main">
	<h1>お客様情報検索</h1>
		<table class="cards" id="card">
			<tr>
				<td class="card">
					<img src="img/pin.png" alt="pin" id="pin1" class="pin">
					<a href=/B3/MypageServlet>
						<input type="text" name="fname_1" value="剛史${e.fname_1 }" class="card_name">様<br>
						<input type="text" name="fname_2" value="沙織${e.fname_2 }" class="card_name">様
					</a>
				</td>
				<td class="card">
					<img src="img/pin.png" alt="pin" id="pin2" class="pin">
					<a href=/B3/MypageServlet>
						<input type="text" name="fname_1" value="太郎${e.fname_1 }" class="card_name">様<br>
						<input type="text" name="fname_2" value="花子${e.fname_2 }" class="card_name">様
					</a>
				</td>
				<td class="card">
					<img src="img/pin.png" alt="pin" id="pin3" class="pin">
					<a href=/B3/MypageServlet>
						<input type="text" name="fname_1" value="湊${e.fname_1 }" class="card_name">様<br>
						<input type="text" name="fname_2" value="葵${e.fname_2 }" class="card_name">様
					</a>
				</td>
			</tr>
		</table>
	<form id="search_form" method="post" action="/B3/SearchServlet">
		<table class="customer_search">
			<tr>
				<td colspan="3"class="td_center">
					<label>　氏　名　<input type="text" name="lname_1" class="text_name"></label>
				</td>
			</tr>
			<tr>
				<td colspan="3" class="td_center">
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
					<label>　<select name="month" class="select">
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
					<label>　<select name="day" class="select">
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
				<td colspan="3" class="td_center">
					<label>キーワード<textarea name="memo_id" class="text_memo" oninput="resizeTextarea()"></textarea></label>
				</td>
			</tr>
		</table>
		<div class="button">
			<input type="submit" name="search" value="検索">
		</div>
	</form>
</main>
<footer>
  <p class="copyright">Copyright KyoronP. All rights reserved.</p>
</footer>
<script src="/B3/js/result.js"></script>
<script>
  const hmbBtn=document.getElementById("hmb");
  const header=document.getElementById("header");
  hmbBtn.addEventListener("click",function(){header.classList.toggle("active");
  });
</script>
</body>
</html>

	<!--<style>* {outline: 1px solid #FF0000;}</style>-->