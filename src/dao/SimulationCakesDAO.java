package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.SimulationCommon;

public class SimulationCakesDAO {
	// 引数idで検索項目を指定し、検索結果を返す
	public List<SimulationCommon> select(SimulationCommon table) {
		Connection conn = null;
		List<SimulationCommon> tableList = new ArrayList<SimulationCommon>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "SELECT * FROM SIMULATION_TABLES WHERE ID = ? ORDER BY ID";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			if ((Integer) table.getId() != null) {
				pStmt.setString(1, Integer.toString(table.getId()));
			}

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				SimulationCommon record = new SimulationCommon(
						rs.getInt("id"),
						rs.getTimestamp(null),
						rs.getTimestamp(null),
						rs.getString("name"),
						rs.getInt("price"),
						rs.getString("image"));
				tableList.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			tableList = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			tableList = null;
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					tableList = null;
				}
			}
		}

		// 結果を返す
		return tableList;
	}

	// 全件検索をして、検索結果を返す
	public List<SimulationCommon> allselect(SimulationCommon table) {
		Connection conn = null;
		List<SimulationCommon> tableList = new ArrayList<SimulationCommon>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "SELECT * FROM SIMULATION_TABLES ORDER BY ID";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				SimulationCommon record = new SimulationCommon(
						rs.getInt("id"),
						rs.getTimestamp(null),
						rs.getTimestamp(null),
						rs.getString("name"),
						rs.getInt("price"),
						rs.getString("image"));
				tableList.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			tableList = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			tableList = null;
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					tableList = null;
				}
			}
		}

		// 結果を返す
		return tableList;
	}
}
