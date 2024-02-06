package Finally;

public class NestedFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println("Hi");
	System.out.println(10/0);
}
catch(Exception e) {
	System.out.println("Catch Block 1--"+e);
	try {
		int[]a= {24,553};
		System.out.println(a[3]);
	}
	catch(ArithmeticException e1) {
		System.out.println("Catch block--2"+e1);
	}
	finally {
		System.out.println("Closed Inner");
	}
}
finally {
	System.out.println("Outer Final Block");
	try {
		System.out.println(10/0);
	}
	catch(ArithmeticException e) {
		System.out.println("Catch Block 3---"+e);
	}
	finally {
		System.out.println("Last Final Block");
	}
}
	}

}
