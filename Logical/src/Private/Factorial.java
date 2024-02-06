package Private;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,c,fact=1;
Scanner in=new Scanner(System.in);
System.out.println("Enter your Desired Number");
	n=in.nextInt();
	if(n<0) {
		System.out.println("Enter Positive Number");
	}
	else {
		for(c=1;c<n;c++) {
			fact=fact*c;
		
		}
		System.out.println("Factorial of:"+n+"---"+fact);
	}
	}
	

}
