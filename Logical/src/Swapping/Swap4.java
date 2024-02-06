package Swapping;

public class Swap4 {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	System.out.println("Before Swapping---------");
	System.out.println("A:"+a+"  B:"+b+"  C:"+c);

	a=a+b;
	b=c-b;
	c=c-b;
	System.out.println("After Swapping---------");
	System.out.println("A:"+a+"  B:"+b+"  C:"+c);

}
}
