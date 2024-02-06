package Synchronized;



public class Synchronizebloc extends Thread{

	public void A() {
		for(int i=0;i<=15;i++) {
			System.out.println(i+"Normal Block--------"+Thread.currentThread().getName());
		}
		 
		synchronized (this) {
		for(int i=0;i<=15;i++) {
			System.out.println(i+"Synchronized Block-------"+Thread.currentThread().getName());
		}}
				synchronized (Synchronizebloc.class) {
				for(int i=0;i<=15;i++) {
					System.out.println(i+"Synchronized Class-------"+Thread.currentThread().getName());
				}}
	}

}
