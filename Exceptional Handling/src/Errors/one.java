package Errors;

public class one {
public void m1() {
	System.out.println("M1 Started-----");
//try{
	m2();
//}
/*/catch(ArithmeticException e) {
	System.out.println(e);
}/*/
System.out.println("M1 Ended----");
}
public void m2() {
	System.out.println("M2 Started------");
	//try {
	int a=10/0;
	System.out.println(a);
	//}
	//catch(ArithmeticException e) {
	//	System.out.println(e);
	//}
	System.out.println("M2 Ended");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
one o=new one();
	System.out.println("Main method Started");
	try {
	o.m1();
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	System.out.println("Main Method Ended");
	}

}
