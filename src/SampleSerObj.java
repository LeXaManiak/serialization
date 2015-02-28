import java.io.Serializable;


public class SampleSerObj implements Serializable {

	static int k;
	int i=100;
	float z=(float) 123e10;
	
	public SampleSerObj(int k, int i, float z) {
		this.k=k;
		this.i=i;
		this.z=z;
		
	}

}
