package Synchronized;

public class Test2 extends Thread{
public static synchronized void m1() 
{
for(int i=0;i<=3;i++) {
	System.out.println("This is M1 Method-----"+Thread.currentThread().getName());
}
}
public void m2() {
for(int i=0;i<=3;i++) {
	System.out.println("This is M2 Method-----"+Thread.currentThread().getName()+"----"+i);
}
}}
