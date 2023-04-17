package com.mysqlprogram;

//POJO classes for storing data 
//Transfer data from one location to another
public class Registeration {

	private int registeration;
	private String name;
	private String dept;
	private long mobileNo;
	
	public Registeration() {
		super();
	}
	
	public Registeration(int registeration, String name, String dept, long mobileno) {
		super();
		this.registeration = registeration;
		this.name = name;
		this.dept = dept;
		this.mobileNo = mobileno;
	}

	public int getRegisteration() {
		return registeration;
	}
	public void setRegisteration(int registeration) {
		this.registeration = registeration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getMobileno() {
		return mobileNo;
	}
	public void setMobileno(long mobileno) {
		this.mobileNo = mobileno;
	}
	
	
}
