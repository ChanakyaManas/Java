package Threads;

public class Exceptional extends Thread{

	public void m1() {
		System.out.println("M1 method:"+Thread.currentThread().getName());	
		}

		public void run() {
			m1();
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Exceptional n=new Exceptional();
				Thread t=new Thread();
				n.start();
				try {
				n.start();
				}
				catch(Exception e) {
					try {
					throw new IllegalThreadStateException("Check the Call");
				}catch(Exception e1) {
					System.out.println(e1);
				}}
				System.out.println(currentThread().getName());
			}

		}
