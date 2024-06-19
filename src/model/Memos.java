package model;

import java.io.Serializable;

public class Memos implements Serializable{

	private int id ; /* ID */
	private String created_at; /* CREATED_AT */
	private String idupdated_at; /* UPDATED_AT */
	private String memo; /* メモ */

	public Memos(int id, String created_at, String idupdated_at, String memo) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.idupdated_at = idupdated_at;
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

	public String getIdupdated_at() {
		return idupdated_at;
	}

	public void setIdupdated_at(String idupdated_at) {
		this.idupdated_at = idupdated_at;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
