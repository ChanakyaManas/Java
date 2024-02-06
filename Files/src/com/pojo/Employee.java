package com.pojo;
public class Employee {
	private int eid;
	private String ename;
	private int age;
	private double Esal;
	private String eDesg;
	public Employee(){}
	public Employee(int eid, String ename, int age, double esal, String eDesg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		Esal = esal;
		this.eDesg = eDesg;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getEsal() {
		return Esal;
	}

	public void setEsal(double esal) {
		Esal = esal;
	}

	public String geteDesg() {
		return eDesg;
	}

	public void seteDesg(String eDesg) {
		this.eDesg = eDesg;
	}

}
