package Modulus;

public class Count {
public static void main(String[] args) {
	int[] a= {2,2,8,4,5,5};
	int j=0;
	for(int i=0;i<a.length;i++) {
		j=i+1;
	}
	System.out.println("Total count----"+j);
	
	for(int i=0;i<a.length;i++) {
	if(a[i]%2==0) {
		j=i+1;
	}}
	System.out.println("Total Even count-----"+j);

	
	
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			j=a[i]+j;
		}
	}
	System.out.println("Total even sum value----"+j);
	
	j=1;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			j=a[i]*j;
		}
	}
	System.out.println("Multiplication values of Even----"+j);
	
}



}
