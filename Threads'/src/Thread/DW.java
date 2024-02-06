package Thread;

public class DW extends Thread{
public void m1() {
	System.out.println("Deposit-----"+Thread.currentThread().getName());
}
public void m2() {
	System.out.println("Withdrawl----"+Thread.currentThread().getName());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DW d=new DW();

Thread t=new Thread(d)
{
	public void run() {
d.m2();		
	}
};
t.start();
t.setName("Withdrawl");
Thread t1=new Thread() {
	public void run() {
		d.m1();
	}
};
t1.start();
t1.setName("Deposit");
	}

}
