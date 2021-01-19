// Jordan Wang
// Cone Calculator
// Spec: Calculates volume, lateral surface area, and total surface area of a cone

import java.util.Scanner;

public class Cone
{
	//Variables
	private double radius, height;
	//Constructor
	public Cone()
	{
		radius=0;
		height=0;
	}

	//Initilization Constructor
	public Cone(double r, double h)
	{
		height=h;
		radius=r;
	}

	//Gets Volume
	public double getVolume()
	{
		double volume = (Math.PI*(Math.pow(radius,2))*height)/3;
		return volume;
	}

	//Gets slant height
	public double getSlantH()
	{
		double slantHeight = Math.sqrt((Math.pow(radius,2))+Math.pow(height,2));
		return slantHeight;
	}

	//Gets lateral surface area
	public double getLSA()
	{
		double lsa= Math.PI*radius*Math.sqrt(Math.pow(height,2) + (Math.pow(radius,2)));
		return lsa;
	}

	//Gets total surface area
	public double getSA()
	{
		double surfacearea= Math.PI*radius*(radius+Math.sqrt(Math.pow(height,2) + (Math.pow(radius,2))));
		return surfacearea;
	}

	//Converts everything to string
	public String toString()
	{
		String result="Radius: " + radius + "\n";
		result+="Height: " + height + "\n";
		result+="Slant Height: " + String.format("%.2f", getSlantH()) + "\n";
		result+="Volume: " + String.format("%.2f", getVolume()) + "\n";
		result+="Lateral Surface Area: " + String.format("%.2f", getLSA()) + "\n";
		result+="Surface Area: " + String.format("%.2f", getSA()) + "\n";
		return result;
	}
}