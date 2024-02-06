package New;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dept d=new Dept(1, "IT");
Employee e=new Employee(1, "Chanakya", 4000, "Dev", d);

System.out.println("Original"+e);
Employee e1=(Employee)e.Clone();
System.out.println("Copy:"+e1);
e1.getD().setDname("Non IT");
System.out.println("Original"+e);
System.out.println("Copy"+e1);
	}

}
