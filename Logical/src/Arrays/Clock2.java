package Arrays;

public class Clock2 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	System.out.println("Before Swap");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+",");
	}
	int temp=a[0];
	for(int i=0;i<=5;i++) {
		a[i]=a[i+1];
	}
	a[a.length-1]=temp;
	System.out.println("\n After Swap");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+",");
	}
}
}
