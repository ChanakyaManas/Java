package Orders;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address Adr=new Address(1,"Hyderabad","ffsdfd");
Vendors v=new Vendors(1,"Chanakya","tritrt","Paytm","8098989");
Vendors v1=new Vendors(2,"ravi","trffdf","Paytm","8032389");
Vendors[]v2= {v,v1};
Products p=new Products(1,"Nuts",45,v2);
Products p1=new Products(1,"Choclates",56,v2);
Products[] p2= {p,p1};
Customer c=new Customer(1,"wewe",80980,Adr,p2);
System.out.println(c.getPid());	
	}

}
