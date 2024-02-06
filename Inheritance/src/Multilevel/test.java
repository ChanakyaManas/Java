package Multilevel;

public class test {
public static void main(String[] args) {
	Parent p=new Parent();
	System.out.println("Parent Class");
	p.Modular(10, 9);
	GParent g=new GParent();
	System.out.println("GParent Class");
	char a=78;
char d=g.ASQ(a);
System.out.println(d);
Child1 c=new Child1();
System.out.println("Child1 class");
c.Sub(25, 20);
char e=c.ASQ(a);
System.out.println(e);
c.Modular(25, 20);
Parent p1=new Child1();
System.out.println("Parent holds Child1");
p1.Modular(20, 7);
GParent g1=new Parent();
System.out.println("GParent holds Parent");
char f=g1.ASQ(a);
System.out.println(f);
GParent g2=new Child1();
System.out.println("GParent holds Child1");
char a1=g2.ASQ(a);
System.out.println(a1);
}
}
