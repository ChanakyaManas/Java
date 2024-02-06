package Employee;
import java.util.ArrayList;
import com.pojo.Employee;

public class Test {
public static void main(String[] args) {
	Filedeo f=new Filedeo();
	Employee e=f.getid(1);
	System.out.println(e.getEid()+":"+e.getEname()+":"+e.getAge()+":"+e.getEsal()+":"+e.geteDesg());

	
	ArrayList<Employee>e1=f.getname("Siva");
for(int i=0;i<e1.size();i++) {
	System.out.println(e1.get(i).getEid()+":"+e1.get(i).getEname()+":"+e1.get(i).getAge()+":"+e1.get(i).getEsal()+":"+e1.get(i).geteDesg());
}
ArrayList<Employee>e2=f.getAll();
for(int i=0;i<e2.size();i++) {
	System.out.println(e2.get(i).getEid()+"----"+e2.get(i).getEname()+"---"+e2.get(i).getAge()+"---"+e2.get(i).getEsal()+"---"+e2.get(i).geteDesg());
}
}
}
