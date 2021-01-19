// Jordan Wang
// Rectangle Calculator
// Spec: Calculates the area and perimeter of a rectangle with given length and width.

import java.util.Scanner;
public class RectangleRunner
{
	public static void main(String[] args)
	{
		double length, width;
		Scanner sc= new Scanner(System.in);
		Rectangle r;

		System.out.println("Welcome to Rectangle Analyzer!\n");
		System.out.print("Enter a length: ");
		length=sc.nextDouble();
		System.out.print("Enter a width: ");
		width=sc.nextDouble();

		System.out.println("\n");
		r=new Rectangle(length, width);
		System.out.print(r);
	}
}
/*
Welcome to Rectangle Analyzer!

Enter a length: 3
Enter a width: 4


Length: 3.0
Width: 4.0
Area: 12.00
Perimeter: 14.0
Press any key to continue . . .
*/