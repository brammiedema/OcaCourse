package nl.youngcapital.atm.inheritence;

import java.util.List;
import java.util.ArrayList;

public class NetteGroet extends Groet{
	public boolean geslacht;
	
	public String get(){
		return super.get() + (geslacht ? ", dooie": ", levende");
	}
	
	public NetteGroet(boolean geslacht){
		this.geslacht = geslacht;
	}
	
	public static void main(String[] args){
		Groet ng = new NetteGroet(false);
		System.out.println(ng.get());
		ng = new Groet();
		System.out.println(ng.get());
		ng =  new NetteGroet(false);
		

	}
}
