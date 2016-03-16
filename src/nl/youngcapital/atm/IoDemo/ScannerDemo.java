package nl.youngcapital.atm.IoDemo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		System.out.println("voer iets in \n");
		
		Scanner s = new Scanner(System.in);
		
		while(!s.hasNext()){
			System.out.println("voer iets in");
			
		}
		
		String input = s.next();
		
		System.out.println("dit is wat je hebt getypt: "+ input);
		
		s.close();

	}

}
