package nl.youndcapital.atm.exceptions;

import java.time.*;

public class ExceptionsDemo {
	
	static int twoExceptions(String getal){
		return Integer.valueOf(getal.trim());
	}
	
	String naamVanWeekdag(int dag) throws DatIsGeenWeekDag{
		LocalDateTime ldt = LocalDateTime.now();
		ZoneId zoneId = ZoneId.systemDefault(); // or: ZoneId.of("Europe/Oslo");
		long epoch = ldt.atZone(zoneId).toEpochSecond();
		System.out.println(epoch);;
		switch (dag) {
		case 1:
			return "maandag";
		case 2:
			return "dinsdag";
		case 3:
			return "woensdag";
		case 4:
			return "donderdag";
		case 5:
			return "vrijdag";
		case 6:
			return "zaterdag";
		case 7:
			return "zondag";
		default:
			throw new DatIsGeenWeekDag(dag + "is geen valide argument er is geen " + dag +"e dag vd week nummer");
			
			
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException{		
		// te abstract niet doen tenzij je voor logging dingen doet
		try{
			twoExceptions(null);
			twoExceptions("");
			
		}catch(Exception e){
			System.err.println("gaat fout jong");
			e.printStackTrace();
			
		}
		
		
		ExceptionsDemo exd = new ExceptionsDemo();
		
		try{
			exd.naamVanWeekdag(1);
			exd.naamVanWeekdag(9274);
		}catch(IllegalArgumentException | DatIsGeenWeekDag iae){
			System.err.println(iae.getMessage());
			Thread.sleep(1514);
			System.err.println("Sukkel");
			
		}
		
	}

}
