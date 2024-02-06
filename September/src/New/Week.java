package New;
import java.util.Scanner;
public class Week {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int count=in.nextInt();
	for(int i=2;i<=count/2;i++) {
		count++;
	}
	if(count%1==0&&count%count==0) {
		System.out.println("Prime Number");
	}
	else{
		System.out.println("Composite");
	}

}
}
