package Object;

public class Mobile {
private int mid;
private String mno;
private String msim;
@Override
public String toString() {
	return "Mobile [mid=" + mid + ", mno=" + mno + ", msim=" + msim + "]";
}
public Mobile(int mid, String mno, String msim) {
	super();
	this.mid = mid;
	this.mno = mno;
	this.msim = msim;
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMno() {
	return mno;
}
public void setMno(String mno) {
	this.mno = mno;
}
public String getMsim() {
	return msim;
}
public void setMsim(String msim) {
	this.msim = msim;
}
}
