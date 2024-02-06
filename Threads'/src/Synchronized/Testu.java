package Synchronized;

public class Testu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test2 t=new Test2();
Thread t1=new Thread() {
	public void run() {
		t.m1();
	}
};
t1.setName("Chanakya");
t1.start();
Test2 r=new Test2();
Thread t2=new Thread() {
	public void run() {
		r.m1();
	}
};
t2.setName("Ravi");
t2.start();
Test2 r1=new Test2();
Thread t3=new Thread() {
	public void run() {
		r1.m1();
	}
};
t3.setName("Raju");
t3.start();
Test2 r2=new Test2();
Thread t4=new Thread() {
	public void run() {
		r2.m1();
	}
};
t4.setName("Ram");
t4.start();
	}

}
