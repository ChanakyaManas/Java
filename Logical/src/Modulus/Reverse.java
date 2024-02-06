package Modulus;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=123;
int rev=0;
for(;a>0;) {
	rev=(rev*10)+(a%10);
	a=a/10;
}
System.out.println("Reverse Of A Number---"+rev);
	}

}
