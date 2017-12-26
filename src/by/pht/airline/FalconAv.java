package by.pht.airline;

public class FalconAv extends AverageAircraft{
	
	private int d;
	
	public FalconAv(int p, int d) {
		super(p);
		this.d = d;
	}

	@Override
	public String toString() {
		return "FalconAv [toString()=" + super.toString() + "Distans: " + d + "]";
	}
	
	

}
