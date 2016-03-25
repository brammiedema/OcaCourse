package nl.youngcapital.atm.inheritence;

public class Iphone extends MobilePhone{
	public Iphone(){
		this.setBrand("Apple");
	}

	@Override
	public String getOs() {
	
		return "IOS";
	}

}
