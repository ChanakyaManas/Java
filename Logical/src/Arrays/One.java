package Arrays;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7};
System.out.println("Before Swap");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+",");
}

int temp=a[6];
a[6]=a[5];
a[5]=a[4];
a[4]=a[3];
a[3]=a[2];
a[2]=a[1];
a[1]=a[0];
a[0]=temp;

System.out.println("\nAfter swap");

for(int i=0;i<a.length;i++) {
	
	System.out.print(a[i]+",");
}

	}

}
