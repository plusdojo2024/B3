/**
 *
 */


 /*
var table = document.getElementById("card");
// -1で末尾に追加。インデックスで指定の位置に追加も可能
table.rows[0].deleteCell(-1);
*/

//ピン1を外す確認
const pinclick1=document.getElementById('pin1')
pinclick1.addEventListener("click", function() {
	if (window.confirm('ピンを外しますか？')) {
		// ピンを外し、カードを削除する
		var table = document.getElementById("card");
		// -1で末尾に追加。インデックスで指定の位置に追加も可能
		table.rows[0].deleteCell(0);
	} else {
		return false;
	}
});
//ピン2を外す確認
const pinclick2=document.getElementById('pin2')
pinclick2.addEventListener("click", function() {
	if (window.confirm('ピンを外しますか？')) {
		// ピンを外し、カードを削除する
		var table = document.getElementById("card");
		// -1で末尾に追加。インデックスで指定の位置に追加も可能
		table.rows[0].deleteCell(1);
	} else {
		return false;
	}
});
//ピン3を外す確認
const pinclick3=document.getElementById('pin3')
pinclick3.addEventListener("click", function() {
	if (window.confirm('ピンを外しますか？')) {
		// ピンを外し、カードを削除する
		var table = document.getElementById("card");
		// -1で末尾に追加。インデックスで指定の位置に追加も可能
		table.rows[0].deleteCell(2);
	} else {
		return false;
	}
});
