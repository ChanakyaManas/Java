package Swapping;
import java.util.Scanner;
public class Sswp {
	Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sswp s=new Sswp();
        System.out.println("Enter Value for A");
		int a=s.in.nextInt();
		System.out.println("Enter Value for B");
		int b=s.in.nextInt();
		System.out.println("Enter Value for C");
		int c=s.in.nextInt();
		System.out.println("Enter Value for D");
		int d=s.in.nextInt();
		System.out.println("Before Swapping---------");
		System.out.println("A:"+a+"  B:"+b+"  C:"+c+"   D:"+d);
//	int temp=a;
//	a=d;
//	d=c;
//	c=b;
//	b=temp;
		a=a+c;//40
		b=d-c;//10
		c=c-b;//20
		d=d-b;//30
		
	System.out.println("After Swapping");
	System.out.println("A:"+a+"  B:"+b+"  C:"+c+"   D:"+d);
	
	
	}

}
