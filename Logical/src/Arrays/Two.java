package Arrays;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("Before Swap");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
	}
		a[0]=a[6];//7
		a[1]=a[3]-a[2];//1
		a[2]=a[4]-a[2]; //2
		a[3]= a[3]-a[1];//3
		a[4]=a[1]+a[3];//4
		a[5]=a[3]+a[2];//5
		a[6]=a[4]+a[2];
		
		
		System.out.println("\nAfter swap");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+",");
		}


	}

}
