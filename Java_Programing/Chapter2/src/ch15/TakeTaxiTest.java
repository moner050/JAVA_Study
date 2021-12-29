package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {

		Person personE = new Person("Edward", 20000);
		Taxi taxiZ = new Taxi("잘 간다 운수");
		
		personE.takeTaxi(taxiZ, 10000);
		personE.showInfo();
		taxiZ.showTaxiInfo();
	}

}
