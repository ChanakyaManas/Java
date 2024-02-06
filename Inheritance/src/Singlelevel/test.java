package Singlelevel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p=new Parent();
System.out.println("Parent Class");
p.Modular(30, 9);
Child1 c=new Child1();
System.out.println("Child class");
c.Add(4, 6);
c.Div(30, 4);
c.Modular(30, 4);
Parent p1=new Child1();	
System.out.println("Parent holds Child class");
	p1.Modular(10, 3);
	}

}
