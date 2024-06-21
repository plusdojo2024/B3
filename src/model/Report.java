package model;

public class Report {
	private int id;			/* ID */
	private String created_at;		/* created_at */
	private String updated_at;	/* updated_at */
	private String customer_id;	/* お客様ID */
	private int headcount;		/* 参加者数 */
	private String change;		/* 変更点 */
	private String improvement;		/* 改善点 */

	// 引数がないコンストラクタ
	public Report() {

	}

	public Report(int id, String created_at, String updated_at, String customer_id, int headcount, String change,
			String improvement) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.customer_id = customer_id;
		this.headcount = headcount;
		this.change = change;
		this.improvement = improvement;
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

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public int getHeadcount() {
		return headcount;
	}

	public void setHeadcount(int headcount) {
		this.headcount = headcount;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public String getImprovement() {
		return improvement;
	}

	public void setImprovement(String improvement) {
		this.improvement = improvement;
	}

}
