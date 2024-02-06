package New;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=121;
int temp=a;
int rev=0;
for(;a>0;) {
	rev=(rev*10)+(a%10);
	a=a/10;
}
System.out.println(rev);
if(temp==rev) {
	System.out.println("It is a Palindrome:"+rev);
}
else {
	System.out.println("It is not a Palindrome:"+rev);
}
	}

}
