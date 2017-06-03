package com.leminh.model;

public class UserInfo {
	private String userName;
	private String password;
	private String name;
	private String address;
	private String birthday;
	private String sex;
	private String email;
	private String phone;
	public UserInfo() {

	}
	public UserInfo(String userName, String password, String name, String address, String birthday, String sex, String email,
			String phone) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.address = address;
		this.birthday = birthday;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
	}
	
	public UserInfo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getbirthday() {
		return birthday;
	}
	public void setbirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
