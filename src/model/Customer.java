package model;
import java.io.Serializable;

public class Customer implements Serializable {
	//フィールド
	private int id;					/*お客様ID*/
	private String created_at;		/*created_at*/
	private String updated_at;		/*updated_at*/
	private String lname_1;			/*苗字１*/
	private String fname_1;			/*名前１*/
	private String lfurigana_1;		/*苗字フリガナ１*/
	private String ffurigana_1;		/*名前フリガナ１*/
	private String tel_1;			/*連絡先１*/
	private String lname_2;			/*苗字２*/
	private String fname_2;			/*名前２*/
	private String lfurigana_2;		/*苗字フリガナ２*/
	private String ffurigana_2;		/*名前フリガナ２*/
	private String tel_2;			/*連絡先２*/
	private String address;			/*住所*/
	private String thedate;			/*式希望日*/
	private String memo_id;			/*備考*/
	private boolean pin;			/*ピン*/

	//引数なしのコンストラクタ
	public Customer() {

	}

	public Customer(int id, String lname_1, String fname_1, String lfurigana_1, String ffurigana_1, String tel_1,
			String lname_2, String fname_2, String lfurigana_2, String ffurigana_2, String tel_2, String address,
			String thedate, String memo_id, boolean pin) {
		super();
		this.id = id;
		this.lname_1 = lname_1;
		this.fname_1 = fname_1;
		this.lfurigana_1 = lfurigana_1;
		this.ffurigana_1 = ffurigana_1;
		this.tel_1 = tel_1;
		this.lname_2 = lname_2;
		this.fname_2 = fname_2;
		this.lfurigana_2 = lfurigana_2;
		this.ffurigana_2 = ffurigana_2;
		this.tel_2 = tel_2;
		this.address = address;
		this.thedate = thedate;
		this.memo_id = memo_id;
		this.pin = pin;
	}

	//引数ありのコンストラクタ
	public Customer(int id, String created_at, String updated_at, String lname_1, String fname_1, String lfurigana_1,
			String ffurigana_1, String tel_1, String lname_2, String fname_2, String lfurigana_2, String ffurigana_2,
			String tel_2, String address, String thedate, String memo_id, boolean pin) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.lname_1 = lname_1;
		this.fname_1 = fname_1;
		this.lfurigana_1 = lfurigana_1;
		this.ffurigana_1 = ffurigana_1;
		this.tel_1 = tel_1;
		this.lname_2 = lname_2;
		this.fname_2 = fname_2;
		this.lfurigana_2 = lfurigana_2;
		this.ffurigana_2 = ffurigana_2;
		this.tel_2 = tel_2;
		this.address = address;
		this.thedate = thedate;
		this.memo_id = memo_id;
		this.pin = pin;
	}

	//ゲッタ・セッタ
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
	public String getLname_1() {
		return lname_1;
	}
	public void setLname_1(String lname_1) {
		this.lname_1 = lname_1;
	}
	public String getFname_1() {
		return fname_1;
	}
	public void setFname_1(String fname_1) {
		this.fname_1 = fname_1;
	}
	public String getLfurigana_1() {
		return lfurigana_1;
	}
	public void setLfurigana_1(String lfurigana_1) {
		this.lfurigana_1 = lfurigana_1;
	}
	public String getFfurigana_1() {
		return ffurigana_1;
	}
	public void setFfurigana_1(String ffurigana_1) {
		this.ffurigana_1 = ffurigana_1;
	}
	public String getTel_1() {
		return tel_1;
	}
	public void setTel_1(String tel_1) {
		this.tel_1 = tel_1;
	}
	public String getLname_2() {
		return lname_2;
	}
	public void setLname_2(String lname_2) {
		this.lname_2 = lname_2;
	}
	public String getFname_2() {
		return fname_2;
	}
	public void setFname_2(String fname_2) {
		this.fname_2 = fname_2;
	}
	public String getLfurigana_2() {
		return lfurigana_2;
	}
	public void setLfurigana_2(String lfurigana_2) {
		this.lfurigana_2 = lfurigana_2;
	}
	public String getFfurigana_2() {
		return ffurigana_2;
	}
	public void setFfurigana_2(String ffurigana_2) {
		this.ffurigana_2 = ffurigana_2;
	}
	public String getTel_2() {
		return tel_2;
	}
	public void setTel_2(String tel_2) {
		this.tel_2 = tel_2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getThedate() {
		return thedate;
	}
	public void setThedate(String thedate) {
		this.thedate = thedate;
	}
	public String getMemo_id() {
		return memo_id;
	}
	public void setMemo_id(String memo_id) {
		this.memo_id = memo_id;
	}
	public boolean getPin() {
		return pin;
	}
	public void setPin(boolean pin) {
		this.pin = pin;
	}


}
