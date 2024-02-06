package Thread;

public class Test {
public void m1() {
	System.out.println("M1 Starts--------------"+Thread.currentThread().getName());
	m2();
System.out.println("M1 Ends--------------"+Thread.currentThread().getName());
}
public void m2() {
	System.out.println("M2 Starts------------"+Thread.currentThread().getName());
	
	System.out.println("M2 Ends------------"+Thread.currentThread().getName());

for(int i=0;i<10;i++) {
	System.out.println(i+""+Thread.currentThread().getName());
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
t.m1();
	}

}
