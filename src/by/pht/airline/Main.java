package by.pht.airline;

public class Main {

	public static void main(String[] args) {
		
		Airline NeWay = new Airline(9);			
		
		Aircraft s1 = new Airspeed(3, 3000);
		Aircraft s2 = new Learspeed(5, 3500);
		Aircraft s3 = new Premspeed(2, 10000);
		
		Aircraft s4 = new ChallengerAv(30, 5000);
		Aircraft s5 = new FalconAv(40, 6000);
		Aircraft s6 = new HawkerAv(50, 7000);
		
		Aircraft s7 = new Airbus(100, 10000);
		Aircraft s8 = new Boeing(150, 11000);
		Aircraft s9 = new TU(200, 12000);
		
		NeWay.addAircraft(s1);
		NeWay.addAircraft(s2);
		NeWay.addAircraft(s3);
		NeWay.addAircraft(s4);
		NeWay.addAircraft(s5);
		NeWay.addAircraft(s6);
		NeWay.addAircraft(s7);
		NeWay.addAircraft(s8);
		NeWay.addAircraft(s9);
		
		NeWay.ListAircraft();
		
		NeWay.allPass();

	}

}
