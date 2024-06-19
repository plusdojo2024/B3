package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class SimulationCaketops implements Serializable {
    private int id;					// シミュレーション総合結果ID
    private Timestamp created_at;	// データ作成日時
    private Timestamp updated_at;	// データ更新日時
    private int memo_id;			// ケーキ上部の詳細メモのID

    public SimulationCaketops() {

    }

	public SimulationCaketops(int id, Timestamp created_at, Timestamp updated_at, int memo_id) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.memo_id = memo_id;
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

	public int getMemo_id() {
		return memo_id;
	}

	public void setMemo_id(int memo_id) {
		this.memo_id = memo_id;
	}
}