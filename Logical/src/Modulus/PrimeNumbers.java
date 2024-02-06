package Modulus;

public class PrimeNumbers {
public static void main(String[] args) {
	int num=30;
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			System.out.print(i+",");
		count++;
		}}
	if(count==2) {
		System.out.println("Prime----number");
	}
	else {
		System.out.println("Composite");
	}
}
}
