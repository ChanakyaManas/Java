package Object;

public class Yield extends Thread{
public void run() {
	for(int i=1;i<10;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+":"+i);	
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Yield y=new Yield();
		Yield Y1=new Yield();
	y.start();
	Y1.setDaemon(true);
	Y1.start();
	
for(int i=1;i<10;i++) {
		System.out.println(Thread.currentThread().getName()+":"+i);
	}
		
	}}
	

