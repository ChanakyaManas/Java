package Synchronized;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 B1=new Test2();
		Test2 B=new Test2();
Thread t1=new Thread() {
	public void run() {
		B.m1();
	}
};
t1.start();
Thread t2=new Thread() {
	public void run() {
		B.m1();
	}
};
t2.start();
Thread t3=new Thread() {
	public void run() {
		B.m1();
		B.m2();
	}
};
t3.start();
Thread t4=new Thread() {
	public void run() {
		B1.m2();
	}
};
t4.start();
	}

}
