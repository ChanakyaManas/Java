package Thread;

public class Withdrawl{
	double Balance=30000;
	public void m2(double Withdrawl) {
		if(Balance>Withdrawl) {
		double TBalance=Balance-Withdrawl;
		System.out.println("Withdrawl Amount------"+Withdrawl);
		System.out.println("Balance after Withdrawl-----"+TBalance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
		System.out.println("Withdrawl----");
	}
}
