package Clone;

public class DeadLock1 {
static int a=20;
static int b=30;
public static  void m1() {
System.out.println("This is M1 Method");
	System.out.println(a);
	try {
		Thread.sleep(200);
		m2();
		System.out.println(b);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
public static void m2() {
	System.out.println("This is M2 Method");
System.out.println(b);
Thread.holdsLock(b);
try {
	Thread.sleep(200);
	m1();
	System.out.println(a);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DeadLock1 d1=new DeadLock1();
Thread t=new Thread() {
	public void run(){
	 d1.m1();
	}
};t.start();
	}

}
