//Jordan Wang
//Triangle
//Spec: Calculate the area of a triangle

public class Triangle
{
	//Instance variables
	private double base, height;
	//Constructors
	public Triangle()
	{
		base=0;
		height=0;
	}
	public Triangle (double b, double h)
	{
		base=b;
		height=h;
	}
	//Gets Area
	public double getArea()
	{
		double area;
		area=(base*height)/2;
		return area;
	}
	//Converts everything to string
	public String toString()
	{
		String result="Height: " + height + "\n";
		result+="Base: " + base + "\n";
		result+="Area: " + getArea() + "\n";
		return result;
	}
}

