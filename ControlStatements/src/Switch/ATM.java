package Switch;
import java.util.Scanner;
public class ATM {
double Balance=30000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ATM a=new ATM();
Scanner in=new Scanner(System.in);
System.out.println("1.Deposit");
System.out.println("2.Withdrawl");
System.out.println("3.Check Balance");
System.out.println("4.Exit");
int Choice=in.nextInt();
switch(Choice) {
case 1:
System.out.println("----Enter Deposit Amount-----");
double Deposit=in.nextDouble();
double Balance=Deposit+a.Balance;
System.out.println("Deposit-----"+Deposit);
System.out.println("Balance after Deposit----"+Balance);
break;
case 2:
	System.out.println("----Enter Withdrawl Amount-----");
	double Withdrawl=in.nextDouble();
	if(Withdrawl<a.Balance) {
		Balance=a.Balance-Withdrawl;
		System.out.println("Withdraw-----"+Withdrawl);
		System.out.println("Balance after Withdrawl----"+Balance);	
	}
	else {
		System.out.println("-----Insufficient Balance------");
	}
	
break;
case 3:
	System.out.println("Checking Bank Balance----");
	System.out.println(""+a.Balance);
break;
case 4:
	System.out.println("Thankyou----Visit Again");
break;

}
	}

}