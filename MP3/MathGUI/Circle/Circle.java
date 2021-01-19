// Jordan Wang
// Circle Calculations Object
// Spec: Given the radius of a circle; calculate and display area and circumference

public class Circle
{
	private double radius;

	/** Default Constructor
	* Provide a reasonable default for the radius... like zero :)
	*/
	public Circle()
	{
		radius=0;
	}

	/** Initialization Constructor - allows the user to specify a radius when instantiated
	*	Set the Instance Variable radius to the parameter provided
	*/
	public Circle(double rad)
	{
		radius=rad;
	}

	/*	@return the area of this Circle
	*	Hint: we know the radius, now we just need to:
	*	1) declare a variable for area
	*	2) calculate the area
	*	3) return the area
	*/
	public double getArea()
	{
		double area;
		area=Math.PI*radius*radius;
		return area;
	}

	/*	@return the area of this Circle
	*	Hint: we know the radius, now we just need to:
	*	1) declare a variable for circumference
	*	2) calculate the circumference
	*	3) return the circumference
	*/
	public double getCircumference()
	{
		double circumference;
		circumference= Math.PI*2*radius;
		return circumference;
	}

	/**	@return a String representation of this Circle
	*	Include the radius, area and circumference
	*/
	public String toString()
	{
		String result="Radius: " + radius + "\n";
		result+="Area: " + String.format("%.2f", getArea()) + "\n";
		result+="Circumference: " + String.format("%.2f",getCircumference()) + "\n";
		return result;
	}
}