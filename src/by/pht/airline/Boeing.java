package by.pht.airline;

public class Boeing extends HeavyAircraft{
	
	
	private int d;
	
	public Boeing(int p, int d) {
		super(p);
		this.d = d;
	}

	@Override
	public String toString() {
		return "Boeing [toString()=" + super.toString() + "Distans: " + d + "]";
	}
	
	

}
