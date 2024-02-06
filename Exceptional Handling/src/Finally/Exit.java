package Finally;

public class Exit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println(10/0);
	System.exit(0);
}

catch(Exception e) {
	
	System.out.println("Catch Block--"+e);
	
}
finally {
		
	System.out.println("Final Block");
}
	}

}
