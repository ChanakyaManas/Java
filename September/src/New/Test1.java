package New;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] sub= {"Commerce","Economics","Civics","Telugu","English"};
		Sub s=new Sub(sub).clone();
		int []marks= {98,86,100,78,87};
		
		Marks m=new Marks();
		Mobile m1=new Mobile(1, "432434234", "Jio");
		Mobile m2=new Mobile(2, "434342", "Airtel");
		Mobile[]m3= {m1,m2};
		m.setMarks(marks);
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("Chanakya");
		s1.setSage(20);
		s1.setSQual("Inter");
		s1.setMarks(m);
		s1.setSub(s);
		s1.setM(m3);
		System.out.println(s1);
		Student s2=(Student)s1.clone();
		System.out.println("Before Clone");
		System.out.println(s1);
		System.out.println(s2);

System.out.println("After Clone-----");

System.out.println(s1);
System.out.println(s2);
	}

}
