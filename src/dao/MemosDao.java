/*
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

			// SQL文を準備する
			String sql = "SELECT * FROM Memos WHERE  created_at LIKE ? AND idupdated_at LIKE ? AND memo LIKE ? ORDER BY id";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			if (memo.getCreated_at() != null) {
				pStmt.setString(1, "%" + memo.getCreated_at() + "%");
			} else {
				pStmt.setString(1, "%");
			}
			/*
			if (memo.getIdupdated_at() != null) {
				pStmt.setString(2, "%" + memo.getIdupdated_at() + "%");

			if (card.getUpdated_at() != null) {
				pStmt.setString(2, "%" + card.getUpdated_at() + "%");

			} else {
				pStmt.setString(2, "%");
			}
			if (memo.getMemo() != null) {
				pStmt.setString(3, "%" + memo.getMemo() + "%");
			} else {
				pStmt.setString(3, "%");
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
			String sql = "INSERT INTO Memos VALUES (NULL, ?, ?, ? )";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (memo.getCreated_at() != null && !memo.getCreated_at().equals("")) {
				pStmt.setString(1, memo.getCreated_at());
			} else {
				pStmt.setString(1, "（未設定）");
			}
<<<<<<< HEAD
			if (memo.getIdupdated_at() != null && !memo.getIdupdated_at().equals("")) {
				pStmt.setString(2, memo.getIdupdated_at());
=======
			if (card.getUpdated_at() != null && !card.getUpdated_at().equals("")) {
				pStmt.setString(2, card.getUpdated_at());
>>>>>>> 91a7b1d6f977e32397a3b9ebce533903f57464f4
			} else {
				pStmt.setString(2, "（未設定）");
			}
			if (memo.getMemo() != null && !memo.getMemo().equals("")) {
				pStmt.setString(3, memo.getMemo());
			} else {
				pStmt.setString(3, "（未設定）");
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
			String sql = "UPDATE  SET created_at=?, idupdated_at=?, memo=?,  WHERE id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (memo.getCreated_at() != null && !memo.getCreated_at().equals("")) {
				pStmt.setString(1, memo.getCreated_at());
			} else {
				pStmt.setString(1, null);
			}
<<<<<<< HEAD
			if (memo.getIdupdated_at() != null && !memo.getIdupdated_at().equals("")) {
				pStmt.setString(2, memo.getIdupdated_at());
=======
			if (card.getUpdated_at() != null && !card.getUpdated_at().equals("")) {
				pStmt.setString(2, card.getUpdated_at());
>>>>>>> 91a7b1d6f977e32397a3b9ebce533903f57464f4
			} else {
				pStmt.setString(2, null);
			}
			if (memo.getMemo() != null && !memo.getMemo().equals("")) {
				pStmt.setString(3, memo.getMemo());
			} else {
				pStmt.setString(3, null);
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
*/
