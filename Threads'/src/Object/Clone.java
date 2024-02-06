package Object;

public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dept d=new Dept(1, "IT");

Mobile m=new Mobile(1, "784934", "Jio");
Mobile[] m1= {m};
Employee e=new Employee(1, "Chanakya", 32323, "Dev", d,m1);


Employee e1=(Employee)e.clone();
System.out.println(e+"Original");
System.out.println(e1+"Clone");
e1.setEsal(45000);
e1.getDep().setDname("NonIt");
System.out.println("After Chnaging---");
System.out.println(e+"Original");
System.out.println(e1+"Clone");
	}

}
