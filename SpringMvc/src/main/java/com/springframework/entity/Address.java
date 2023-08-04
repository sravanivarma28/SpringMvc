package com.springframework.entity;

public class Address {
	private String area;
	private int h_no;
	private String state;
	private String country;
	private int pincode;
	
	public Address(String area, int h_no, String state, String country, int pincode) {
		super();
		this.area = area;
		this.h_no = h_no;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getH_no() {
		return h_no;
	}
	public void setH_no(int h_no) {
		this.h_no = h_no;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
