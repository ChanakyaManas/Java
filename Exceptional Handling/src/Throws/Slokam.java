package Throws;
import java.io.*;

public class Slokam {
	
	
	  public Slokam(String name)throws FileNotFoundException {
	  System.out.println("File Not Exist"); }
	 public Slokam(double a,double b)throws ArithmeticException{
	System.out.println(a/b);
}
public Slokam(double []a)throws ArrayIndexOutOfBoundsException{
	for(int i=0;i<a.length;i++) {
System.out.println(a[2]);
}}

public Slokam(String path,int count) {
	try {
		FileReader fr=new FileReader("");
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	catch(FileNotFoundException e) {
		System.out.println(e);
	} 	
}
public void m2(String a)throws FileNotFoundException {
System.out.println("HII");	
}
public void m3(int a)throws ArithmeticException{
	System.out.println(a);
}
public void m4(String path,int count) {
	try {
		FileReader fr=new FileReader("");
		fr.close();
	}
	catch(FileNotFoundException f){
		System.out.println(f);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
public void m5(String path,int count) throws IOException {
	try {
		FileReader fr=new FileReader("");
		fr.close();
	}
	catch(FileNotFoundException f){
		System.out.println(f);
	}
	}


}
