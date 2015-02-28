import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Desearizer {

	public Desearizer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 ObjectInputStream in;
		try {
			in = new ObjectInputStream (new FileInputStream("objects.dat"));
		
		} catch (FileNotFoundException e) {
			in = null;// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			in = null;// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		SampleSerObj so;
		 try {
			 so = (SampleSerObj) in.readObject();
			System.out.println(so.k+" "+so.i+" "+so.z); 
			
			
			
		} catch (ClassNotFoundException | IOException e) {
			so=null;// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 SampleSerObj so2 =new SampleSerObj (1,2,3f);
		 System.out.println(so2.k+" "+so2.i+" "+so2.z); 
		 
		 System.out.println(so.k+" "+so.i+" "+so.z); 
	}

}
