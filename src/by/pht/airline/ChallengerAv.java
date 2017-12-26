package by.pht.airline;

public class ChallengerAv extends AverageAircraft{
	
	private int d;
	
	public ChallengerAv(int p, int d) {
		super(p);
		this.d = d;
	}

	@Override
	public String toString() {
		return "ChallengerAv [toString()=" + super.toString() + "Distans: " + d + "]";
	}
	
	

}
