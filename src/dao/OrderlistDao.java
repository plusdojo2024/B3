package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Orderlist;

public class OrderlistDao {

	public boolean insert(Orderlist card) {
		Connection conn = null;
		boolean result = false;

		try {
			 //JDBCドライバを読み込む
			Class.forName("org.h2.Driver");

			 //データベースに接続する
			conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

			 //SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			//項目を増やす場合は(NULL,
			String sql = "INSERT INTO USERS (deadlines,memo_id,number,created_at,updated_at) VALUES (NULL,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			 //SQL文を完成させる
			if (card.getCustomer_id() != 0) {
				pStmt.setInt(1, card.getCustomer_id());
			}
			else {
				pStmt.setInt(1, 0);
			}
			if (card.getTable_id() != 0) {
				pStmt.setInt(2, card.getTable_id());
			}
			else {
				pStmt.setInt(2, 0);
			}
			if (card.getTablecover_id() != 0) {
				pStmt.setInt(3, card.getTablecover_id());
			}
			else {
				pStmt.setInt(3, 0);
			}
			if (card.getChair_id() != 0) {
				pStmt.setInt(4, card.getChair_id());
			}
			else {
				pStmt.setInt(4, 0);
			}
			if (card.getNapkin_id() != 0) {
				pStmt.setInt(5, card.getNapkin_id());
			}
			else {
				pStmt.setInt(5, 0);
			}
			if (card.getFlower_id() != 0) {
				pStmt.setInt(6, card.getFlower_id());
			}
			else {
				pStmt.setInt(6, 0);
			}
			if (card.getClothes_id() != 0) {
				pStmt.setInt(7, card.getClothes_id());
			}
			else {
				pStmt.setInt(7, 0);
			}
			if (card.getCake_id() != 0) {
				pStmt.setInt(8, card.getCake_id());
			}
			else {
				pStmt.setInt(8, 0);
			}
			if (card.getCaketop_id() != 0) {
				pStmt.setInt(9, card.getCaketop_id());
			}
			else {
				pStmt.setInt(9, 0);
			}
			if (card.getInvitation_id() != 0) {
				pStmt.setInt(10, card.getInvitation_id());
			}
			else {
				pStmt.setInt(10, 0);
			}
			if (card.getNameplate_id() != 0) {
				pStmt.setInt(11, card.getNameplate_id());
			}
			else {
				pStmt.setInt(11, 0);
			}
			if (card.getTablemember_id() != 0) {
				pStmt.setInt(12, card.getTablemember_id());
			}
			else {
				pStmt.setInt(12, 0);
			}
			if (card.getDeadlines() != null) {
			    // java.util.Date を java.sql.Date に変換
//			    java.sql.Date sqlDate = new java.sql.Date(card.getDeadlines().getTime());
			    pStmt.setString(13, card.getDeadlines());
			} else {

			    pStmt.setNull(13, java.sql.Types.DATE);
			}
			if (card.getMemo_id() != 0) {
				pStmt.setInt(14, card.getMemo_id());
			}
			else {
				pStmt.setInt(14, 0);
			}
			if (card.getNumber() != 0) {
				pStmt.setInt(15, card.getNumber());
			}
			else {
				pStmt.setInt(15, 0);
			}




			 //SQL文を実行する
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
			 //データベースを切断
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		 //結果を返す
		return result;
	}

}

