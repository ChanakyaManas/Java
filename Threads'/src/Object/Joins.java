package Object;
public class Joins {
public  void m1() {
	for (int i = 0; i < 10; i++) {
		try {
			Thread.sleep(200);
			System.out.println(Thread.currentThread().getName()+"---"+i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Joins j=new Joins();
	Thread t=new Thread() {
		public void run() {
	j.m1();
		}
	};
	t.isInterrupted();
	t.start();
	try {
		
	System.out.println("Thread0--Completed");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Thread t1=new Thread() {
		public void run() {
	j.m1();
		}
	};
	
	t1.start();
	try {
		t1.interrupted();	
		//t1.join();
		System.out.println("Thread1--Completed");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Thread t2=new Thread() {
		public void run() {
	j.m1();
		}
	};
	t2.start();
	}

}
