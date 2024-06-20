package test;

import java.util.List;

import dao.SimulationTablesDAO;
import model.SimulationCommon;


public class SimulationTablesDAOtest {
	public static void main(String[] args) {
		SimulationTablesDAO dao = new SimulationTablesDAO();
		List<SimulationCommon> tableList;

		// allselectメソッドのテスト
		System.out.println("<< selectメソッドのテスト（すべてのレコードを検索します）>>");
		tableList = dao.allselect(new SimulationCommon());
		for (SimulationCommon table : tableList) {
			System.out.println("ID：" + table.getId());
			System.out.println("Created_at：" + table.getCreated_at());
			System.out.println("updated_at：" + table.getUpdated_at());
			System.out.println("商品名：" + table.getName());
			System.out.println("値段：" + table.getPrice());
			System.out.println("画像パス：" + table.getImage());
			System.out.println();
		}

		SimulationTablesDAO dao2 = new SimulationTablesDAO();
		List<SimulationCommon> tableList2;

		// allselectメソッドのテスト
		System.out.println("<< selectメソッドのテスト（idが一致するレコードを検索します）>>");
		SimulationCommon thetable = new SimulationCommon(1,null,null,"",1,"");
		tableList2 = dao2.select(thetable);
		for (SimulationCommon table2 : tableList2) {
			System.out.println("ID：" + table2.getId());
			System.out.println("Created_at：" + table2.getCreated_at());
			System.out.println("updated_at：" + table2.getUpdated_at());
			System.out.println("商品名：" + table2.getName());
			System.out.println("値段：" + table2.getPrice());
			System.out.println("画像パス：" + table2.getImage());
			System.out.println();
		}
	}
}
