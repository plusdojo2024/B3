function calculateRemainingDays() {
	//dedのdateを持ってくる
	const targetDateInput = document.getElementById("ded");
	const targetDateValue = targetDateInput.value;
	//チェックボックスの状態を持ってくる。
	const checkbox = document.getElementById("check");
	const isChecked = checkbox.checked;

	if (targetDateValue) {
		const targetDate = new Date(targetDateValue);
		//現在の日時を取得
		const now = new Date();
		//日数を引く
		const timeDifference = targetDate.getTime() - now.getTime();
		//乗算を行い、ミリ秒から数値を合わせる。
		//Math.ceilは必要ないかも、うるう秒を考慮
		const remainingDays = Math.ceil(timeDifference / (24 * 60 * 60 * 1000));
		//それぞれのspanに表示する
		document.getElementById("event_name").innerText = "残り";
		document.getElementById("days").innerText = remainingDays + "日";
	} else {
		alert("日付を選択してください。");
	}
}

function toggleRemainingDays() {
	const checkbox = document.getElementById("check");
	const isChecked = checkbox.checked;

	if (isChecked) {
		// チェックボックスがオフの場合は非表示
		document.getElementById("event_name").innerText = "";
		document.getElementById("days").innerText = "";
	} else {
		// チェックボックスがオンの場合は表示
		calculateRemainingDays();
	}
}


/*      function goOrederlist() {
  alert("functionはいったよ！");
  //入力値を取得してくる
  let testData1 = document.getElementById('test_data1').value;
  let testData2 = document.getElementById('test_data2').value;
  let testData3 = document.getElementById('test_data3').value;

  //{変数名：中に入れるもの}みたいに書いて、複数の値をpostData変数に格納
  let postData = { data1: testData1, data2: testData2, data3: testData3 }


  //非同期通信始めるよ
  $.ajaxSetup({ scriptCharset: 'utf-8' });
  $.ajax({
	  //どのサーブレットに送るか
	  //ajaxSampleのところは自分のプロジェクト名に変更する必要あり。
	  url: '/simpleBC/AjaxSampleServlet',
	  //どのメソッドを使用するか
	  type: "POST",
	  //受け取るデータのタイプ
	  dataType: "json",
	  //何をサーブレットに飛ばすか（変数を記述）
	  data: postData,
	  //この下の２行はとりあえず書いてる（書かなくても大丈夫？）
	  processDate: false,
	  timeStamp: new Date().getTime()
	  //非同期通信が成功したときの処理
  }).done(function(data) {
	  alert("成功1");

  })
	  //非同期通信が失敗したときの処理
	  .fail(function() {
		  //失敗とアラートを出す
		  alert("失敗！");
	  });
}
*/