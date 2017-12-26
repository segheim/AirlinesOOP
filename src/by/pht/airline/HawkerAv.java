package by.pht.airline;

public class HawkerAv extends AverageAircraft{
	
	private int d;
	
	public HawkerAv(int p, int d) {
		super(p);
		this.d = d;
	}

	@Override
	public String toString() {
		return "HawkerAv [toString()=" + super.toString() + "Distans: " + d + "]";
	}
	
	

}
