package Thread;

public class Bank {
	public static double Balance=3000;
		public void m1(double Deposit) {	
			Balance=Balance+Deposit;
			System.out.println("Deposit-----");
		System.out.println("Deposit Amount------"+Deposit);
		System.out.println("Balance after Deposit-----"+Balance);
		}
		public void m2(double Withdrawl) {
			if(Balance>Withdrawl) {
			Balance=Balance-Withdrawl;
			System.out.println("Withdrawl Amount------"+Withdrawl);
			System.out.println("Balance after Withdrawl-----"+Balance);
			}
			else {
				System.out.println("Insufficient Balance");
			}
			System.out.println("Withdrawl----");
}}
