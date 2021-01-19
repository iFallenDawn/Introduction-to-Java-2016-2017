// Jordan Wang
// Rectangle Calculator
// Spec: Calculates the area and perimeter of a rectangle with given length and width.

public class RectangleRunner
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Rectangle Analyzer!\n");

		Rectangle r = new Rectangle();
		System.out.println(r);

		r = new Rectangle(5,10);
		System.out.println(r);

		r = new Rectangle(8.2,5.5);
		System.out.println(r);

		r = new Rectangle(42.1, 33.6);
		System.out.println(r);
		System.out.println();
	}
}
/*
Welcome to Rectangle Analyzer!

Length: 0.0
Width: 0.0
Area: 0.00
Perimeter: 0.0

Length: 5.0
Width: 10.0
Area: 50.00
Perimeter: 30.0

Length: 8.2
Width: 5.5
Area: 45.10
Perimeter: 27.4

Length: 42.1
Width: 33.6
Area: 1414.56
Perimeter: 151.4


Press any key to continue . . .
*/