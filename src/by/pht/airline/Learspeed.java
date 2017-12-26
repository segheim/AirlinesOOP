package by.pht.airline;

public class Learspeed extends LightAircraft{

	private int d;
	
	public Learspeed(int p, int d) {
		super(p);
		this.d = d;
	}

	@Override
	public String toString() {
		return "Learspeed [toString()=" + super.toString() + "Distans: " + d + "]";
	}
	
	

}
