package Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("Before Swap");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
	}
		System.out.println("\nAfter swap");
int temp=a[a.length-1];
for(int i=a.length-1;i>=0;i--) {
	System.out.print(a[i]+",");
}

	}

}
