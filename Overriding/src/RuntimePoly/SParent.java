package RuntimePoly;

public class SParent {
public void getA() {
	System.out.println("Void");
}
public void getA(double a,double b) {
	System.out.println("Double");
	System.out.println(a+":"+b);
}
public void getA(String A,String B) {
	System.out.println("String");
}
public void getA(int a,int b) {
	System.out.println("Int");
	System.out.println(a+""+b);
}

public void getA(float a,float b) {
	System.out.println("Float");
	System.out.println(a+""+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SParent s=new SParent();
s.getA(25, 35);
	}

}
