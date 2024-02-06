package New;

public class Store implements Cloneable {
private int sid;
private String sname;
private String sLoc;
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
public String getsLoc() {
	return sLoc;
}
public void setsLoc(String sLoc) {
	this.sLoc = sLoc;
}
public Store(int sid, String sname, String sLoc) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sLoc = sLoc;
}
@Override
public String toString() {
	return "Store [sid=" + sid + ", sname=" + sname + ", sLoc=" + sLoc + "]";
}
public Object clone() {
	Store s=null;
	try {
		s=(Store)super.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return s;
}
}
