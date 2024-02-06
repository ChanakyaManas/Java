package Collect;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for(int i=0;i<=4;i++) {
System.out.print("*");
}
for(int j=0;j<=4;j++) {
	System.out.println("*");
	if(j==4) {
		for(int i=0;i<=5;i++) {
			System.out.print("*");
		}
	}
}
System.out.println("        ");
System.out.println("        ");
for(int i=0;i<=4;i++) {
	System.out.println("*");
	if(i==1) {
		for(int j=0;j<=4;j++) {
		System.out.print("*");
		for(int h=0;h<=5;h++) {
			System.out.print("");
		}
		}
		
	}
}
	}

}