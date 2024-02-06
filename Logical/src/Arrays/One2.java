package Arrays;

public class One2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("Before Swap");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		int temp=a[6];
	for(int i=6;i>=1;i--) {
		a[i]=a[i-1];
	}
	a[0]=temp;
	System.out.println("\nAfter swap");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+",");

	}
	}

}
