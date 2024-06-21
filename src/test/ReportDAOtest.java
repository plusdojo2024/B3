package test;

//public class ReportDAOtest {
//	public static void main(String[] args) {
//		ReportDao Dao = new ReportDao();
//		List<Report> reportList;

		// selectメソッドのテスト
/*		System.out.println("<< selectメソッドのテスト（すべてのレコードを検索します）>>");
		reportList = Dao.select(new Report());
		for (Report report : reportList) {
			System.out.println("番号：" + report.getNumber());
			System.out.println("会社名：" + report.getCompany());
			System.out.println("部署名：" + report.getDepartment());
			System.out.println("役職名：" + report.getPosition());
			System.out.println("氏名：" + report.getName());
			System.out.println("郵便番号：" + report.getZipcode());
			System.out.println("住所：" + report.getAddress());
			System.out.println("電話番号：" + report.getPhone());
			System.out.println("FAX番号：" + report.getFax());
			System.out.println("メールアドレス：" + report.getEmail());
			System.out.println("備考：" + report.getRemarks());
			System.out.println();
		}
*/

/*
		// insertメソッドのテスト
		int upDelNumber = 0;		// 後で更新および削除する番号
		System.out.println("<< insertメソッドのテスト（1件のレコードを登録します）>>");
		Report insRec = new Report(0, "挿入", "挿入", "挿入", "挿入", "挿入", "挿入", "挿入", "挿入", "挿入", "挿入");
		if (Dao.insert(insRec)) {
			System.out.println("登録成功！");
			reportList = Dao.select(insRec);
			for (Report report : reportList) {
				upDelNumber = report.getNumber();	// 最後のレコードを後で更新および削除する
			}
		}
		else {
			System.out.println("登録失敗！");
		}
		System.out.println();
*/

/*
		// updateメソッドのテスト
		System.out.println("<< updateメソッドのテスト（1件のレコードを更新します）>>");
		Report upRec = new Report(upDelNumber, "更新", "更新", "更新", "更新", "更新", "更新", "更新", "更新", "更新", "更新");
		if (Dao.update(upRec)) {
			System.out.println("更新成功！");
			reportList = Dao.select(upRec);
		}
		else {
			System.out.println("更新失敗！");
		}
		System.out.println();

		// deleteメソッドのテスト
		System.out.println("<< deleteメソッドのテスト（1件のレコードを削除します）>>");
		if (Dao.delete(upDelNumber)) {
			System.out.println("削除成功！");
		}
		else {
			System.out.println("削除失敗！");
		}
	}
}
*/