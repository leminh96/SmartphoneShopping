package com.leminh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	private String userName;
	private String password;
	private String name;
	private String address;
	private String birthday;
	private String sex;
	private String email;
	private String phone;
	public User() {
		
	}
	public User(String userName, String password, String name, String address, String birthday, String sex,
			String email, String phone) {
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.address = address;
		this.birthday = birthday;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
	}
	
	@Id
	@Column(name = "username", unique = true, length = 30, nullable = false)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name = "password", length = 200, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "name", length = 100, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "address", length = 200, nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "birthday", length = 30, nullable = false)
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	@Column(name = "sex", length = 20, nullable = false)
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Column(name = "email", length = 100, nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "phone", length = 30, nullable = false)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
