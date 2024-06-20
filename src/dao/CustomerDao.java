package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Customer;

public class CustomerDAO {
	//登録
	public boolean insert(Customer info) {
		Connection conn = null;
		boolean result = false;

		try {
			//ドライバを読み込む
			Class.forName("org.h2.Driver");

			//データベースに接続
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3");

			//SQL文を準備する
			String sql = "INSERT INTO CUSTOMER VALUES (NULL, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,"
					+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SQL文を完成させる
			if (info.getLname_1() != null && !info.getLname_1().equals("")) {
				pStmt.setString(1, info.getLname_1());
			} else {
				pStmt.setString(1, "未記入");
			}
			if (info.getFname_1() != null && !info.getFname_1().equals("")) {
				pStmt.setString(2, info.getFname_1());
			} else {
				pStmt.setString(2, "未記入");
			}
			if (info.getLfurigana_1() != null && !info.getLfurigana_1().equals("")) {
				pStmt.setString(3, info.getLfurigana_1());
			} else {
				pStmt.setString(3, "未記入");
			}
			if (info.getFfurigana_1() != null && !info.getFfurigana_1().equals("")) {
				pStmt.setString(4, info.getFfurigana_1());
			} else {
				pStmt.setString(4, "未記入");
			}
			if (info.getTel_1() != null && !info.getTel_1().equals("")) {
				pStmt.setString(5, info.getTel_1());
			} else {
				pStmt.setString(5, "未記入");
			}
			if (info.getLname_2() != null && !info.getLname_2().equals("")) {
				pStmt.setString(6, info.getLname_2());
			} else {
				pStmt.setString(6, "未記入");
			}
			if (info.getFname_2() != null && !info.getFname_2().equals("")) {
				pStmt.setString(7, info.getFname_2());
			} else {
				pStmt.setString(7, "未記入");
			}
			if (info.getLfurigana_2() != null && !info.getLfurigana_2().equals("")) {
				pStmt.setString(8, info.getLfurigana_2());
			} else {
				pStmt.setString(8, "未記入");
			}
			if (info.getFfurigana_2() != null && !info.getFfurigana_2().equals("")) {
				pStmt.setString(9, info.getFfurigana_2());
			} else {
				pStmt.setString(9, "未記入");
			}
			if (info.getTel_2() != null && !info.getTel_2().equals("")) {
				pStmt.setString(10, info.getTel_2());
			} else {
				pStmt.setString(10, "未記入");
			}
			if (info.getAddress() != null && !info.getAddress().equals("")) {
				pStmt.setString(11, info.getAddress());
			} else {
				pStmt.setString(11, "未記入");
			}
			if (info.getThedate() != null && !info.getThedate().equals("")) {
				pStmt.setString(12, info.getThedate());
			} else {
				pStmt.setString(12, "未記入");
			}
			if (info.getMemo_id() != null && !info.getMemo_id().equals("")) {
				pStmt.setString(13, info.getMemo_id());
			} else {
				pStmt.setString(13, "未記入");
			}

			//SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		//結果を返す
		return result;
	}
}
