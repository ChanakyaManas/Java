package Orders;

public class Customer {
private int pid;
private String pname;
private double phno;
Address a;
Products[]p;

public Customer(int pid, String pname, double phno, Address a, Products[] p) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.phno = phno;
	this.a = a;
	this.p = p;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPhno() {
	return phno;
}
public void setPhno(double phno) {
	this.phno = phno;
}
public Address getA() {
	return a;
}
public void setA(Address a) {
	this.a = a;
}
public Products[] getP() {
	return p;
}
public void setP(Products[] p) {
	this.p = p;
}
}
