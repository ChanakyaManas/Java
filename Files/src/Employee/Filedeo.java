package Employee;
import com.pojo.Employee;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Filedeo {
public Employee getid(int id) {
Employee e=new Employee();
try {
	FileReader fr=new FileReader("D:\\Emp.txt");
	BufferedReader br=new BufferedReader(fr);
	for(String s=br.readLine();s!=null;s=br.readLine()) {
		String []n=s.split(",");
		if(id==Integer.parseInt(n[0])) {
		e.setEid(Integer.parseInt(n[0]));
		e.setEname(n[1]);
		e.setAge(Integer.parseInt(n[2]));
		e.setEsal(Double.parseDouble(n[3]));
		e.seteDesg(n[4]);
		}
	}
}
catch(Exception e1) {
	System.out.println(e1);
}
return e;
}
public ArrayList<Employee>getname(String name){
	ArrayList<Employee> data=new ArrayList();
	try {
	FileReader fr=new FileReader("D:\\Emp.txt");
	BufferedReader br=new BufferedReader(fr);
	for(String s=br.readLine();s!=null;s=br.readLine()) {
		Employee e=new Employee();
		String[]n=s.split(",");
		if(n[1].equals("Siva")) {
			e.setEid(Integer.parseInt(n[0]));
			e.setEname(n[1]);
			e.setAge(Integer.parseInt(n[2]));
			e.setEsal(Double.parseDouble(n[3]));
			e.seteDesg(n[4]);
		data.add(e);
		}
	}
}
	catch(Exception e1) {
		System.out.println(e1);
	}
	return data;
	}
public ArrayList<Employee>getAll(){
	ArrayList<Employee>e=new ArrayList();
try {
	FileReader fr=new FileReader("D:\\Emp.txt");
	BufferedReader br=new BufferedReader(fr);
	for(String i=br.readLine();i!=null;i=br.readLine()) {
		Employee e1=new Employee();
		String[]n=i.split(",");
		e1.setEid(Integer.parseInt(n[0]));
		e1.setEname(n[1]);
		e1.setAge(Integer.parseInt(n[2]));
		e1.setEsal(Double.parseDouble(n[3]));
		e1.seteDesg(n[4]);
		e.add(e1);
	}
}
catch(Exception e2) {
	System.out.println(e2);
}
return e;
}
}
