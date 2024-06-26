package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class CustomerDAO {
	//お客様情報登録
	public boolean insert(Customer info) {
		Connection conn = null;
		boolean result = false;

		try {
			//ドライバを読み込む
			Class.forName("org.h2.Driver");

			//データベースに接続
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			//SQL文を準備する
			String sql = "INSERT INTO CUSTOMERS VALUES (NULL, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,"
					+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
				pStmt.setString(12, "");
			}
			if (info.getMemo_id() != null && !info.getMemo_id().equals("")) {
				pStmt.setInt(13, Integer.parseInt(info.getMemo_id()));
			} else {
				pStmt.setInt(13, 0);
			}
			if (info.getPin() != false) {
				pStmt.setBoolean(14, true);
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


	//お客様情報検索
	public List<Customer> select(Customer info) {
		Connection conn = null;
		List<Customer> customerList = new ArrayList<Customer>();

		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");
			String sql = "SELECT * FROM Customers WHERE lname_1 LIKE ? AND fname_1 LIKE ? AND lfurigana_1 LIKE ? AND ffurigana_1 LIKE ? AND lname_2 LIKE ? AND fname_2 LIKE ? AND lfurigana_2 LIKE ? AND ffurigana_2 LIKE ? AND thedate LIKE ? AND memo_id = ? AND pin LiKE ? ORDER BY id";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			if (info.getLname_1() != null) {
				pStmt.setString(1, "%" + info.getLname_1() + "%");
			} else {
				pStmt.setString(1, "%");
			}
			if (info.getFname_1() != null) {
				pStmt.setString(2, "%" + info.getFname_1() + "%");
			} else {
				pStmt.setString(2, "%");
			}
			if (info.getLfurigana_1() != null) {
				pStmt.setString(3, "%" + info.getLfurigana_1() + "%");
			} else {
				pStmt.setString(3, "%");
			}
			if (info.getFfurigana_1() != null) {
				pStmt.setString(4, "%" + info.getFfurigana_1() + "%");
			} else {
				pStmt.setString(4, "%");
			}
			if (info.getLname_2() != null) {
				pStmt.setString(5, "%" + info.getLname_2() + "%");
			} else {
				pStmt.setString(5, "%");
			}
			if (info.getFname_2() != null) {
				pStmt.setString(6, "%" + info.getFname_2() + "%");
			} else {
				pStmt.setString(6, "%");
			}
			if (info.getLfurigana_2() != null) {
				pStmt.setString(7, "%" + info.getLfurigana_2() + "%");
			} else {
				pStmt.setString(7, "%");
			}
			if (info.getFfurigana_2() != null) {
				pStmt.setString(8, "%" + info.getFfurigana_2() + "%");
			} else {
				pStmt.setString(8, "%");
			}
			if (info.getThedate() != null) {
				pStmt.setString(9, "%" + info.getThedate() + "%");
			} else {
				pStmt.setString(9, "%");
			}
			if (info.getMemo_id() != null) {
				pStmt.setInt(10, Integer.parseInt(info.getMemo_id()) );
			} else {
				pStmt.setInt(10, 0);
			}
			if (info.getPin()) {
				pStmt.setString(11, "%" + info.getPin() + "%");
			} else {
				pStmt.setString(11, "%");
			}
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				Customer record = new Customer(
				rs.getInt("id"),
				rs.getString("lname_1"),
				rs.getString("fname_1"),
				rs.getString("lfurigana_1"),
				rs.getString("ffurigana_1"),
				rs.getString("tel_1"),
				rs.getString("lname_2"),
				rs.getString("fname_2"),
				rs.getString("lfurigana_2"),
				rs.getString("ffurigana_2"),
				rs.getString("tel_2"),
				rs.getString("address"),
				rs.getString("thedate"),
				rs.getString("memo_id"),
				rs.getBoolean("pin")
				);
				customerList.add(record);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			customerList = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			customerList = null;
		}
		finally {
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					customerList = null;
				}
			}
		}
		return customerList;
	}


	//お客様情報編集
	public boolean update(Customer info) {
		Connection conn = null;
		boolean result = false;

		try {
			Class .forName("org.h2.Driver");

			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			String sql = "UPDATE Customer SET lname_1=?, fname_1=?, lfurigana_1=?, ffurigana_1=? tel_1=?, "
					+ "lname_2=?, fname_2=?, lfurigana_2=?, ffurigana_2=?,tel_2=?,"
					+ "address=?, thedate=?, memo_id=? WHERE id=?";

			PreparedStatement pStmt = conn.prepareStatement(sql);
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
			pStmt.setInt(14, info.getId());

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
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
