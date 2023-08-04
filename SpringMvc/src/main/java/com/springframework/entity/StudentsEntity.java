package com.springframework.entity;

import java.util.ArrayList;

public class StudentsEntity {
	private String name;
	private int mobile;
	private String email;
	private Address address;
	private ArrayList<Batch> batch;
	
	public StudentsEntity(String name, int mobile, String email,Address address,ArrayList<Batch> batch) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address= address;
		this.batch= batch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<Batch> getBatch() {
		return batch;
	}
	public void setBatch(ArrayList<Batch> batch) {
		this.batch = batch;
	}

}
