package Student;
import java.util.ArrayList;

import com.pojo.Student;
public class Test {
public static void main(String[] args) {
	Filedeo f=new Filedeo();
	Student s=f.getid(2);
	
System.out.println(s.getSid()+":"+s.getSname()+":"+s.getAge()+":"+s.getScore()+":"+s.getQual());
ArrayList<Student>s1=f.getname("Chanakya");
for(int i=0;i<s1.size();i++) {
System.out.println(s1.get(i).getSid()+"---"+s1.get(i).getSname()+"---"+s1.get(i).getAge()+"---"+s1.get(i).getScore()+"---"+s1.get(i).getQual());	
}
ArrayList<Student>s2=f.getall();
for(int i=0;i<=s2.size()-1;i++) {
	System.out.println(s2.get(i).getSid()+"---"+s2.get(i).getSname()+"---"+s2.get(i).getAge()+"---"+s2.get(i).getScore()+"---"+s2.get(i).getQual());
}
}
}
