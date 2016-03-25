package nl.youngcapital.atm.inheritence;

public class GalixyS7 extends MobilePhone implements USBCharger{
	public GalixyS7(){
		this.setBrand("Samsung");
	}

	@Override
	public void charge() {
		System.out.println("Charging the enemy!");
		
	}

	@Override
	public String getOs() {
		
		return "android";
	}
}
