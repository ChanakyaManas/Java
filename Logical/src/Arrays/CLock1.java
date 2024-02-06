package Arrays;

public class CLock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("Before Swap");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		int temp=a[0];
		for(int i=0;i<=5;i++) {
			a[i]=a[i+1];
		}
		a[6]=temp;
		System.out.println("\n After Swap");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}

}
