package Threads;

public class Runnables implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
System.out.println(Thread.currentThread().getName()+"--"+i);		
	}}
	public static void main(String[] args) {
		//Since Runnables is a sub class of Runnable and Runnable is a sub class of Thread since Thread also will be a parent of Runnables 
		//Since Parent class can hold sub class reference Thread can hold reference 's'of Child class
		Runnables s=new Runnables();
		Thread t=new Thread(s);
	t.start();
	Thread t1=new Thread(s);
	t1.start();
	Runnables s1=new Runnables();
	Thread t2=new Thread(s1);
t2.start();

	}

	
}
