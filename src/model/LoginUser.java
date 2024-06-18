package model;
import java.io.Serializable;

public class LoginUser implements Serializable {
    private String company_id;    // 企業ID

    public LoginUser() {
        this(null);
    }

    public LoginUser(String company_id) {
        this.company_id = company_id;
    }

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

}