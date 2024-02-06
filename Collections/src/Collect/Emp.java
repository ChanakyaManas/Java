package Collect;

public class Emp {
private int eid;
private String ename;
private double esal;
private String Desg;

public Emp(int eid, String ename, double esal, String desg) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
	Desg = desg;
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
public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}
public String getDesg() {
	return Desg;
}
public void setDesg(String desg) {
	Desg = desg;
}
}
