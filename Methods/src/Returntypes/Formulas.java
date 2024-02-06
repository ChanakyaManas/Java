package Returntypes;

public class Formulas {
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
public static void main(String[] args) {
	Formulas f=new Formulas();
	double C=f.Circle(23, 5);
	System.out.println("Area of Circle:"+C);
	int R=f.Rectangle(30, 40);
	System.out.println("Area of Rectangle:"+R);
	int S=f.Square(15);
	System.out.println("Area of Square:"+S);
	double T=f.Triangle(30, 23);
	System.out.println("Area of Triangle:"+T);
}
}
