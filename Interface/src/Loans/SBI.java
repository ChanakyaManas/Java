package Loans;
import Com.pojo.*;
public class SBI implements Interest{

	@Override
	public double Interest(double a) {
	int Interest=5;
	double Iamount=a*Interest/100;
	return a+Iamount;
		
	}

}
