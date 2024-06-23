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
         <form id="signupForm" class="more-padding" autocomplete="off" method="post" action="/B3/SignupServlet">
            <input type="text" name="companyId" placeholder="企業ID">
            <input type="text" name="user"placeholder="ユーザーID">
            <input type="password" name="pw" placeholder="パスワード">
            <input type="password" name="confirmPw"placeholder="パスワードの確認">
            <input type="submit" name="great" value="サインアップ" >

          </form>
        </div>

        <div class="signin">
          <h2 class="title">LOGIN</h2>
         <form class="more-padding" autocomplete="off" method="post" action="/B3/LoginServlet">
           <input type="text" name="id" placeholder="ユーザー名"><br>
            <input type="password" name="pw" placeholder="パスワード"><br>
            <div class="checkbox">
              <input type="checkbox" id="showPassword" /><label for="showPassword">パスワード表示する </label><br>
              <input type="checkbox" id="saveLoginState" /><label for="showPassword">ログイン状態保存する</label>
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
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script>
    $(document).ready(function(){
      // サインアップボタンがクリックされた時の処理
      $('#signup').click(function() {
        $('.bluebox').css('transform', 'translateX(80%)');
        $('.signin').addClass('nodisplay');
        $('.signup').removeClass('nodisplay');
      });

      // ログインボタンがクリックされた時の処理
      $('#signin').click(function() {
        $('.bluebox').css('transform', 'translateX(0%)');
        $('.signup').addClass('nodisplay');
        $('.signin').removeClass('nodisplay');
      });


      // サインアップフォームが送信された時の処理
      $('#signupForm').submit(function(event) {
          // パスワードとパスワードの確認が一致しているかを確認
          var pw = $('#signupForm input[name="pw"]').val();
          var confirmPw = $('#signupForm input[name="confirmPw"]').val();
          if (pw !== confirmPw) {
              alert('パスワードが一致しません');
              event.preventDefault(); // フォームの送信をキャンセル
          }
      });

      // ログインフォームが送信された時の処理
      $('#loginForm').submit(function(event) {
          // ユーザー名とパスワードの値を取得
          var username = $('#loginForm input[name="id"]').val();
          var password = $('#loginForm input[name="pw"]').val();
          // ユーザー名またはパスワードが空の場合はエラーメッセージを表示
          if (!username || !password) {
              $('.error-message').show();
              event.preventDefault(); // フォームの送信をキャンセル
          } else {
              $('.error-message').hide(); // エラーメッセージを非表示
          }
      });
  });

  </script>


</body>
</html>