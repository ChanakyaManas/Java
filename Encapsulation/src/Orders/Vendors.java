package Orders;

public class Vendors {
private int vid;
private String Vname;
private String VPAN;
private String Trans;
private String Mobileno;

public Vendors(int vid, String vname, String vPAN, String trans, String mobileno) {
	super();
	this.vid = vid;
	Vname = vname;
	VPAN = vPAN;
	Trans = trans;
	Mobileno = mobileno;
}
public int getVid() {
	return vid;
}
public void setVid(int vid) {
	this.vid = vid;
}
public String getVname() {
	return Vname;
}
public void setVname(String vname) {
	Vname = vname;
}
public String getVPAN() {
	return VPAN;
}
public void setVPAN(String vPAN) {
	VPAN = vPAN;
}
public String getTrans() {
	return Trans;
}
public void setTrans(String trans) {
	Trans = trans;
}
public String getMobileno() {
	return Mobileno;
}
public void setMobileno(String mobileno) {
	Mobileno = mobileno;
}
}
