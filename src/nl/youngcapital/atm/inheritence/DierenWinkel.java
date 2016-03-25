package nl.youngcapital.atm.inheritence;

public class DierenWinkel {
	private Dier[] dieren;
	
	public DierenWinkel(){
		dieren = new Dier[2];
		dieren[0] =  new Dier("dirk");
		dieren[1] =  new Dier("harry");
	}
	
	public Dier[] getVooraad(){
		return dieren;
	}
}
