package NestedTry;

public class NTry {
public void M1() {
	
	try {
	System.out.println(10/0);
try {
	int[]Std= {23,32};
	System.out.println(Std[2]);
}
	catch(ArithmeticException e) {
		System.out.println("Sub Catch---"+e);
	}
	
	}
catch(Exception e){
	System.out.println("Main Catch----"+e);
}
System.out.println("Final");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NTry t=new NTry();
t.M1();
	}

}
