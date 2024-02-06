package Stddetails;

public class Studentdata {
int sid;
String name;
int sage;
double Smarks;
String SQual;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Studentdata s=new Studentdata();
s.sid=1;
s.name="Chanakya";
s.sage=25;
s.Smarks=500;
s.SQual="B.Com";
System.out.println(s.sid);
System.out.println(s.name);
System.out.println(s.sage);
System.out.println(s.Smarks);
System.out.println(s.SQual);
Studentdata s1=new Studentdata();
s1.sid=2;
s1.name="Ravi";
s1.sage=25;
s1.Smarks=600;
s1.SQual="B.Sc";
System.out.println(s1.sid);
System.out.println(s1.name);
System.out.println(s1.sage);
System.out.println(s1.Smarks);
System.out.println(s1.SQual);

	}

}
