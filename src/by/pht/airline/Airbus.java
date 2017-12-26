package by.pht.airline;

public class Airbus extends HeavyAircraft{
	
	
	private int d;
	
	public Airbus(int p, int d) {
		super(p);
		this.d = d;
	}

	@Override
	public String toString() {
		return "Airbus [toString()=" + super.toString() + "]";
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	
	
			
}
