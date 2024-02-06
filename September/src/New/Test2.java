package New;

public class Test2 {
public static void main(String[] args) {
	Store s=new Store(1, "Digihub", "Rjy");
Dept1 d=new Dept1(1, "IT", s);
	Student1 s1=new Student1(1, "Chanakya", d);
	Student1 s2=(Student1)s1.clone();
	System.out.println("Original----"+s1);
	System.out.println("Instance-----"+s2);
	s2.getDept().getS().setsLoc("Hyderabad");

	System.out.println("Original----"+s1);
	System.out.println("Instance-----"+s2);
}
}
