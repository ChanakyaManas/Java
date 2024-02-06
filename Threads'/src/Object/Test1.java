package Object;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile m=new Mobile(1, "9391133039", "Jio");
Mobile m1=new Mobile(2, "686768876", "BSNL");
Dept d=new Dept(1, "IT");
Mobile[] m2= {m,m1};
Employee e=new Employee(1, "Chanakya", 40000, "Dev", d, m2);
System.out.println(e);
	}
}
