package Modulus;

public class Fibanochi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
System.out.print(a+",");
int b=1;
System.out.print(b+",");
int c=0;
for(int i=0;i<5;i++) {
	c=a+b;
	System.out.print(c+",");
	a=b;
	b=c;
}
	}

}
