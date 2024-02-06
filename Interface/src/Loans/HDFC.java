package Loans;
import Com.pojo.*;
public class HDFC implements Interest{

	@Override
	public double Interest(double a) {
		double interest=10;
		double Iamount=a*interest/100;
		return a+Iamount;
	}

}
