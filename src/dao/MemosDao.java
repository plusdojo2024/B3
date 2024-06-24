
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Memos;

public class MemosDao {
	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Memos> select(Memos memo) {
		Connection conn = null;
		List<Memos> memoList = new ArrayList<Memos>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");


			//SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			//項目を増やす場合は(NULL,
			String sql = "INSERT INTO MEMOS (created_at,updated_at,memo) VALUES (CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる

			if (memo.getMemo() != null) {
				pStmt.setString(1, "%" + memo.getMemo() + "%");
			} else {
				pStmt.setString(1, "%");
			}

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Memos record = new Memos(
						rs.getInt("id"),
						rs.getString("created_at"),
						rs.getString("idupdated_at"),
						rs.getString("memo"));

				memoList.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			memoList = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			memoList = null;
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					memoList = null;
				}
			}
		}

		// 結果を返す
		return memoList;
	}

	// 引数memoで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Memos memo) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			String sql = "INSERT INTO Memos VALUES (NULL, CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, ? )";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (memo.getMemo() != null && !memo.getMemo().equals("")) {
				pStmt.setString(1, memo.getMemo());
			} else {
				pStmt.setString(1, "（未設定）");
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

	// 引数memoで指定されたレコードを更新し、成功したらtrueを返す
	public boolean update(Memos memo) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "UPDATE  SET updated_at=CURRENT_TIMESTAMP, memo=?,  WHERE id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (memo.getMemo() != null && !memo.getMemo().equals("")) {
				pStmt.setString(1, memo.getMemo());
			} else {
				pStmt.setString(1, null);
			}


			pStmt.setInt(4, memo.getId());

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

