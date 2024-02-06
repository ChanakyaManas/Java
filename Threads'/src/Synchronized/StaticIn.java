package Synchronized;

public class StaticIn extends Thread {
	public static synchronized void m1() 
	{
	for(int i=0;i<=3;i++) {
		System.out.println("This is M1 Synchronized Static Method-----"+Thread.currentThread().getName());
	}
	}
	
	public static void m2() {
	for(int i=0;i<=3;i++) {
		System.out.println("This is M2 Static Method-----"+Thread.currentThread().getName()+"----"+i);
	}
	}
	public synchronized void m3() {
		for(int i=0;i<=3;i++) {
			System.out.println("This is M3 Synchronized Instance Method-----"+Thread.currentThread().getName()+"----"+i);
		}
		}
	public void m4() {
		for(int i=0;i<=3;i++) {
			System.out.println("This is M2 Instance Method-----"+Thread.currentThread().getName()+"----"+i);
		}
		}
}
