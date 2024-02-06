package Object;

public class Dept {
private int did;
private String dname;
@Override
public String toString() {
	return "Dept [did=" + did + ", dname=" + dname + "]";
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public Dept(int did, String dname) {
	super();
	this.did = did;
	this.dname = dname;
}	
	public Dept clone() {
		Dept d=null;
		try {
		d=(Dept)super.clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		return d;
	}}

