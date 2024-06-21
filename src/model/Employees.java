package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Employees implements Serializable {
	private int id;
    private int companyId;
    private String user;
    private String pw;
    private Timestamp createdAt;
    private Timestamp updateAt;

    public Employees(int id, int companyId, String user, String pw, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.companyId = companyId;
        this.user = user;
        this.pw = pw;
        this.createdAt = createdAt;
        this.updateAt = updatedAt;
    }
    public Employees(int companyId,String user, String pw) {
    	this.companyId = companyId;
        this.user = user;
        this.pw = pw;
        this.createdAt = new Timestamp(System.currentTimeMillis());
        this.updateAt = this.createdAt;
    }

    public Employees() {
    	 this.id = 0;
         this.companyId = 0;
         this.user = "";
         this.pw = "";
         this.createdAt = new Timestamp(System.currentTimeMillis());
         this.updateAt = this.createdAt;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }


	public Timestamp getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}
}
