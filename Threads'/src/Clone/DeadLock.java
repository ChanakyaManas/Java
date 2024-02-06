package Clone;

public class DeadLock {
public static final String namea="Chanakya";
public static final String nameb="Ravi";
public  void a() {
	synchronized(namea) {
		System.out.println(namea);
	try {
		Thread.sleep(20);
		synchronized(nameb) {
			System.out.println(nameb);
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
public  void b() {
	synchronized(nameb) {
		System.out.println(nameb);
		try {
			Thread.sleep(20);
			synchronized(namea) {
				System.out.println(namea);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DeadLock l=new DeadLock();
Thread t=new Thread() {
	public void run() {
		l.a();
	}
	
};
t.start();
Thread t1=new Thread() {
	public void run() {
		l.b();
	}
	
};
t1.start();
DeadLock l1=new DeadLock();
Thread t2=new Thread() {
	public void run() {
		l1.b();
	}
	
};
t2.start();
	}

}
