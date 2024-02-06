package Synchronized;

public class Bank extends Thread{
public static double Balance=3000;

public synchronized void Deposit(double D) {
	if(D<=0) {
		System.out.println("Balance-----"+Balance);
	}
	else{
	Balance=Balance+D;
	System.out.println("Balance after Deposit---"+Balance);
	}
	notifyAll();
}
public synchronized void Withdrawl(double w) {
	if(w<=Balance) {
		Balance=Balance-w;
		System.out.println("After Withdrawl--"+Balance);
	}
	else {
		System.out.println("Insufficient Balance");
		try {
			wait(5000);
			/* Withdrawl(3000); */

				System.out.println("Enter Withdrawl Amount:"+w);
				Balance=Balance-w;
				System.out.println("Balance Value---:"+Balance);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
