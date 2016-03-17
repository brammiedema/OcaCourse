package nl.youngcapital.atm.IoDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.InvalidAttributeValueException;
/**
 * Class used to run other demos based on commandline arguments
 * 
 * @author Student
 * 
 */
public class IoDemoRunner {
	
	public static void main(String[] args) {
		if (args.length == 1) {
			run(args);
		} else {
			System.err.println("need to supply command to run");
		}
	}

	private static void runCti(String[] args) {
		double opposingSide = 0;
		double adjecentSide = 0;
		double hypotenuseSide = 0;

		Scanner s = new Scanner(System.in);
		try {
			System.out.println("enter size (in centimeters) of the opposing side");
			opposingSide = s.nextDouble();

			System.out.println("enter size (in centimeters) of the adjecent Side side");
			adjecentSide = s.nextDouble();

			System.out.println("enter size (in centimeters) of the hypotenuse side");
			hypotenuseSide = s.nextDouble();
			
			s.close();

			ScannerTriangle CT = new ScannerTriangle(opposingSide, adjecentSide, hypotenuseSide);

			if (CT.checkTriangleInequality()) {
				System.out.println("its a valid triangle");
			} else {
				System.out.println("this triangle is not a triangle");
			}

			if (CT.checkRightTriangle()) {
				System.out.println("its a Right legged triangle");
			} else {
				System.out.println("its a Left legged triangle");

			}

		} catch (InvalidAttributeValueException e) {
			System.err.println("Invalid input, all input values need to be positive numbers and larger than 0");
			runCti(args);
		} catch (InputMismatchException iMe) {
			System.out.println("correct your input, only numerical values are permitted");
			runCti(args);

		} finally {
			s.close();
		}
	}
	

	/**
	 * Processess the value in args[0] and sends the args array to the corresponding function 
	 * 
	 * @param args
	 */
	public static void run(String[] args) {
		if (args[0].equals("CTI")) {
			runCti(args);
		}
	}
}
