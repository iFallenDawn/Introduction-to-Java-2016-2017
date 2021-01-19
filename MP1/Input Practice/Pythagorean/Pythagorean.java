// Jordan Wang
// Pythagorean Theorem
// Spec: Calculate and display hypotenuse length

import java.util.Scanner;

public class Pythagorean
{
	/** Instance Variables */
	private double a, b;

	/** Default Constructor
	*	Assigns default values to the Instance Variables
	*/
	public Pythagorean()
	{
		a=0;
		b=0;
	}

	/** Initialization Constructor
	*	Assigns the parameters a1 and b1 to the Instance Variables
	*/
	public Pythagorean(double a1, double b1)
	{
		a=a1;
		b=b1;
	}

	/** Gives the client (runner) another way to assign values
	*	once an object has been created
	*/
	public void setSides(double a1, double b1)
	{
		a=a1;
		b=b1;
	}

	/**	@return the hypotenuse (side c) of the triangle\
	*	Use the Pythagorean Theorem to do this
	*	Square root in Java is found with the static method: Math.sqrt()
	*/
	public double getHypotenuse()
	{
		double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		return c;
	}

	/**	@return the state of this Pythagorean object as a String
	*	Label and return each of: Side A, Side B and the Side C (the hypotenuse)
	*/
	public String toString()
	{
		String result="Side: " + a + "\n";
		result+="Side: " + b + "\n";
		result+="Hypotenuse: " + String.format("%.2f", getHypotenuse()) + "\n";
		return result;
	}
}