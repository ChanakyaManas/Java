package Synchronized;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
Bank b=new Bank();
Thread t=new Thread() {
	public void run() {
		b.Withdrawl(4000);
	}
};
t.start();
Thread t1=new Thread() {
	public void run() {
	try {
	t.sleep(3000);
		b.Deposit(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
};
t1.start();

Bank b1=new Bank();
Thread t2=new Thread() {
public void run() 
{
	b1.Withdrawl(5000);
}
	};
	t2.start();
	}

}
