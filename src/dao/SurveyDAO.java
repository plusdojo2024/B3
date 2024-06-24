package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Survey;
public class SurveyDAO {
	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Survey> select(Survey survey) {
		Connection conn = null;
		List<Survey> surveyList = new ArrayList<Survey>();

		try {
			// JDSurveyドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdSurvey:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "SELECT * FROM Survey WHERE customer_id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			if (survey.getCustomer_id() != null) {
				pStmt.setString(1, "%" + survey.getCustomer_id() + "%");
			}
			else {
				pStmt.setString(1, "%");
			}

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Survey record = new Survey(
				rs.getInt("id"),
				rs.getString("created_at"),
				rs.getString("updated_at"),
				rs.getString("customer_id"),
				rs.getString("evaluation"),
				rs.getString("good_point"),
				rs.getString("improvement")
				);
				surveyList.add(record);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			surveyList = null;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			surveyList = null;
		}
		finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					surveyList = null;
				}
			}
		}

		// 結果を返す
		return surveyList;
	}

	// 引数Surveyで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Survey Survey) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDSurveyドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdSurvey:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			String sql = "INSERT INTO Survey VALUES (NULL, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (Survey.getCustomer_id() != null && !Survey.getCustomer_id().equals("")) {
				pStmt.setString(1, Survey.getCustomer_id());
			}
			else {
				pStmt.setString(1, "（未設定）");
			}
			if (Survey.getEvaluation() != null && !Survey.getEvaluation().equals("")) {
				pStmt.setString(2, Survey.getEvaluation());
			}
			else {
				pStmt.setString(2, "（未設定）");
			}


			if (Survey.getGood_point() != null && !Survey.getGood_point().equals("")) {
				pStmt.setString(3, Survey.getGood_point());
			}
			else {
				pStmt.setString(3, "（未設定）");
			}
			if (Survey.getImprovement() != null && !Survey.getImprovement().equals("")) {
				pStmt.setString(4, Survey.getImprovement());
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

	// 引数Surveyで指定されたレコードを更新し、成功したらtrueを返す
	public boolean update(Survey Survey) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDSurveyドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdSurvey:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "UPDATE Survey SET updated_at=CURRENT_TIMESTAMP, evaluation=?, good_point=?, improvement=? WHERE customer_id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (Survey.getEvaluation() != null && !Survey.getEvaluation().equals("")) {
				pStmt.setString(1, Survey.getEvaluation());
			}
			else {
				pStmt.setString(1, null);
			}

			if (Survey.getGood_point() != null && !Survey.getGood_point().equals("")) {
				pStmt.setString(2, Survey.getGood_point());
			}
			else {
				pStmt.setString(2, null);
			}
			if (Survey.getImprovement() != null && !Survey.getImprovement().equals("")) {
				pStmt.setString(3, Survey.getImprovement());
			}

			else {
				pStmt.setString(3, null);
			}

			if (Survey.getCustomer_id() != null && !Survey.getCustomer_id().equals("")) {
				pStmt.setString(4, Survey.getCustomer_id());
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
