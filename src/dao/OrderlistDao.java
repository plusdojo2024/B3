package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Orderlist;

public class OrderlistDao {
	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Orderlist> select(Orderlist card) {
		Connection conn = null;
		List<Orderlist> cardList = new ArrayList<Orderlist>();

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "SELECT * FROM Orderlist WHERE created_at LIKE ? AND idupdated_at LIKE ? AND customer_id LIKE ? AND table_id LIKE ? AND tablecover_id LIKE ? AND chair_id LIKE ? AND napkin_id LIKE ? AND flower_id LIKE ? AND clothes_id LIKE ? AND cake_id LIKE ? AND caketop_id LIKE ? AND invitation_id LIKE ? AND nameplate_id LIKE ? AND tablemember_id LIKE ? AND deadlines LIKE ? AND memo_id LIKE ? AND number LIKE ? ORDER BY id";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			if (card.getCreated_at() != null) {
				pStmt.setString(1, "%" + card.getCreated_at() + "%");
			} else {
				pStmt.setString(1, "%");
			}
			if (card.getIdupdated_at() != null) {
				pStmt.setString(2, "%" + card.getIdupdated_at() + "%");
			} else {
				pStmt.setString(2, "%");
			}
			if (card.getCustomer_id() != null) {
				pStmt.setString(3, "%" + card.getCustomer_id() + "%");
			} else {
				pStmt.setString(3, "%");
			}
			if (card.getTable_id() != null) {
				pStmt.setString(4, "%" + card.getTable_id() + "%");
			} else {
				pStmt.setString(4, "%");
			}
			if (card.getTablecover_id() != null) {
				pStmt.setString(5, "%" + card.getTablecover_id() + "%");
			} else {
				pStmt.setString(5, "%");
			}
			if (card.getChair_id() != null) {
				pStmt.setString(6, "%" + card.getChair_id() + "%");
			} else {
				pStmt.setString(6, "%");
			}
			if (card.getNapkin_id() != null) {
				pStmt.setString(7, "%" + card.getNapkin_id() + "%");
			} else {
				pStmt.setString(7, "%");
			}
			if (card.getFlower_id() != null) {
				pStmt.setString(8, "%" + card.getFlower_id() + "%");
			} else {
				pStmt.setString(8, "%");
			}
			if (card.getClothes_id() != null) {
				pStmt.setString(9, "%" + card.getClothes_id() + "%");
			} else {
				pStmt.setString(9, "%");
			}
			if (card.getCake_id() != null) {
				pStmt.setString(10, "%" + card.getCake_id() + "%");
			} else {
				pStmt.setString(10, "%");
			}
			if (card.getCaketop_id() != null) {
				pStmt.setString(11, "%" + card.getCaketop_id() + "%");
			} else {
				pStmt.setString(11, "%");
			}
			if (card.getInvitation_id() != null) {
				pStmt.setString(12, "%" + card.getInvitation_id() + "%");
			} else {
				pStmt.setString(12, "%");
			}
			if (card.getNameplate_id() != null) {
				pStmt.setString(13, "%" + card.getNameplate_id() + "%");
			} else {
				pStmt.setString(13, "%");
			}
			if (card.getTablemember_id() != null) {
				pStmt.setString(14, "%" + card.getTablemember_id() + "%");
			} else {
				pStmt.setString(14, "%");
			}
			if (card.getDeadlines() != null) {
				pStmt.setString(15, "%" + card.getDeadlines() + "%");
			} else {
				pStmt.setString(15, "%");
			}
			if (card.getMemo_id() != null) {
				pStmt.setString(16, "%" + card.getMemo_id() + "%");
			} else {
				pStmt.setString(16, "%");
			}
			if (card.getNumber() != null) {
				pStmt.setString(17, "%" + card.getNumber() + "%");
			} else {
				pStmt.setString(17, "%");
			}


			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Orderlist record = new Orderlist(
						rs.getInt("created_at"),
						rs.getString("idupdated_at"),
						rs.getString("customer_id"),
						rs.getString("table_id"),
						rs.getString("tablecover_id"),
						rs.getString("chair_id"),
						rs.getString("napkin_id"),
						rs.getString("flower_id"),
						rs.getString("clothes_id"),
						rs.getString("cake_id"),
						rs.getString("caketop_id"),
						rs.getString("invitation_id"),
						rs.getString("nameplate_id"),
						rs.getString("tablemember_id"),
						rs.getString("deadlines"),
						rs.getString("memo_id"),
						rs.getString("number"));
				cardList.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			cardList = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			cardList = null;
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					cardList = null;
				}
			}
		}

		// 結果を返す
		return cardList;
	}

	// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Orderlist card) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			String sql = "INSERT INTO Orderlists VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (card.getCreated_at() != null && !card.getCreated_at().equals("")) {
				pStmt.setString(1, card.getCreated_at());
			} else {
				pStmt.setString(1, "（未設定）");
			}
			if (card.getIdupdated_at() != null && !card.getIdupdated_at().equals("")) {
				pStmt.setString(2, card.getIdupdated_at());
			} else {
				pStmt.setString(2, "（未設定）");
			}
			if (card.getCustomer_id() != null && !card.getCustomer_id().equals("")) {
				pStmt.setString(3, card.getCustomer_id());
			} else {
				pStmt.setString(3, "（未設定）");
			}
			if (card.getTable_id() != null && !card.getTable_id().equals("")) {
				pStmt.setString(4, card.getTable_id());
			} else {
				pStmt.setString(4, "（未設定）");
			}
			if (card.getTablecover_id() != null && !card.getTablecover_id().equals("")) {
				pStmt.setString(5, card.getTablecover_id());
			} else {
				pStmt.setString(5, "（未設定）");
			}
			if (card.getChair_id() != null && !card.getChair_id().equals("")) {
				pStmt.setString(6, card.getChair_id());
			} else {
				pStmt.setString(6, "（未設定）");
			}
			if (card.getNapkin_id() != null && !card.getNapkin_id().equals("")) {
				pStmt.setString(7, card.getNapkin_id());
			} else {
				pStmt.setString(7, "（未設定）");
			}
			if (card.getFlower_id() != null && !card.getFlower_id().equals("")) {
				pStmt.setString(8, card.getFlower_id());
			} else {
				pStmt.setString(8, "（未設定）");
			}
			if (card.getClothes_id() != null && !card.getClothes_id().equals("")) {
				pStmt.setString(9, card.getClothes_id());
			} else {
				pStmt.setString(9, "（未設定）");
			}
			if (card.getCake_id() != null && !card.getCake_id().equals("")) {
				pStmt.setString(10, card.getCake_id());
			} else {
				pStmt.setString(10, "（未設定）");
			}
			if (card.getCaketop_id() != null && !card.getCaketop_id().equals("")) {
				pStmt.setString(11, card.getCaketop_id());
			} else {
				pStmt.setString(11, "（未設定）");
			}
			if (card.getInvitation_id() != null && !card.getInvitation_id().equals("")) {
				pStmt.setString(12, card.getInvitation_id());
			} else {
				pStmt.setString(12, "（未設定）");
			}
			if (card.getNameplate_id() != null && !card.getNameplate_id().equals("")) {
				pStmt.setString(13, card.getNameplate_id());
			} else {
				pStmt.setString(13, "（未設定）");
			}
			if (card.getTablemember_id() != null && !card.getTablemember_id().equals("")) {
				pStmt.setString(14, card.getTablemember_id());
			} else {
				pStmt.setString(14, "（未設定）");
			}
			if (card.getDeadlines() != null && !card.getDeadlines().equals("")) {
				pStmt.setString(15, card.getDeadlines());
			} else {
				pStmt.setString(15, "（未設定）");
			}
			if (card.getMemo_id() != null && !card.getMemo_id().equals("")) {
				pStmt.setString(16, card.getMemo_id());
			} else {
				pStmt.setString(16, "（未設定）");
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

	// 引数cardで指定されたレコードを更新し、成功したらtrueを返す
	public boolean update(Orderlist card) {
		Connection conn = null;
		boolean result = false;

		try {
			// JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			// データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			// SQL文を準備する
			String sql = "UPDATE Orderlists SET created_at=?, idupdated_at=?, customer_id=?, table_id=?, tablecover_id=?, chair_id=?, napkin_id=?, flower_id=?, clothes_id=?, cake_id=?, caketop_id=?, invitation_id=?, nameplate_id=?, tablemember_id=?, deadlines=?, memo_id=?, number=?, WHERE id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (card.getCreated_at() != null && !card.getCreated_at().equals("")) {
				pStmt.setString(1, card.getCreated_at());
			} else {
				pStmt.setString(1, null);
			}
			if (card.getIdupdated_at() != null && !card.getIdupdated_at().equals("")) {
				pStmt.setString(2, card.getIdupdated_at());
			} else {
				pStmt.setString(2, null);
			}
			if (card.getCustomer_id() != null && !card.getCustomer_id().equals("")) {
				pStmt.setString(3, card.getCustomer_id());
			} else {
				pStmt.setString(3, null);
			}
			if (card.getTable_id() != null && !card.getTable_id().equals("")) {
				pStmt.setString(4, card.getTable_id());
			} else {
				pStmt.setString(4, null);
			}
			if (card.getTablecover_id() != null && !card.getTablecover_id().equals("")) {
				pStmt.setString(5, card.getTablecover_id());
			} else {
				pStmt.setString(5, null);
			}
			if (card.getChair_id() != null && !card.getChair_id().equals("")) {
				pStmt.setString(6, card.getChair_id());
			} else {
				pStmt.setString(6, null);
			}
			if (card.getNapkin_id() != null && !card.getNapkin_id().equals("")) {
				pStmt.setString(7, card.getNapkin_id());
			} else {
				pStmt.setString(7, null);
			}
			if (card.getFlower_id() != null && !card.getFlower_id().equals("")) {
				pStmt.setString(8, card.getFlower_id());
			} else {
				pStmt.setString(8, null);
			}
			if (card.getClothes_id() != null && !card.getClothes_id().equals("")) {
				pStmt.setString(9, card.getClothes_id());
			} else {
				pStmt.setString(9, null);
			}
			if (card.getCake_id() != null && !card.getCake_id().equals("")) {
				pStmt.setString(10, card.getCake_id());
			} else {
				pStmt.setString(10, null);
			}
			if (card.getCaketop_id() != null && !card.getCaketop_id().equals("")) {
				pStmt.setString(11, card.getCaketop_id());
			} else {
				pStmt.setString(11, null);
			}
			if (card.getInvitation_id() != null && !card.getInvitation_id().equals("")) {
				pStmt.setString(12, card.getInvitation_id());
			} else {
				pStmt.setString(12, null);
			}
			if (card.getNameplate_id() != null && !card.getNameplate_id().equals("")) {
				pStmt.setString(13, card.getNameplate_id());
			} else {
				pStmt.setString(13, null);
			}
			if (card.getTablemember_id() != null && !card.getTablemember_id().equals("")) {
				pStmt.setString(14, card.getTablemember_id());
			} else {
				pStmt.setString(14, null);
			}
			if (card.getDeadlines() != null && !card.getDeadlines().equals("")) {
				pStmt.setString(15, card.getDeadlines());
			} else {
				pStmt.setString(15, null);
			}
			if (card.getMemo_id() != null && !card.getMemo_id().equals("")) {
				pStmt.setString(15, card.getMemo_id());
			} else {
				pStmt.setString(15, null);
			}
			if (card.getNumber() != null && !card.getNumber().equals("")) {
				pStmt.setString(16, card.getNumber());
			} else {
				pStmt.setString(16, null);
			}
			pStmt.setInt(17, card.getId());

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
