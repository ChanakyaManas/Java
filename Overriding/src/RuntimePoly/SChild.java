package RuntimePoly;

public class SChild extends SParent {
	
	@Override
	public void getA(float a,float b) {
		System.out.println("Float");
		float c=a+b;
		System.out.println(c);
	}
}
