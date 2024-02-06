package New;

import java.util.Arrays;

public class Marks implements Cloneable{
int []marks;

public int[] getMarks() {
	return marks;
}

public void setMarks(int[] marks) {
	this.marks = marks;
}

public Marks(int[] marks) {
	super();
	this.marks = marks;
}

@Override
public String toString() {
	return "Marks [marks=" + Arrays.toString(marks) + "]";
}
public Marks clone() {
	Marks m=null;
	try {
		m=(Marks)super.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return m;
}

public Marks() {
	super();
	// TODO Auto-generated constructor stub
}

}
