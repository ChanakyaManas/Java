package Synchronized;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synchronizebloc c=new Synchronizebloc();
		Synchronizebloc c1=new Synchronizebloc();
		Thread t=new Thread() {
			public void run() {
				c.A();
			}
		};
		t.start();
		Thread t1=new Thread() {
			public void run() {
				c1.A();
			}
		};
		t1.start();
		
	}

}
