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
		String again= "y";

		System.out.println("Welcome to Rectangle Analyzer!\n");
		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("Enter a length: ");
			length=sc.nextDouble();
			System.out.print("Enter a width: ");
			width=sc.nextDouble();

			System.out.println("\n");
			r=new Rectangle(length, width);
			System.out.print(r);
			System.out.println("\n");
			System.out.print("Do you want to do it again? ");
			again=sc.next();
		}
	}
}
/*
Welcome to Rectangle Analyzer!

Enter a length: 0
Enter a width: 0


Length: 0.0
Width: 0.0
Area: 0.00
Perimeter: 0.0


Do you want to do it again? y
Enter a length: 5
Enter a width: 10


Length: 5.0
Width: 10.0
Area: 50.00
Perimeter: 30.0


Do you want to do it again? y
Enter a length: 8.2
Enter a width: 5.5


Length: 8.2
Width: 5.5
Area: 45.10
Perimeter: 27.4


Do you want to do it again? y
Enter a length: 42.1
Enter a width: 33.6


Length: 42.1
Width: 33.6
Area: 1414.56
Perimeter: 151.4


Do you want to do it again? n
Press any key to continue . . .
*/