package Logical;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Enter The Number to Verify");		
int a=in.nextInt();
int c=0;
int count=0;
for(int i=2;i<=a/2;i++) {
	int b=i*i;
	if(b==a) {
    c=i;	
	count=b;
	}
}
if(count==a) {
System.out.println("Perfect Square");
System.out.println("Perfect Square of----"+c);
	}
else {
	System.out.println("Not Perfect Square");
}
	}

}
