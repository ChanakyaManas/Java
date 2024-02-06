package Logical;

public class FactPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=2395;
int c=0;
int count=0;
System.out.println("Prime Factors of Given Number");
for(int i=2;i<=a/2;i++)
{
	if(a%i==0) 
	{
		c=i;
		System.out.println("Factors---"+c);
		}
	}
for(int j=2;j<c/2;j++) {
	int e=j%c;
	if(e==0) {
		System.out.println(e);
	}
}
	}

}
