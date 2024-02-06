package Thread;

import Synchronized.Slokam;

public class User {
public static void main(String[] args) {
	Slokam s=new Slokam();
	Thread t=new Thread(s) {
public void run() {
	s.Ticket();
}
	};
	t.start();
	
Thread t1=new Thread(s) {
public void run() {
	s.Ticket();
}
	};
	t1.start();
	
	Thread t2=new Thread(s) {
		public void run() {
			s.Ticket();
		}
			};
			t2.start();

}

}
