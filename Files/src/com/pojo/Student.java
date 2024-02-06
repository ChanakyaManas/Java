package com.pojo;
public class Student {
private int sid;
private String sname;
private int age;
private double Score;
private String Qual;

public Student() {
	super();
}
public Student(int sid, String sname, int age, double score, String qual) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.age = age;
	Score = score;
	Qual = qual;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getScore() {
	return Score;
}
public void setScore(double score) {
	Score = score;
}
public String getQual() {
	return Qual;
}
public void setQual(String qual) {
	Qual = qual;
}
}
