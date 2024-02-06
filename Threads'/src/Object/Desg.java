package Object;

public class Desg {
private int did;
private String dename;
public Desg(int did, String dename) {
	super();
	this.did = did;
	this.dename = dename;
}
@Override
public String toString() {
	return "Desg [did=" + did + ", dename=" + dename + "]";
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDename() {
	return dename;
}
public void setDename(String dename) {
	this.dename = dename;
}
}
