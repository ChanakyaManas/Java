package New;

import java.util.Arrays;

public class Student1 implements Cloneable{
private int sid;
private String sname;
private Dept1 dept;
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
public Dept1 getDept() {
	return dept;
}
public void setDept(Dept1 dept) {
	this.dept = dept;
}
public Student1(int sid, String sname, Dept1 dept) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.dept = dept;
}
@Override
public String toString() {
	return "Student1 [sid=" + sid + ", sname=" + sname + ", dept=" + dept + "]";
}

public Object clone() {
	Student1 s=null;
	try {
		s=(Student1)super.clone();
		Dept1 dpt=(Dept1) new Dept1(s.getDept().getDid(),getDept().getDname(),getDept().getS()).clone();
		s.setDept(dpt);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return s;
}
	}
