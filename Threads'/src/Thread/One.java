package Thread;
public class One extends Thread{
public void run() {
	
		System.out.println(Thread.currentThread().getName());

}
public static void main(String[] args)   {
	One n=new One();
n.start();
n.setName("Badhri");
n.run();

try {
n.start();
}
catch(Exception e) {
	try{
	throw new IllegalThreadStateException("Check Thraed Expression");
	}catch(Exception e1) {
		System.out.println(e1);
	}
}
One n1=new One();
n1.start();
n.run();
}}

