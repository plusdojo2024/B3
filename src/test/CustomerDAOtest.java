package test;

import java.util.List;

import dao.CustomerDAO;
import model.Customer;

public class CustomerDAOtest {
	public static void main(String[] args) throws ClassNotFoundException {
		CustomerDAO dao = new CustomerDAO();
		List<Customer> cardList;

		//selectメソッドのテスト
		System.out.println("<< selectメソッドのテスト（すべてのレコードを検索します）>>");
		cardList = dao.select(new Customer());	//特定の項目だけをしたかったら()内に引数？
		for (Customer card : cardList) {
			System.out.println("ID：" + card.getId());
			System.out.println("苗字１：" + card.getLname_1());
			System.out.println("名前１：" + card.getFname_1());
			System.out.println("フリガナ１：" + card.getLfurigana_1());
			System.out.println("フリガナ１：" + card.getFfurigana_1());
			System.out.println("電話２：" + card.getTel_1());
			System.out.println("苗字２：" + card.getLname_2());
			System.out.println("名前２：" + card.getFname_2());
			System.out.println("フリガナ２：" + card.getLfurigana_2());
			System.out.println("フリガナ２：" + card.getFfurigana_2());
			System.out.println("電話２：" + card.getTel_2());
			System.out.println("住所：" + card.getAddress());
			System.out.println("希望日：" + card.getThedate());
			System.out.println("備考欄：" + card.getMemo_id());
			System.out.println("ピン：" + card.getPin());
		}


		//insertメソッドのテスト
		int upDelNumber = 0;
		System.out.println("<< insertメソッドのテスト（１件のレコードを登録します）>>");
		//引数のあるコンストラクタ
		Customer insRec = new Customer(0, "", "", "山田", "太郎", "ヤマダ", "タロウ",
				"0011112222", "田中", "花子", "タナカ", "ハナコ", "3344445555", "東京都", "2024-01-01", "", true);

		if (dao.insert(insRec)) {
			System.out.println("登録成功");
			cardList = dao.select(insRec);
			for (Customer card : cardList) {
				upDelNumber = card.getId();
			}
		} else {
			System.out.println("登録失敗！");
		}
		System.out.println();


	}
}

