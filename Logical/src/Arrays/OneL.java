package Arrays;

public class OneL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("Before Swap");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		int temp=a[a.length-1];
		System.out.println("\nAfter swap");
		for(int i=a.length-1;i>=1;i--) {
			a[i]=a[i-1];
			}
		a[0]=temp;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");

		}
	}

}
