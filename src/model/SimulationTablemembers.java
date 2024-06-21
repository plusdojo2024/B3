package model;

import java.io.Serializable;

public class SimulationTablemembers implements Serializable {
    private int id;					// 席配置シミュレーションID
    private String created_at;		// データ作成日時
    private String updated_at;		// データ更新日時
    private int number;				// 総人数（テーブル当たりの人数×卓数）
    private String image;			// テーブル画像の相対パス

    public SimulationTablemembers() {

    }

	public SimulationTablemembers(int id, int number, String image) {
		super();
		this.id = id;
		this.number = number;
		this.image = image;
	}

	public SimulationTablemembers(int id, String created_at, String updated_at, int number, String image) {
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