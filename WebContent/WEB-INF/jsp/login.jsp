<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<!-- スタイルシートの読み込みのサンプルです -->
<link rel="stylesheet" href="/B3/css/login.css">

</head>
<body>
<div class="container1">
    <div class="welcome">
      <div class="bluebox">
        <div class="signup nodisplay">
          <h2 class="title">SIGNUP</h2>
           <form class="more-padding" autocomplete="off" method="post" action="/simpleBC/SignupServlet">
            <input type="text" name="company_id" placeholder="企業ID">
            <input type="text" name="user"placeholder="ユーザーID">
            <input type="password" name="pw" placeholder="パスワード">
            <input type="password" name="confirmPw"placeholder="パスワードの確認">
            <input type="submit" name="great" value="サインアップ" >

          </form>
        </div>

        <div class="signin">
          <h2 class="title">LOGIN</h2>
         <form class="more-padding" autocomplete="off" method="post" action="/simpleBC/LoginServlet">
           <input type="text" name="id" placeholder="ユーザー名"><br>
            <input type="password" name="pw" placeholder="パスワード"><br>
            <div class="checkbox">
              <input type="checkbox" id="remember" /><label for="remember">パスワード表示する </label><br>
              <input type="checkbox" id="remember" /><label for="remember">ログイン状態保存する</label>
            </div>
              <div class="error-message" >※IDとパスワードを入力してください</div>
              <input type="submit" name="login" value="ログイン">
          </form>
        </div>
      </div>

      <div class="leftbox">
        <h1 class="title">KyoronP</h1>
        <img class="img1 img2 " src="img/women.png" >
        <p class="account">アカウントをお持ちですか？</p>
        <button class="button" id="signin">ログイン</button>
      </div>

      <div class="rightbox">
        <h1 class="title">KyoronP</h1>
        <img class="img1" src="img/men.png" >
        <p class="account">アカウントをお持ちでないですか？</p>
        <button class="button" id="signup">サインアップ</button>
      </div>

    </div>
  </div>
<script src="/B3/js/login.js"></script>
</body>
</html>