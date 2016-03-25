package nl.youngcapital.atm.inheritence;

public abstract class MobilePhone {
	private String brand;
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public abstract String getOs();

	public String getBrand(){
		return this.brand;
	}
		
	
}
