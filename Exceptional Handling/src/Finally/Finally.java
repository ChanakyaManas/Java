package Finally;

import java.io.BufferedReader;
import java.io.FileReader;

public class Finally {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader("D:\\Emp.txt");
			br=new BufferedReader(fr);
			for(String s=br.readLine();s!=null;s=br.readLine()) {
				System.out.println(s);
			}
		System.out.println(10/0);	
		}
			catch(Exception e) {
				System.out.println(e);
			}
		finally {
			System.out.println("Doors Closed");
			try {
				fr.close();
				br.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}

	}

}
