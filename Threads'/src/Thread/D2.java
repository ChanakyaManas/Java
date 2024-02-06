package Thread;
import java.util.Scanner;
public class D2 extends Deposit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2 d=new D2();	
		Scanner in=new Scanner(System.in);
System.out.println("1.Deposit");
System.out.println("2.Withdrawl");
System.out.println("3.Exit");
int Choice=in.nextInt();

switch(Choice) {
case 1:
	Thread t=new Thread() 
	{
public void run() {
	System.out.println("Enter your Deposit Amount");
int	DChoice=in.nextInt();
	d.m1(DChoice);
}
};
t.start();

break;

case 2:
	
	Thread t1=new Thread() {
	public  void run() {
		System.out.println("Enter your Withdrawl amount");
		int	WChoice=in.nextInt();
		d.m2(WChoice);
	}
};
t1.start();
break;

default:
	System.out.println("ATM ki endhuku vachav ra POOKA");
}

	}
	
	}

