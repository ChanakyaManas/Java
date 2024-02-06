package Swapping;
import java.util.Scanner;
public class Swap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
int b=30;
int c=40;
System.out.println("Before Swapping---------");
System.out.println("A:"+a+"  B:"+b+"  C:"+c);
int temp=c;
c=b;
b=a;
a=temp;
System.out.println("After Swapping---------");
System.out.println("A:"+a+"  B:"+b+"  C:"+c);
	}

}
