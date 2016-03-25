package nl.youngcapital.strings;

import java.util.Scanner;

/*
 * Lingo

Vraag de gebruiker om een invoer van 5 letters. Whitespace aan het begin en einde zijn toegestaan, en het maakt niet uit of de invoer hoofdletters of kleine letters bevat. Bij incorrecte lengte van de invoer vraag je om de invoer te herhalen.

Je programma bevat een "geheim" 5-letterwoord. Als uitvoer geeft je dezelfde informatie terug als in het spel Lingo, en wel als volgt:

Voor een letter die niet in het geheime woord voorkomt: een '.'
Voor een letter die wel in het geheime woord voorkomt: een 'o'
Voor een letter die in het geheime woord voorkomt en op de juiste plaats staat: een 'x'.
Stel het te vinden woord is "hoera" en de invoer is "hallo". Dan is de uitvoer van je programma: "xo..o".

Author: Reindert-Jan Ekker
Created: 2016-03-22 di 12:21
 * 
 */

public class ZesLetterLingo {
	private final static char INVALIDCHARSYMBOL = '.';
	private final static char CORRECTCHARSYMBOL = 'x';
	private final static char VALIDCHARSYMBOL = 'o';

	private final static String SECRETWORD = "slaap";


	private boolean isNearestCorrectLetter(char ch, int curPos) {
		
		
		int index=SECRETWORD.indexOf(ch);
		int smallestOffset = SECRETWORD.length() * 3;
		int indexOfSmallestOffset = 123;

		while (index >= 0) {
	    	System.out.println(index);
	    	int thisOffset = Math.abs(index - curPos);
	   
	    	if(thisOffset < smallestOffset && (index != curPos)){
	    		smallestOffset = thisOffset;

		    	
	    		indexOfSmallestOffset = index;
	    	
	    	}
	    	index = SECRETWORD.indexOf(ch, index + 1);
		}
		indexOfSmallestOffset++; 

		System.out.println("smallestoffset= " + smallestOffset);

		System.out.println("ios: " + indexOfSmallestOffset);
		System.out.println("curpos: " + curPos);
		if (indexOfSmallestOffset == curPos) {
			System.out.println("smallest index offset: "+ indexOfSmallestOffset);
			
			System.out.println(curPos);
			return true;
			
		}
		return false;

	}

	private String guessWord(String userInput) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < SECRETWORD.length(); i++) {

			if (userInput.charAt(i) == SECRETWORD.toLowerCase().charAt(i)) {
				sb.append(CORRECTCHARSYMBOL);

			} else if (isNearestCorrectLetter(userInput.charAt(i), i)) {
				sb.append(VALIDCHARSYMBOL);
				
			} else if (!isNearestCorrectLetter(userInput.charAt(i), i)) {
				sb.append(INVALIDCHARSYMBOL);
				
			}

			else {
				sb.append(INVALIDCHARSYMBOL);

			}

		}
		System.out.println(sb.toString());
		return (sb.toString());
	}

	private String getUserInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("raad woord");

		String userInput = s.next().trim().toLowerCase();

		if (userInput.length() != SECRETWORD.length()) {
			System.out.println("minimaal 6 leters jong!");
			userInput = this.getUserInput();
		}

		return userInput;
	}

	public static void main(String... args) {
		ZesLetterLingo zll = new ZesLetterLingo();
		String score = new String(new char[SECRETWORD.length()]).replace('\0', 'x');

		while (!score.equals(zll.guessWord(zll.getUserInput()))) {
			System.out.println("probeer opnieuw");
		}
		System.out.println("goed zo : " + SECRETWORD);

	}

}
