package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.SimulationTablemembers;

public class SimulationTablemembersDAO {
	// 引数idで検索項目を指定し、検索結果を返す
	public List<SimulationTablemembers> select(SimulationTablemembers tmember) {
		Connection conn = null;
		List<SimulationTablemembers> tmemberList = new ArrayList<SimulationTablemembers>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "SELECT * FROM SIMULATION_TABLEMEMBERS WHERE id = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			if (tmember.getId() != 0) {
				pStmt.setInt(1, tmember.getId());
			}

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				SimulationTablemembers record = new SimulationTablemembers(
						rs.getInt("id"),
						rs.getInt("number"),
						rs.getString("image"));
				tmemberList.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			tmemberList = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			tmemberList = null;
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					tmemberList = null;
				}
			}
		}

		// 結果を返す
		return tmemberList;
	}

	// レコードを登録し、成功したらtrueを返す
	public boolean insert(SimulationTablemembers tmember) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			String sql = "INSERT INTO SIMULATION_TABLEMEMBERS VALUES (NULL, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (tmember.getNumber() != 0) {
				pStmt.setInt(1, tmember.getNumber());
			} else {
				pStmt.setInt(1,0);
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
	public boolean update(SimulationTablemembers tmember) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "UPDATE SIMULATION_TABLEMEMBERS SET upadated_at = CURRENT_TIMESTAMP, number=?, image=? WHERE id = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (tmember.getNumber() != 0) {
				pStmt.setInt(1, tmember.getNumber());
			} else {
				pStmt.setInt(1, 0);
			}
			if (tmember.getImage() != null && !tmember.getImage().equals("")) {
				pStmt.setString(2, tmember.getImage());
			} else {
				pStmt.setString(2, null);
			}
			if (tmember.getId() != 0) {
				pStmt.setInt(3, tmember.getId());
			} else {
				pStmt.setInt(3, 0);
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
