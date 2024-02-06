package Synchronized;

public class TestSI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticIn i=new StaticIn();
StaticIn i1=new StaticIn();
Thread t=new Thread() {
	public void  run() {
	i.m4();
	}
};
t.start();
Thread t1=new Thread() {
	public void  run() {
		i.m4();	
	}
};
t1.start();

Thread t3=new Thread() {
	public void  run() {
	
	}
};
t3.start();

	}

}
