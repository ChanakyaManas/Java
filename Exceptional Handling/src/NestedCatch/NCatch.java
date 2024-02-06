package NestedCatch;

public class NCatch {
public void A() {
	try {
		System.out.println(10/0);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
		try {
			int[]Std= {23,32};
			System.out.println(Std[2]);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		
	}
	System.out.println("Final");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NCatch n=new NCatch();
n.A();
	}

}
