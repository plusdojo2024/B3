package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.SimulationResult;

public class SimulationResultDAO {
	// 引数idで検索項目を指定し、検索結果を返す
	public List<SimulationResult> select(SimulationResult simresult) {
		Connection conn = null;
		List<SimulationResult> simresultList = new ArrayList<SimulationResult>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "SELECT * FROM SIMULATION_RESULTS WHERE customer_id = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			if (simresult.getCustomer_id() != 0) {
				pStmt.setInt(1, simresult.getCustomer_id());
			}

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				SimulationResult record = new SimulationResult(
						rs.getInt("id"),
						rs.getInt("customer_id"),
						rs.getInt("table_id"),
						rs.getInt("tablecover_id"),
						rs.getInt("chair_id"),
						rs.getInt("napkin_id"),
						rs.getInt("flower_id"),
						rs.getInt("clothes_id1"),
						rs.getInt("clothes_id2"),
						rs.getInt("cake_id"),
						rs.getInt("caketop_id"),
						rs.getInt("invitation_id"),
						rs.getInt("nameplate_id"),
						rs.getInt("table_memberid"));
				simresultList.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			simresultList = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			simresultList = null;
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					simresultList = null;
				}
			}
		}

		// 結果を返す
		return simresultList;
	}

	// レコードを登録し、成功したらtrueを返す
	public boolean insert(SimulationResult simresult) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			String sql = "INSERT INTO SIMULATION_RESULTS VALUES (NULL, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (simresult.getCustomer_id() != 0) {
				pStmt.setInt(1, simresult.getCustomer_id());
			} else {
				pStmt.setInt(1, 0);
			}
			if (simresult.getTable_id() != 0) {
				pStmt.setInt(2, simresult.getTable_id());
			} else {
				pStmt.setInt(2, 0);
			}
			if (simresult.getTablecover_id() != 0) {
				pStmt.setInt(3, simresult.getTablecover_id());
			} else {
				pStmt.setInt(3, 0);
			}
			if (simresult.getChair_id() != 0) {
				pStmt.setInt(4, simresult.getChair_id());
			} else {
				pStmt.setInt(4, 0);
			}
			if (simresult.getNapkin_id() != 0) {
				pStmt.setInt(5, simresult.getNapkin_id());
			} else {
				pStmt.setInt(5, 0);
			}
			if (simresult.getFlower_id() != 0) {
				pStmt.setInt(6, simresult.getFlower_id());
			} else {
				pStmt.setInt(6, 0);
			}
			if (simresult.getClothes_id1() != 0) {
				pStmt.setInt(7, simresult.getClothes_id1());
			} else {
				pStmt.setInt(7, 0);
			}
			if (simresult.getClothes_id2() != 0) {
				pStmt.setInt(8, simresult.getClothes_id2());
			} else {
				pStmt.setInt(8, 0);
			}
			if (simresult.getCake_id() != 0) {
				pStmt.setInt(9, simresult.getCake_id());
			} else {
				pStmt.setInt(9, 0);
			}
			if (simresult.getCaketop_id() != 0) {
				pStmt.setInt(10, simresult.getCaketop_id());
			} else {
				pStmt.setInt(10, 0);
			}
			if (simresult.getInvitation_id() != 0) {
				pStmt.setInt(11, simresult.getInvitation_id());
			} else {
				pStmt.setInt(11, 0);
			}
			if (simresult.getNameplate_id() != 0) {
				pStmt.setInt(12, simresult.getNameplate_id());
			} else {
				pStmt.setInt(12, 0);
			}
			if (simresult.getTablemember_id() != 0) {
				pStmt.setInt(13, simresult.getTablemember_id());
			} else {
				pStmt.setInt(13, 0);
			}

			// SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		// 結果を返す
		return result;
	}

	// お客様IDで指定されたレコードを更新し、成功したらtrueを返す
	public boolean update(SimulationResult simresult) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "UPDATE SIMULATION_RESULTS SET upadated_at = CURRENT_TIMESTAMP, table_id=?, tablecover_id=?, chair_id=?, napkin_id=?, flower_id=?, clothes_id1=?, clothes_id2=?, cake_id=?, caketop_id=?, invitation_id=?, nameplate_id=?, tablemember_id=? WHERE customer_id = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (simresult.getCustomer_id() != 0) {
				pStmt.setInt(12, simresult.getCustomer_id());
			} else {
				pStmt.setInt(12, 0);
			}
			if (simresult.getTable_id() != 0) {
				pStmt.setInt(1, simresult.getTable_id());
			} else {
				pStmt.setInt(1, 0);
			}
			if (simresult.getTablecover_id() != 0) {
				pStmt.setInt(2, simresult.getTablecover_id());
			} else {
				pStmt.setInt(2, 0);
			}
			if (simresult.getChair_id() != 0) {
				pStmt.setInt(3, simresult.getChair_id());
			} else {
				pStmt.setInt(3, 0);
			}
			if (simresult.getNapkin_id() != 0) {
				pStmt.setInt(4, simresult.getNapkin_id());
			} else {
				pStmt.setInt(4, 0);
			}
			if (simresult.getFlower_id() != 0) {
				pStmt.setInt(5, simresult.getFlower_id());
			} else {
				pStmt.setInt(5, 0);
			}
			if (simresult.getClothes_id1() != 0) {
				pStmt.setInt(6, simresult.getClothes_id1());
			} else {
				pStmt.setInt(6, 0);
			}
			if (simresult.getClothes_id2() != 0) {
				pStmt.setInt(7, simresult.getClothes_id2());
			} else {
				pStmt.setInt(7, 0);
			}
			if (simresult.getCake_id() != 0) {
				pStmt.setInt(8, simresult.getCake_id());
			} else {
				pStmt.setInt(8, 0);
			}
			if (simresult.getCaketop_id() != 0) {
				pStmt.setInt(9, simresult.getCaketop_id());
			} else {
				pStmt.setInt(9, 0);
			}
			if (simresult.getInvitation_id() != 0) {
				pStmt.setInt(10, simresult.getInvitation_id());
			} else {
				pStmt.setInt(10, 0);
			}
			if (simresult.getNameplate_id() != 0) {
				pStmt.setInt(11, simresult.getNameplate_id());
			} else {
				pStmt.setInt(11, 0);
			}
			if (simresult.getTablemember_id() != 0) {
				pStmt.setInt(12, simresult.getTablemember_id());
			} else {
				pStmt.setInt(12, 0);
			}

			// SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		// 結果を返す
		return result;
	}
}
