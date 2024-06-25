function calculateRemainingDays() {
	//Htmlの期日を取得する
	const targetDateInput = document.getElementById("ded");
	const targetDateValue = targetDateInput.value;

	if (targetDateValue) {
		const targetDate = new Date(targetDateValue);
		//現在の日時を取得
		const now = new Date();
		//日数を引く
		const timeDifference = targetDate.getTime() - now.getTime();
		//乗算を行い、数値を合わせる。
		const remainingDays = Math.ceil(timeDifference / (24 * 60 * 60 * 1000));
		//それぞれのspanに表示する
		document.getElementById("event_name").innerText = "指定日まで";
		document.getElementById("days").innerText = remainingDays + "日";
	} else {
		alert("日付を選択してください。");
	}
}
