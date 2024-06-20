package model;

import java.io.Serializable;

public class SimulationCommon implements Serializable {
    private int id;					// シミュレーション総合結果ID
    private String name;			// 商品名
    private int price;				// 値段
    private String image;			// 画像の相対パス

    public SimulationCommon() {

    }

	public SimulationCommon(int id, String name, int price, String image) {
		super();
		this.id = id;
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