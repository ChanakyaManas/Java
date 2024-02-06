package Void;

public class Types {
	public void m1() {
	System.out.println("Method Without parameters");	
	}
	public void m2(int a) {
		int b=30;
		System.out.println(a+b);
	}
	public void m3(int[]m) {
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i]+":");
		}}
	void m4(Std sd) {
		System.out.println(sd.sid);
		System.out.println(sd.sname);
		for(int i=0;i<sd.marks.length;i++) {
		System.out.println(sd.marks[i]);
		}
		for(int i=0;i<sd.Subjects.length;i++) {
        System.out.println(sd.Subjects[i]);
	}}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]marks= {35,43,56,89,78,89};
Std s=new Std();
Types t=new Types();
t.m3(marks);
	s.sid=1;
	s.sname="Chanakya";
	int[]n= {35,43,56,89,78,89};
	s.marks=n;
	String [] c={"Tel","Eng","Hin","Mat","Sci","Soc"};
	s.Subjects=c;
	t.m4(s);
	}

}
