package nl.youngcapital.atm.inheritence;

import java.util.ArrayList;

public class Demo {
	
	public void vogelsZaakDemo(){
		VogelSpeciaalZaak vsz =  new VogelSpeciaalZaak();
		
		for(Vogel v :vsz.getVooraad()){
			System.out.println(v);
			
		}
				
		DierenWinkel dw =  new DierenWinkel();
		for(Dier d :dw.getVooraad()){
			System.out.println(d);
		}
		
		DierenWinkel dwvsz =  new VogelSpeciaalZaak();
		
		
		
		vsz = (VogelSpeciaalZaak) dwvsz;
		
		vsz.voerVogels();
	}
	
	public void mobilePhoneDemo(){
		
		ArrayList<MobilePhone> phones = new ArrayList<>();
		
		phones.add(new Iphone());
		phones.add(new GalixyS7());
		
		for(MobilePhone phone : phones){
			if(phone instanceof USBCharger){
				USBCharger usb = (USBCharger) phone;
				usb.charge();
				((USBCharger) phone).charge();
			
			}
		}
		
	}
	
	public static void main(String args[]){
		Demo d = new Demo();
		d.vogelsZaakDemo();
		d.mobilePhoneDemo();
	}
}
