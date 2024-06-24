package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Orderlist implements Serializable {

	private int id; /* ID */
	private Timestamp created_at; /* CREATED_AT */
	private Timestamp idupdated_at; /* UPDATED_AT */
	private int customer_id; /* お客様ID */
	private int table_id; /* 内装テーブル */
	private int tablecover_id; /* 内装テーブルクロス */
	private int chair_id; /* 内装チェア */
	private int napkin_id; /* 内装ナプキン */
	private int flower_id; // /* 内装フラワー */
	private int clothes_id; /* 衣装 */
	private int cake_id; /* ケーキ全体 */
	private int caketop_id; /* ケーキ上部 */
	private int invitation_id; /* 招待状 */
	private int nameplate_id; /* ネームプレート */
	private int tablemember_id; /* 人数配置 */
	private String deadlines; /* 発注期限日 */
	private int memo_id; /* メモID */
	private int number; /* 人数 */

	// 引数がないコンストラクタ 仕様だから作る 使うことはない
	public Orderlist() {

	}

	public Orderlist(int id, Timestamp created_at, Timestamp idupdated_at, int customer_id, int table_id,
			int tablecover_id, int chair_id, int napkin_id, int flower_id, int clothes_id, int cake_id, int caketop_id,
			int invitation_id, int nameplate_id, int tablemember_id, String deadlines, int memo_id, int number) {
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

	public Orderlist(String data0, int parseInt, int parseInt2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getIdupdated_at() {
		return idupdated_at;
	}

	public void setIdupdated_at(Timestamp idupdated_at) {
		this.idupdated_at = idupdated_at;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getTable_id() {
		return table_id;
	}

	public void setTable_id(int table_id) {
		this.table_id = table_id;
	}

	public int getTablecover_id() {
		return tablecover_id;
	}

	public void setTablecover_id(int tablecover_id) {
		this.tablecover_id = tablecover_id;
	}

	public int getChair_id() {
		return chair_id;
	}

	public void setChair_id(int chair_id) {
		this.chair_id = chair_id;
	}

	public int getNapkin_id() {
		return napkin_id;
	}

	public void setNapkin_id(int napkin_id) {
		this.napkin_id = napkin_id;
	}

	public int getFlower_id() {
		return flower_id;
	}

	public void setFlower_id(int flower_id) {
		this.flower_id = flower_id;
	}

	public int getClothes_id() {
		return clothes_id;
	}

	public void setClothes_id(int clothes_id) {
		this.clothes_id = clothes_id;
	}

	public int getCake_id() {
		return cake_id;
	}

	public void setCake_id(int cake_id) {
		this.cake_id = cake_id;
	}

	public int getCaketop_id() {
		return caketop_id;
	}

	public void setCaketop_id(int caketop_id) {
		this.caketop_id = caketop_id;
	}

	public int getInvitation_id() {
		return invitation_id;
	}

	public void setInvitation_id(int invitation_id) {
		this.invitation_id = invitation_id;
	}

	public int getNameplate_id() {
		return nameplate_id;
	}

	public void setNameplate_id(int nameplate_id) {
		this.nameplate_id = nameplate_id;
	}

	public int getTablemember_id() {
		return tablemember_id;
	}

	public void setTablemember_id(int tablemember_id) {
		this.tablemember_id = tablemember_id;
	}

	public String getDeadlines() {
		return deadlines;
	}

	public void setDeadlines(String deadlines) {
		this.deadlines = deadlines;
	}

	public int getMemo_id() {
		return memo_id;
	}

	public void setMemo_id(int memo_id) {
		this.memo_id = memo_id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
