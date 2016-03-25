package nl.youngcapital.atm.IoDemo;

import javax.management.InvalidAttributeValueException;
import java.lang.Math;

//The triangle inequality theorem states that the sum of the lengths of any two
//sides of a triangle is greater than the length of the third side. Write a program
//that gets three numbers from the user and determines whether they could
//represent the sides of a triangle.
/**
 * 
 * @author A.T Miedema
 *
 */
public class ScannerTriangle {

	private double opposingSide;
	private double adjecentSide;
	private double hypotenuseSide;

	public ScannerTriangle(double opposingSide, double adjecentSide, double hypotenuseSide)
			throws InvalidAttributeValueException {
		Math.abs(1.12); 

		if (!checkTriangleInput(opposingSide) || !checkTriangleInput(adjecentSide)
				|| !checkTriangleInput(hypotenuseSide)) {
			throw new InvalidAttributeValueException();
		} else {
			this.opposingSide = opposingSide;
			this.adjecentSide = adjecentSide;
			this.hypotenuseSide = hypotenuseSide;
			
		}
	}

	private boolean checkTriangleInput(double number) throws NumberFormatException {
		if (number > 0) {
			return true;
		}

		return false;
	}

	public boolean checkTriangleInequality() {
		double sum = this.opposingSide + this.adjecentSide;
		int i = 0 ;
		
		
		
		if (sum >= this.hypotenuseSide)
			return true;

		return false;
		
	}

	public boolean checkRightTriangle() {
		double productAddition = 0;

		productAddition = Math.pow(opposingSide, 2) + Math.pow(adjecentSide, 2);

		if (Math.round(productAddition) == Math.round(Math.pow(hypotenuseSide, 2)))
			return true;

		return false;
	}

}
