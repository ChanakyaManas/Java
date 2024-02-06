package Object;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
Test t1=new Test();
System.out.println(t.hashCode());
System.out.println(t.getClass());
System.out.println(t.equals(t1));	
t=t1;
System.out.println(t==t1);
System.out.println(t.toString());
	Employee e=new Employee(1,"Chanakya",23232,"Dev");
	System.out.println(e);
	}

}
