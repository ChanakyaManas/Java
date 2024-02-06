package Thread;
public class DW1 extends Deposit{	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	DW1 d=new DW1 ();
	Bank b=new Bank();
		Thread t=new Thread() {
		public void run(){
			b.m1(20000);
			b.m2(5000);
		}
		};
		t.start();	
		}
	}
