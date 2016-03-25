package nl.youngcapital.atm.inheritence;

public class VogelSpeciaalZaak extends DierenWinkel{
	private Vogel[] vogels;
	
	public VogelSpeciaalZaak(){
		vogels =  new Vogel[2];
		vogels[0] = new Vogel("kak");
		vogels[1] = new Vogel("attoe");
	}
	
	public Vogel[] getVooraad() {
		return vogels;
	}
	
	public void vlieg(){
		System.out.println("ik vlieg jong");
	}
	
	public void voerVogels(){
		System.out.println("ik voer vogels jong");
		
	}
	
	
}
