package Logical;

public class Setprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=343567;
while(a>1) {
	int b=a%10;//5
	if(b%2!=0) 
	{
		System.out.print(b+",");
	}
	a=a/10;//834
}
	}

}
