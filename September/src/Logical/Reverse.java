package Logical;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int n,rev=0;
System.out.println("Enter the Number to Reverse");
n=in.nextInt();
while(n!=0) {
	rev=rev*10;//0*10//5*10=50//530
	rev=rev+n%10;//0+5=5//50+(n%10=43%10)3=53//530+(4%10=4)4=534//
	n=n/10;//43//4//
}
System.out.println("Rverrse of Entered Number is----"+rev);
	}

}
