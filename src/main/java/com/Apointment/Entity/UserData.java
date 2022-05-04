package com.Apointment.Entity;

public class UserData {
	private String name;
	private String mobileNumber;
	private String password;
	private Integer type;
	//-----------Setter and getter methods for user data----------------//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
