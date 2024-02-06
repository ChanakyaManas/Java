package Modulus;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=6;
int value=1;
for(int i=2;i<=num/2;i++) {
	if(num%i==0)//6%2==0,6%3==0//
	{
		value=value+i;//1+2+3=6//
	}
}
if(num==value) {
	System.out.println("It is a perfect Number");
}
else {
	System.out.println("It's Not A Perfect Number");
}
	}

}
