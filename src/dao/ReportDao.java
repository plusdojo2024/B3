package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Report;

public class ReportDao{
	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Report> select(Report report) {
		Connection conn = null;
		List<Report> reportList = new ArrayList<Report>();

		try {
			// JDReportドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdReport:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "SELECT * FROM Report WHERE customer_id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			if (report.getCustomer_id() != null) {
				pStmt.setString(1, "%" + report.getCustomer_id() + "%");
			}
			else {
				pStmt.setString(1, "%");
			}

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Report record = new Report(
				rs.getInt("id"),
				rs.getString("created_at"),
				rs.getString("updated_at"),
				rs.getString("customer_id"),
				rs.getInt("headcount"),
				rs.getString("change"),
				rs.getString("improvement")
				);
				reportList.add(record);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			reportList = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			reportList = null;
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					reportList = null;
				}
			}
		}

		// 結果を返す
		return reportList;
	}

	// 引数reportで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Report report) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDReportドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdReport:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			String sql = "INSERT INTO Report VALUES (NULL, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (report.getCustomer_id() != null && !report.getCustomer_id().equals("")) {
				pStmt.setString(1, report.getCustomer_id());
			}
			else {
				pStmt.setString(1, "（未設定）");
			}
			if (report.getHeadcount() != 0 ) {
				pStmt.setInt(2, report.getHeadcount());
			}
			else {
				pStmt.setString(2, "0");
			}
			if (report.getChange() != null && !report.getChange().equals("")) {
				pStmt.setString(3, report.getChange());
			}
			else {
				pStmt.setString(3, "（未設定）");
			}
			if (report.getImprovement() != null && !report.getImprovement().equals("")) {
				pStmt.setString(4, report.getImprovement());
			}
			else {
				pStmt.setString(4, "（未設定）");
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

	// 引数reportで指定されたレコードを更新し、成功したらtrueを返す
	public boolean update(Report report) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDReportドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdReport:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "UPDATE Report SET updated_at=CURRENT_TIMESTAMP, headcount=?, change=?, improvement=? WHERE customer_id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (report.getHeadcount() != 0) {
				pStmt.setInt(1, report.getHeadcount());
			}
			else {
				pStmt.setInt(1, 0);
			}
			if (report.getChange() != null && !report.getChange().equals("")) {
				pStmt.setString(2, report.getChange());
			}
			else {
				pStmt.setString(2, null);
			}
			if (report.getImprovement() != null && !report.getImprovement().equals("")) {
				pStmt.setString(3, report.getImprovement());
			}
			else {
				pStmt.setString(3, null);
			}
			if (report.getCustomer_id() != null && !report.getCustomer_id().equals("")) {
				pStmt.setString(4, report.getCustomer_id());
			}
			else {
				pStmt.setString(4, null);
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

