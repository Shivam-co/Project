package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Registration {
	@Id
	private Integer userId;
	private String userName;
	private String password;
	private Integer userPhone;
	private String emailId;
	public Integer getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(Integer userPhone) {
		this.userPhone = userPhone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	

}
