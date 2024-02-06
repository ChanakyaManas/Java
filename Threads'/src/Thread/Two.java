package Thread;

public class Two implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i=1;i<10;i++) {
		try{
			
			System.out.println(Thread.currentThread().getName());		
			Thread.sleep(1000);
		}
		catch(Exception e) {
		System.out.println(e);
		}}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Two t=new Two();
Thread th=new Thread(t);
th.start();
th.setName(" Badhri");
Two t1=new Two();
Thread th1=new Thread(t1);
th1.start();

	}

	
}
