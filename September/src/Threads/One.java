package Threads;

public class One extends  Thread{
public void m1() {
System.out.println("M1 method:"+Thread.currentThread().getName());	
}

public void run() {
	m1();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
One n=new One();
		Thread t=new Thread();
		n.start();
		n.setName("Chanakya");
		n.run();
		System.out.println(currentThread().getName());
	}

}
