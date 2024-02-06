package Modulus;

public class EroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {2,2,8,4,5,5};
for(int i=0;i<a.length;i++) {
	if(i%2==0&&a[i]%2==0) {
		System.out.println("Even---"+a[i]);
	}
	else if(i%2!=0&&a[i]%2!=0) {
		System.out.println("Odd---"+a[i]);
	}
	}
	
	}
}
