package Thread;

public class Run  extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Run--"+i+Thread.currentThread().getName());
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Run r=new Run();
r.start();
for(int i=0;i<10;i++) {
	System.out.println("Main---"+i+Thread.currentThread().getName());
}
	}

}
