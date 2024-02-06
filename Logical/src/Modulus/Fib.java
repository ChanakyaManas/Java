package Modulus;
import java.util.Scanner;
public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter the 1st integer of Fib");
int a=in.nextInt();
System.out.println("Enter the 2nd Integer of Fib");
int b=in.nextInt();
System.out.println("Enter the Numbers Count");
int i=in.nextInt();
System.out.print(a+",");
System.out.print(b+",");
int n=0;
for(int c=0;c<i;c++) {
	n=a+b;
	System.out.print(n+",");
a=b;
b=n;
}
	}

}
