package Hierarchial;

public class test {
public static void main(String[] args) {
	Child1 c=new Child1();
	c.Add(35,45);
	c.Modular(30,9);
	Child2 c1=new Child2();
	c1.Rectangle(20,35);
	c1.Modular(28,9);
	Parent p=new Parent();
	p.Modular(23,12);
	Parent p1=new Child1();
	p1.Modular(20,10);
	Parent p2=new Child2();
	p2.Modular(25,12);
}
}
