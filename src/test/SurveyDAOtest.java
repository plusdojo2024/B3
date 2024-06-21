package test;

//public class SurveyDAOtest {
//	public static void main(String[] args) {
//		SurveyDao Dao = new SurveyDao();
//		List<Survey> surveyList;

		// selectメソッドのテスト
/*		System.out.println("<< selectメソッドのテスト（すべてのレコードを検索します）>>");
		surveyList = Dao.select(new Survey());
		for (Survey survey : surveyList) {
			System.out.println("番号：" + survey.getNumber());
			System.out.println("会社名：" + survey.getCompany());
			System.out.println("部署名：" + survey.getDepartment());
			System.out.println("役職名：" + survey.getPosition());
			System.out.println("氏名：" + survey.getName());
			System.out.println("郵便番号：" + survey.getZipcode());
			System.out.println("住所：" + survey.getAddress());
			System.out.println("電話番号：" + survey.getPhone());
			System.out.println("FAX番号：" + survey.getFax());
			System.out.println("メールアドレス：" + survey.getEmail());
			System.out.println("備考：" + survey.getRemarks());
			System.out.println();
		}
*/

/*
		// insertメソッドのテスト
		int upDelNumber = 0;		// 後で更新および削除する番号
		System.out.println("<< insertメソッドのテスト（1件のレコードを登録します）>>");
		Survey insRec = new Survey(0, "挿入", "挿入", "挿入", "挿入", "挿入", "挿入", "挿入", "挿入", "挿入", "挿入");
		if (Dao.insert(insRec)) {
			System.out.println("登録成功！");
			surveyList = Dao.select(insRec);
			for (Survey survey : surveyList) {
				upDelNumber = survey.getNumber();	// 最後のレコードを後で更新および削除する
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
		Survey upRec = new Survey(upDelNumber, "更新", "更新", "更新", "更新", "更新", "更新", "更新", "更新", "更新", "更新");
		if (Dao.update(upRec)) {
			System.out.println("更新成功！");
			surveyList = Dao.select(upRec);
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
