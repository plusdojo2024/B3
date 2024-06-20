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
			String sql = "SELECT CT.id, M.memo FROM SIMULATION_CAKETOPS AS CT Left OUTER JOIN MEMOS AS M ON M.id = CT.memo_id WHERE M.id = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			if ((Integer) caketop.getId() != null) {
				pStmt.setString(1, Integer.toString(caketop.getId()));
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

			try {
				// JDBCドライバを読み込む
				Class.forName("org.h2.Driver");

				// データベースに接続する
				conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/simpleBC", "sa", "");

				// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
				String sql = "INSERT INTO MEMOS VALUES (NULL, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (caketop.getMemo_id() != null && !caketop.getMemo_id().equals("")) {
					pStmt.setString(1, caketop.getMemo_id());
				}
				else {
					pStmt.setString(1, "（未設定）");
				}

				// SQL文を実行する
				if (pStmt.executeUpdate() == 1) {
					result = true;
				}

				// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
				sql = "INSERT INTO SIMULATION_CAKETOPS VALUES (NULL, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?)";
				pStmt = conn.prepareStatement(sql);

				// SQL文を完成させる
				if (caketop.getMemo_id() != null && !caketop.getMemo_id().equals("")) {
					pStmt.setString(1, caketop.getMemo_id());
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
}
