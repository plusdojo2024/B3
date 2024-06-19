package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class SimulationCommon implements Serializable {
    private int id;					// シミュレーション総合結果ID
    private Timestamp created_at;	// データ作成日時
    private Timestamp updated_at;	// データ更新日時
    private String name;			// 商品名
    private int price;				// 値段
    private String image;			// 画像の相対パス

    public SimulationCommon() {

    }

	public SimulationCommon(int id, Timestamp created_at, Timestamp updated_at, String name, int price, String image) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.name = name;
		this.price = price;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}