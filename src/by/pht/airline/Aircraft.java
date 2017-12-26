package by.pht.airline;

public class Aircraft {
	
	private int p;
	
	public Aircraft() {
		
	}
	
	public Aircraft(int p) {
		this.p = p;
		
	}
	
	

	@Override
	public String toString() {
		return "Aircraft [getClass()=" + "Passengers: " + p + "]";
	}



	public int getP() {
		return p;
	}



	public void setP(int p) {
		this.p = p;
	}
	
	
	
	

}
