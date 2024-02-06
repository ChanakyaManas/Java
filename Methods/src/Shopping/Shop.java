package Shopping;
import java.util.Scanner;
public class Shop {
	double vat=10;
public void SBill(double price,int quan,double VAT,double dis) {
double PBill=price*quan;
	System.out.println("Bill---"+PBill);
VAT=PBill*vat/100;
System.out.println("VAT"+VAT);
double VBill=PBill+VAT;
System.out.println("VAT+Bill----"+VBill);
double Discount=VBill*dis/100;
System.out.println("Discount---"+Discount);
double TBill=VBill-Discount;
System.out.println("TotalBill---"+TBill);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
		Shop s=new Shop();
	System.out.println("Enter Product Price");
	double p=in.nextInt();
	System.out.println("Enter Product Quantity");
	int Q=in.nextInt();
double Bill=Q*p;
if(Bill>=5000&&Bill<10000) {
	double disc=5;
	s.SBill(p, Q, Bill, disc);
}
if(Bill>=10000&&Bill<15000) {
	double disc=10;
	s.SBill(p, Q, Bill, disc);
}
if(Bill>=15000&&Bill<20000) {
	double disc=15;
	s.SBill(p, Q, Bill, disc);
}
if(Bill>=20000) {
	double disc=20;
	s.SBill(p, Q, Bill, disc);
}
	}

}
