package NestedFor;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int h=1;h<=24;h++) {
	for(int m=0;m<60;m++) {
		for(int s=0;s<60;s++) {
			System.out.println(h+":"+m+":"+s);
		}
	}
}
	}

}
