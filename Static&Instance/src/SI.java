
public class SI {
static int a=2;
int b=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SI s=new SI();
		a=5;
		s.b=3;
		System.out.println("Static Variable----"+a);
		System.out.println("Instance Variable---"+s.b);
		
		SI s1=new SI();
		System.out.println("Static Variable---"+a);
		System.out.println("Instance Variable----"+s1.b);
	}

}
