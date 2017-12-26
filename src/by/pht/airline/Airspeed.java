package by.pht.airline;

public class Airspeed extends LightAircraft{
	
	
	private int d;
	
	
	public Airspeed(int p, int d) {
		super(p);
		this.d = d;
	}

	@Override
	public String toString() {
		return "Airspeed [getClass()=" + super.toString() + "Distans: " + d + "]";
	}
	
	

}
