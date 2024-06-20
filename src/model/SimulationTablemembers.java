package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class SimulationTablemembers implements Serializable {
    private int id;					// シミュレーション総合結果ID
    private Timestamp created_at;	// データ作成日時
    private Timestamp updated_at;	// データ更新日時
    private int number;				// 総人数（テーブル当たりの人数×卓数）
    private String image;			// テーブル画像の相対パス

    public SimulationTablemembers() {

    }

	public SimulationTablemembers(int id, Timestamp created_at, Timestamp updated_at, int number, String image) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.number = number;
		this.image = image;
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}