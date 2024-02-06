package Logical;

public class Args {
public void b(int...n) {
	for(int i=0;i<n.length;i++) {
		System.out.println(n[i]);
	}
	}
public void b(String...n) {
	for(int i=0;i<n.length;i++) {
		System.out.println(n[i]);
	}
}
public void b(Object...n) {
	for(int i=0;i<n.length;i++) {
		System.out.println(n[i]);
	System.out.println("Object Class---");
	}
}
public static void main(String[] args) {
	Args a=new Args();
	a.b(12,34,56);
	a.b("Chanakya","Ravi","Ram");
	
}
}
