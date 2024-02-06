package Swapping;

public class Swap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
int c=30;
int d=40;
System.out.println("Before Swapping---------");
System.out.println("A:"+a+"  B:"+b+"  C:"+c+"   D:"+d);
int temp=a;
a=d;
d=c;
c=b;
b=temp;
System.out.println("After Swapping---------");
System.out.println("A:"+a+"  B:"+b+"  C:"+c+"   D:"+d);
	
	}

}
