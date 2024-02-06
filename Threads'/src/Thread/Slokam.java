package Synchronized;

public class Slokam extends Thread{
public synchronized void Ticket() {
	for(int i=0;i<=15;i++) {
		System.out.println(i+":"+Thread.currentThread().getName());
	}
}
}
