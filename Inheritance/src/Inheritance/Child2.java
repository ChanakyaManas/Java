package Inheritance;

public class Child2 extends Parent{
	public double Circle(double pi,double r) {
		return pi*r*r;
	}
	public int Rectangle(int l,int b) {
		return l*b;
	}
	public int Square(int s) {
		return s*s;
	}
	public double Triangle(double b,double h) {
		return 0.5*b*h;
	}

}
