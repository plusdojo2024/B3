package test;

import java.util.List;

import dao.CustomerDAO;
import model.Customer;

public class CustomerDAOtest {
	public static void main(String[] args) throws ClassNotFoundException {
		CustomerDAO dao = new CustomerDAO();
		List<Customer> cardList;

		//insertメソッドのテスト
		int upDelNumber = 0;
		System.out.println("<< insertメソッドのテスト（１件のレコードを登録します）>>");
		//引数のあるコンストラクタ
		Customer insRec = new Customer(0, "テスト", "テスト", "テスト", "テスト", "テスト", "テスト",
				"テスト", "テスト", "テスト", "テスト", "テスト", "テスト", "テスト", "テスト", "テスト");

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
