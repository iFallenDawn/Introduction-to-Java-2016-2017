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

Enter a length: 3
Enter a width: 5


Length: 3.0
Width: 5.0
Area: 15.00
Perimeter: 16.0


Do you want to do it again? y
Enter a length: 56
Enter a width: 7


Length: 56.0
Width: 7.0
Area: 392.00
Perimeter: 126.0


Do you want to do it again? n
Press any key to continue . . .
*/