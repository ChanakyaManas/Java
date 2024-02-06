package Orders;

public class Products {
private int pid;
private String pname;
private double Pprice;
Vendors[]v;

public Products(int pid, String pname, double pprice, Vendors[] v) {
	super();
	this.pid = pid;
	this.pname = pname;
	Pprice = pprice;
	this.v = v;
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
public double getPprice() {
	return Pprice;
}
public void setPprice(double pprice) {
	Pprice = pprice;
}
public Vendors[] getV() {
	return v;
}
public void setV(Vendors[] v) {
	this.v = v;
}

}
