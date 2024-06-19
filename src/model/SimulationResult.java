package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class SimulationResult implements Serializable {
    private int id;					// シミュレーション総合結果ID
    private Timestamp created_at;	// データ作成日時
    private Timestamp updated_at;	// データ更新日時
    private int customer_id;		// お客様ID
    private int table_id;			// シミュレーション素材（テーブルクロス）のID
    private int tablecover_id;		// シミュレーション素材（トップクロス）のID
    private int chair_id;			// シミュレーション素材（チェアカバー）のID
    private int napkin_id;			// シミュレーション素材（ナプキン）のID
    private int flower_id;			// シミュレーション素材（花）のID
    private int clothes_id;			// シミュレーション素材（衣装）のID
    private int cake_id;			// シミュレーション素材（ケーキ全体像）のID
    private int caketop_id;			// シミュレーション素材（ケーキ上部）のID
    private int invitation_id;		// シミュレーション素材（招待状）のID
    private int nameplate_id;		// シミュレーション素材（ネームプレート）のID
    private int tablemember_id;		// シミュレーション素材（席配置）のID

    public SimulationResult() {

    }

	public SimulationResult(int id, Timestamp created_at, Timestamp updated_at, int customer_id, int table_id,
			int tablecover_id, int chair_id, int napkin_id, int flower_id, int clothes_id, int cake_id, int caketop_id,
			int invitation_id, int nameplate_id, int tablemember_id) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
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

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
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
}