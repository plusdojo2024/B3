package model;

import java.io.Serializable;

public class Employees implements Serializable {
    private String company_id;    // ID
    private String user;
    private String pw;    // PW

    public Employees(String company_id, String user, String pw) {
        this.company_id = company_id;
        this.user = user;
        this.pw = pw;
    }
    public Employees(String user, String pw) {
        this.user = user;
        this.pw = pw;
    }

    public Employees() {
        this.company_id = "";
        this.user = "";
        this.pw = "";
    }
public String getCompany_id() {
	return company_id;
}
public void setCompany_id(String company_id) {
	this.company_id = company_id;
}
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
