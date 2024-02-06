package Throws;

import java.io.FileNotFoundException;

public class test {
public static void main(String[] args) {
	try {
		Slokam s=new Slokam("scdsd");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Slokam s1=new Slokam(10,0);
	Slokam s2=new Slokam("rewrew",34);
	double[]b= {35,25};
	try {
	Slokam s=new Slokam(b);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
}
}
