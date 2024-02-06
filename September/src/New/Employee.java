package New;

public class Employee implements Cloneable{
private int eid;
private String ename;
private double ESal;
private String edesg;
private Dept d;
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
public double getESal() {
	return ESal;
}
public void setESal(double eSal) {
	ESal = eSal;
}
public String getEdesg() {
	return edesg;
}
public void setEdesg(String edesg) {
	this.edesg = edesg;
}
public Dept getD() {
	return d;
}
public void setD(Dept d) {
	this.d = d;
}
public Employee(int eid, String ename, double eSal, String edesg, Dept d) {
	super();
	this.eid = eid;
	this.ename = ename;
	ESal = eSal;
	this.edesg = edesg;
	this.d = d;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", ESal=" + ESal + ", edesg=" + edesg + ", d=" + d + "]";
}
public Object Clone(){
	Employee e=null;
	try {
	e=(Employee) super.clone();
	e.setD((Dept)this.getD().clone());
	}
	catch(CloneNotSupportedException em) {
		em.printStackTrace();
	}
	return e;
}

}
