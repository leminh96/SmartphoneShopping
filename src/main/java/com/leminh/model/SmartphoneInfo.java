package com.leminh.model;

public class SmartphoneInfo {
	private int id;
	private String name;
	private String brand;
	private int price;
	private int year;
	private String detail;
	private String image;	
	public SmartphoneInfo() {

	}
	public SmartphoneInfo(int id, String name, String brand, int price, int year, String detail, String image) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.detail = detail;
		this.image = image;
	}
	public SmartphoneInfo(int id, String name, String brand, int price, int year, String detail) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.detail = detail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
