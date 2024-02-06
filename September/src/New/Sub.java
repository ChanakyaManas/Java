package New;

import java.util.Arrays;

public class Sub implements Cloneable{
public Sub() {
		super();
		// TODO Auto-generated constructor stub
	}
String[]sub;

public String[] getSub() {
	return sub;
}

public void setSub(String[] sub) {
	this.sub = sub;
}

public Sub(String[] sub) {
	super();
	this.sub = sub;
}

@Override
public String toString() {
	return "Sub [sub=" + Arrays.toString(sub) + "]";
}
public Sub clone(){
	Sub sub=null;
	try {
		sub=(Sub)super.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return sub;
}
}
