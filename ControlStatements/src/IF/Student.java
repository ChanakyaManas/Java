package IF;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sname="Chanakya";
		int id=1;
		System.out.println(id);
		System.out.println(sname);
		int count=0;
		int[]marks= {78,98,89,96,94,93};
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
			if(marks[i]<=35) {
				System.out.println("Fail");
			}
			if(marks[i]>35&&marks[i]<=45) {
				System.out.println("E");
			}
			if(marks[i]>45&&marks[i]<=55) {
				System.out.println("D");
			}
			if(marks[i]>55&&marks[i]<=65) {
				System.out.println("C");
			}
			if(marks[i]>65&&marks[i]<=75) {
				System.out.println("B");
			}
			if(marks[i]>75&&marks[i]<=85) {
				System.out.println("B+");
			}
			if(marks[i]>85&&marks[i]<=92) {
				System.out.println("A");
			}
			if(marks[i]>92) {
				System.out.println("A+");
			}
			count=count+marks[i];
		}
		System.out.println("Total---"+count);
		double Percentage=count/marks.length;
		System.out.println("Percentage----"+Percentage);
		
	}

}
