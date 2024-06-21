package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.SimulationCaketops;

public class SimulationCaketopsDAO {
	// 引数idで検索項目を指定し、検索結果を返す
	public List<SimulationCaketops> select(SimulationCaketops caketop) {
		Connection conn = null;
		List<SimulationCaketops> caketopList = new ArrayList<SimulationCaketops>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "SELECT CT.id, M.memo FROM SIMULATION_CAKETOPS AS CT Left OUTER JOIN MEMOS AS M ON M.id = CT.memo_id WHERE CT.id = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			if (caketop.getId() != 0) {
				pStmt.setInt(1, caketop.getId());
			}

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				SimulationCaketops record = new SimulationCaketops(
						rs.getInt("id"),
						rs.getString("memo"));
				caketopList.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			caketopList = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			caketopList = null;
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					caketopList = null;
				}
			}
		}

		// 結果を返す
		return caketopList;
	}

	// レコードを登録し、成功したらtrueを返す
		public boolean insert(SimulationCaketops caketop) {
			Connection conn = null;
			boolean result = false;
			int id = 0;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

				// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
				String sql = "INSERT INTO MEMOS VALUES (NULL, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (caketop.getMemo() != null && !caketop.getMemo().equals("")) {
					pStmt.setString(1, caketop.getMemo());
				}
				else {
					pStmt.setString(1, "（未設定）");
				}

				// SQL文を実行する
				if (pStmt.executeUpdate() == 1) {
					result = true;
					ResultSet rs = pStmt.getGeneratedKeys();
					id = rs.getInt(1);
				}

				// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
				sql = "INSERT INTO SIMULATION_CAKETOPS VALUES (NULL, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?)";
				pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (id != 0) {
					pStmt.setInt(1, id);
				}
				else {
					pStmt.setString(1, "（未設定）");
				}

				// SQL文を実行する
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

			// 結果を返す
			return result;
		}

		// お客様IDで指定されたレコードを更新し、成功したらtrueを返す
		public boolean update(SimulationCaketops caketop) {
			Connection conn = null;
			boolean result = false;

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

				// SQL文を準備する
				String sql = "UPDATE SIMULATION_CAKETOPS AS CT Left OUTER JOIN MEMOS AS M ON M.id = CT.memo_id SET CT.upadated_at = CURRENT_TIMESTAMP, M.memo = ? WHERE CT.id = ?";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (caketop.getMemo() != null && !caketop.getMemo().equals("")) {
					pStmt.setString(1, caketop.getMemo());
				}
				else {
					pStmt.setString(1, null);
				}
				if (caketop.getId() != 0) {
					pStmt.setInt(2, caketop.getId());
				}
				else {
					pStmt.setInt(2, 0);
				}

				// SQL文を実行する
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

			// 結果を返す
			return result;
		}
}
