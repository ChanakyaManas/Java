package Student;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import com.pojo.Student;

public class Filedeo {
public Student getid(int sid) {
	Student S=new Student();
	try {
		FileReader fr=new FileReader("D:\\001\\000.txt");
	BufferedReader br=new BufferedReader(fr);
	for(String i=br.readLine();i!=null;i=br.readLine()) {
		String[]n=i.split(",");
		if(sid==Integer.parseInt(n[0])) {
			S.setSid(Integer.parseInt(n[0]));
			S.setSname(n[1]);
			S.setAge(Integer.parseInt(n[2]));
			S.setScore(Double.parseDouble(n[3]));
			S.setQual(n[4]);
			
		}
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return S;
}
public ArrayList getname(String sname) {
	ArrayList<Student>s=new ArrayList();
try {
	FileReader fr=new FileReader("D:\\001\\000.txt");
	BufferedReader br=new BufferedReader(fr);
	for(String i=br.readLine();i!=null;i=br.readLine()) {
		Student S=new Student();
		String[]n=i.split(",");
		if(n[1].equals("Chanakya")) {
			S.setSid(Integer.parseInt(n[0]));
			S.setSname(n[1]);
			S.setAge(Integer.parseInt(n[2]));
			S.setScore(Double.parseDouble(n[3]));
			S.setQual(n[4]);
			s.add(S);
		}
	
}
	} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
return s;
}
public ArrayList getall() {
	ArrayList<Student>s2=new ArrayList();
	try {
		FileReader fr=new FileReader("D:\\001\\000.txt");
		BufferedReader br=new BufferedReader(fr);
		
		for(String i=br.readLine();i!=null;i=br.readLine()) {
			Student s=new Student();
			String [] n=i.split(",");
			s.setSid(Integer.parseInt(n[0]));
			s.setSname(n[1]);
			s.setAge(Integer.parseInt(n[2]));
			s.setScore(Double.parseDouble(n[3]));
			s.setQual(n[4]);
			s2.add(s);
		}}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}	
		return s2;
		}}

