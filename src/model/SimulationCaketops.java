package model;

import java.io.Serializable;

public class SimulationCaketops implements Serializable {
    private int id;				// シミュレーション総合結果ID
    private String created_at;	// データ作成日時
    private String updated_at;	// データ更新日時
    private String memo_id;		// ケーキ上部の詳細メモのID
    private String memo;		// ケーキ上部の詳細メモ

    public SimulationCaketops() {

    }

	public SimulationCaketops(int id, String created_at, String updated_at, String memo_id) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.memo_id = memo_id;
	}

	public SimulationCaketops(int id, String memo) {
		super();
		this.id = id;
		this.memo = memo;
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

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getMemo_id() {
		return memo_id;
	}

	public void setMemo_id(String memo_id) {
		this.memo_id = memo_id;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}