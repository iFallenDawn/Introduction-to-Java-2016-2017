//Jordan Wang
//Cone Calculator
//Spec: Calculates volume, lateral surface area, and total surface area of a cone

import java.util.Scanner;

public class ConeRunner
{
	public static void main(String[] args)
	{
		double radius, height;
		Scanner sc= new Scanner(System.in);
		Cone c;

		System.out.println("Right Circular Cone Program\n");
		System.out.print("Enter a radius: ");
		radius=sc.nextDouble();
		System.out.print("Enter a height: ");
		height=sc.nextDouble();

		System.out.print("\n");
		c=new Cone(radius, height);
		System.out.print(c);
	}
}
/*
Right Circular Cone Program

Enter a radius: 1
Enter a height: 3

Radius: 1.0
Height: 3.0
Slant Height: 3.16
Volume: 3.14
Lateral Surface Area: 9.93
Surface Area: 13.08
Press any key to continue . . .
*/




