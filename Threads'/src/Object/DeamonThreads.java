package Object;

public class DeamonThreads {
public void m1() {
	for(int i=1;i<10;i++) {
	try {
		Thread.sleep(500);
		System.out.println(Thread.currentThread().getName()+":"+i);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
	public void m2() {
		for(int i=1;i<10;i++) {
			
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+":"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		public void m3() {
			for(int i=1;i<10;i++) {
				try {
					Thread.sleep(2000);
					System.out.println(Thread.currentThread().getName()+":"+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DeamonThreads D=new DeamonThreads();
Thread t=new Thread() {
	public void run() {
		D.m1();
	}
	
	
};
t.setDaemon(true);
t.start();
Thread t1=new Thread() {
	public void run() {
		D.m2();
	}
	
	
};
t1.start();
Thread t2=new Thread() {
	public void run() {
		D.m3();
	}
	
	
};
t2.start();

	}

}
