package by.pht.airline;

public class Premspeed extends LightAircraft{
	
	
	private int d;
	
	public Premspeed(int p, int d) {
		super(p);
		this.d = d;
	}

	@Override
	public String toString() {
		return "Premspeed [toString()=" + super.toString() + "Distans: " + d + "]";
	}
	
	

}
