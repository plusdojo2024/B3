// login.js
$(document).ready(function() {
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

    // ログインフォームが送信された時の処理
    $('.signin form').submit(function(event) {
        // ユーザー名とパスワードの値を取得
        var username = $(this).find('input[type="text"]').val();
        var password = $(this).find('input[type="password"]').val();
        // ユーザー名またはパスワードが空の場合はエラーメッセージを表示
        if (!username || !password) {
            $('.error-message').show();
            event.preventDefault(); // フォームの送信をキャンセル
        } else {
            $('.error-message').hide(); // エラーメッセージを非表示
        }
    });
});
