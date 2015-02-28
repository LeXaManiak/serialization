import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serializer {

	public Serializer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		

		SampleSerObj so = new SampleSerObj(10,20,123e5f);
		
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
		} catch (IOException e) {
			
			out = null;
			e.printStackTrace();
		}
		 
		        try {
					out.writeObject(so);
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
