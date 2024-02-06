package Throw;
import java.util.Scanner;
public class ATM {
	
	
	 int pin=2341;
	static double Balance=30000;
	static double Withdrawl=200000;
	static boolean Network=true;
	public static void main(String[] args) {
		ATM a=new ATM();
		// TODO Auto-generated method stub
		if(Network) {
			System.out.println("Network Up Proceed");
			Scanner in=new Scanner(System.in);
			{
				System.out.println("Enter Your ATM Pin");
			}
			int Pin=in.nextInt();
			 int OPin=Pin;
			if(a.pin==OPin) {
	System.out.println("Valid Pin Proceed");
	if(Balance>=Withdrawl){
		double MBalance=Balance-Withdrawl;
		System.out.println("Sufficient Funds Processing Amount");
	System.out.println("Balance after Withdrawl:"+MBalance);
	}
	else {
		throw new Insufficient("Insufficient Funds");
		}
         }
else {
	throw new Pinvalidation("Invalid Pin");
}
	}
		else {
			try {
			throw new Network("Network is down");
		}catch(Exception e) {
			System.out.println(e);
		}
			}
	}
}
