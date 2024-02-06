package New;

import java.util.Arrays;

public class Student implements Cloneable {
private int sid;
private String sname;
private int sage;
private String SQual;
private Marks marks;
private Mobile[]m;

public Student(int sid, String sname, int sage, String sQual, Marks marks, Sub sub,Mobile[]m) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sage = sage;
	SQual = sQual;
	this.marks = marks;
	this.sub = sub;
	this.m=m;
}
public Student() {
	// TODO Auto-generated constructor stub
}
private Sub sub;
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
public int getSage() {
	return sage;
}
public void setSage(int sage) {
	this.sage = sage;
}
public String getSQual() {
	return SQual;
}
public void setSQual(String sQual) {
	SQual = sQual;
}
public Marks getMarks() {
	return marks;
}
public void setMarks(Marks marks) {
	this.marks = marks;
}
public Sub getSub() {
	return sub;
}
public void setSub(Sub sub) {
	this.sub = sub;
}
public Student clone() {
	Student s=null;
	try {
		s=(Student)super.clone();
	    Marks m=getMarks().clone();
	    setMarks(m);
	    Sub s1=getSub().clone();
	    setSub(s1);
	    Mobile[]m1=getM().clone();
	    setM(m1);
	    
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

	return s;
}
public Mobile[] getM() {
	return m;
}
public void setM(Mobile[] m) {
	this.m = m;
}
@Override
public String toString() {
	return "sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", SQual=" + SQual + ", marks=" + marks
			+ ", m=" + Arrays.toString(m) + ", sub=" + sub + "";
}

}
