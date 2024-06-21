package model;

public class Survey {
	private int id;			/* ID */
	private String created_at;		/* created_at */
	private String updated_at;	/* updated_at */
	private String customer_id;	/* お客様ID */
	private String evaluation;		/* 満足度 */
	private String good_point;		/* 良かった点 */
	private String impovement;		/* 改善してほしい点 */

	// 引数がないコンストラクタ
	public Survey() {

	}

	public Survey(int id, String created_at, String updated_at, String customer_id, String evaluation, String good_point,
			String improvement) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.customer_id = customer_id;
		this.evaluation = evaluation;
		this.good_point = good_point;
//		this.improvement = improvement;
	}

	public Survey(int id, String created_at, String updated_at, String customer_id, String evaluation,
			String good_point/*, String impovement*/) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.customer_id = customer_id;
		this.evaluation = evaluation;
		this.good_point = good_point;
		this.impovement = impovement;
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

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	public String good_point() {
		return good_point;
	}

	public void setChange(String good_point) {
		this.good_point = good_point;
	}

/*	public String getImprovement() {
		return improvement;
	}

	public void setImprovement(String improvement) {
		this.improvement = improvement;
	}
*/
}
