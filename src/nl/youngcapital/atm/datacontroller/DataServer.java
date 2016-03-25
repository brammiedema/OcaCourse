package nl.youngcapital.atm.datacontroller;

import javax.management.InvalidAttributeValueException;

import com.google.gson.Gson;

import nl.youngcapital.atm.InheritanceDemo.birdsofforage.PreditoryBird;
import nl.youngcapital.atm.IoDemo.ScannerTriangle;

public final class DataServer {
	
	public String json2String(Object obj){
		Gson g = new Gson();
		String json = g.toJson(obj);
		return json; 
		
	}
	
	public void exportJson(String exportOption){
		
		
	}
	
	public static void main(String args[]) throws InvalidAttributeValueException {
		DataServer ds = new DataServer();
		PreditoryBird pb =  new PreditoryBird(3, 1);
		
		System.out.println(ds.json2String(pb));
		ScannerTriangle st = new ScannerTriangle(1, 2, 3);
		st.getClass();
		
	}
}
