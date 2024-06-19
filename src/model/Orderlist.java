package model;

import java.io.Serializable;

public class Orderlist implements Serializable {

	private int id ; /* ID */
	private String created_at; /* CREATED_AT */
	private String idupdated_at; /* UPDATED_AT */
	private String customer_id; /* お客様ID */
	private String table_id; /* 内装テーブル */
	private String tablecover_id; /* 内装テーブルクロス */
	private String chair_id; /* 内装チェア */
	private String napkin_id; /* 内装ナプキン */
	private String flower_id; // /* 内装フラワー */
	private String clothes_id; /* 衣装 */
	private String cake_id; /* ケーキ全体 */
	private String caketop_id; /* ケーキ上部 */
	private String invitation_id; /* 招待状 */
	private String nameplate_id; /* ネームプレート */
	private String tablemember_id; /* 人数配置 */
	private String deadlines; /* 発注期限日 */
	private String memo_id; /* メモID */
	private String number; /* 人数 */

	// 引数がないコンストラクタ 仕様だから作る 使うことはない
    public Orderlist() {

    }

	public Orderlist(int id, String created_at, String idupdated_at, String customer_id, String table_id, String tablecover_id,
			String chair_id, String napkin_id, String flower_id, String clothes_id, String cake_id, String caketop_id,
			String invitation_id, String nameplate_id, String tablemember_id, String deadlines, String memo_id,
			String number) {

		super();
		this.id = id;
		this.created_at = created_at;
		this.idupdated_at = idupdated_at;
		this.customer_id = customer_id;
		this.table_id = table_id;
		this.tablecover_id = tablecover_id;
		this.chair_id = chair_id;
		this.napkin_id = napkin_id;
		this.flower_id = flower_id;
		this.clothes_id = clothes_id;
		this.cake_id = cake_id;
		this.caketop_id = caketop_id;
		this.invitation_id = invitation_id;
		this.nameplate_id = nameplate_id;
		this.tablemember_id = tablemember_id;
		this.deadlines = deadlines;
		this.memo_id = memo_id;
		this.number = number;
	}



	public Orderlist(int int1, String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9, String string10, String string11,
			String string12, String string13, String string14, String string15, String string16) {
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getIdupdated_at() {
		return idupdated_at;
	}

	public void setIdupdated_at(String idupdated_at) {
		this.idupdated_at = idupdated_at;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getTable_id() {
		return table_id;
	}

	public void setTable_id(String table_id) {
		this.table_id = table_id;
	}

	public String getTablecover_id() {
		return tablecover_id;
	}

	public void setTablecover_id(String tablecover_id) {
		this.tablecover_id = tablecover_id;
	}

	public String getChair_id() {
		return chair_id;
	}

	public void setChair_id(String chair_id) {
		this.chair_id = chair_id;
	}

	public String getNapkin_id() {
		return napkin_id;
	}

	public void setNapkin_id(String napkin_id) {
		this.napkin_id = napkin_id;
	}

	public String getFlower_id() {
		return flower_id;
	}

	public void setFlower_id(String flower_id) {
		this.flower_id = flower_id;
	}

	public String getClothes_id() {
		return clothes_id;
	}

	public void setClothes_id(String clothes_id) {
		this.clothes_id = clothes_id;
	}

	public String getCake_id() {
		return cake_id;
	}

	public void setCake_id(String cake_id) {
		this.cake_id = cake_id;
	}

	public String getCaketop_id() {
		return caketop_id;
	}

	public void setCaketop_id(String caketop_id) {
		this.caketop_id = caketop_id;
	}

	public String getInvitation_id() {
		return invitation_id;
	}

	public void setInvitation_id(String invitation_id) {
		this.invitation_id = invitation_id;
	}

	public String getNameplate_id() {
		return nameplate_id;
	}

	public void setNameplate_id(String nameplate_id) {
		this.nameplate_id = nameplate_id;
	}

	public String getTablemember_id() {
		return tablemember_id;
	}

	public void setTablemember_id(String tablemember_id) {
		this.tablemember_id = tablemember_id;
	}

	public String getDeadlines() {
		return deadlines;
	}

	public void setDeadlines(String deadlines) {
		this.deadlines = deadlines;
	}

	public String getMemo_id() {
		return memo_id;
	}

	public void setMemo_id(String memo_id) {
		this.memo_id = memo_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

