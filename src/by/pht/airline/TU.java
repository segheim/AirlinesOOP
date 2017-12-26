package by.pht.airline;

public class TU extends HeavyAircraft{
	
	
	private int d;
	
	public TU(int p, int d) {
		super(p);
		this.d = d;
	}

	@Override
	public String toString() {
		return "TU [toString()="  + super.toString() + "Distans: " + d + "]";
	}
	
	

}
