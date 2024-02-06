package Errors;

public class Test {
public void m1() {
	int []num= {1,2,3};
	
	
	try {
		System.out.println(10/0);
	}
	catch(ArithmeticException B) {
		System.out.println(B);
		System.out.println("------------");
	}
	try {
		System.out.println(num[3]);
		System.out.println(10/0);
	}
	catch(ArrayIndexOutOfBoundsException A) {
		System.out.println(A);
		System.out.println("**************");
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("$$$$$$$$$$$$$$$$$$");
	}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
t.m1();

}
}