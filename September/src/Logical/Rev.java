package Logical;
import java.util.Scanner;
public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int c,rev=0;
System.out.println("Enter number to reverse");
c=s.nextInt();
while(c!=0) {
	rev=rev*10;
	rev=rev+c%10;
	c=c/10;
}
System.out.println("Reverse of a given Number is ---"+rev);
	
	}

}
