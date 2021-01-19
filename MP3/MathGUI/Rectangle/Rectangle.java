// Jordan Wang
// Rectangle Calculator
// Spec: Calculates area and perimeter of rectangles

import java.util.Scanner;

public class Rectangle
{
	//Instance variables
	private double length, width;

	//Constructors
	public Rectangle()
	{
		length=0;
		width=0;
	}

	//Initilization Constructor
	public Rectangle(double l, double w)
	{
		length=l;
		width=w;
	}

	//Gets Area
	public double getArea()
	{
		double area= length*width;
		return area;
	}

	//Gets perimeter
	public double getPerimeter()
	{
		double perimeter=2*length+2*width;
		return perimeter;
	}

	//Converts everything to string.
	public String toString()
	{
		String result="Length: " + length + "\n";
		result+="Width: " + width + "\n";
		result+="Area: " + String.format("%.2f", getArea()) + "\n";
		result+="Perimeter: " + getPerimeter() + "\n";
		return result;
	}
}