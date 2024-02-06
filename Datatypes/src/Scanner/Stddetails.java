package Scanner;
import java.util.Scanner;
public class Stddetails {
byte sid;
int age;
String sname;
boolean Pass;
char Gender;
short Smarks;
double Percentage;
float CGPA;
long Mobileno;
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
Stddetails s=new Stddetails();
System.out.println("SID");
s.sid=in.nextByte();
System.out.println("SName");
s.sname=in.next();
System.out.println("Sage");
s.age=in.nextInt();
System.out.println("Mobile no");
s.Mobileno=in.nextLong();
System.out.println("Gender");
s.Gender=in.next().charAt(0);
System.out.println("Marks");
s.Smarks=in.nextShort();
System.out.println("Percentage");
s.Percentage=in.nextDouble();
System.out.println("CGPA");
s.CGPA=in.nextFloat();
System.out.println("Pass");
s.Pass=in.nextBoolean();
System.out.println(s.sid);
System.out.println(s.sname);
System.out.println(s.age);
System.out.println(s.Gender);
System.out.println(s.Mobileno);
System.out.println(s.Smarks);
System.out.println(s.Percentage);
System.out.println(s.CGPA);
System.out.println(s.Pass);

}
}
