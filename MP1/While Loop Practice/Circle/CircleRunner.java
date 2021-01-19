// Jordan Wang
// Circle Calculations Client
// Spec: Given the radius of a circle
// 		calculate and display area and circumference

import java.util.Scanner;

public class CircleRunner
{
	public static void main(String[] args)
	{
		double radius;
		Scanner sc=new Scanner (System.in);
		Circle c;
		String again="y";

		System.out.println("Welcome to Circle Calcs!\n");
		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("Please enter a radius: ");
			radius=sc.nextDouble();
			System.out.print("\n");
			c= new Circle(radius);
			System.out.print(c);
			System.out.println("\n");

			System.out.print("Do you want to do it again? ");
			again=sc.next();
		}
	}
}
/*
Welcome to Circle Calcs!

Please enter a radius: 3

Radius: 3.0
Area: 28.27
Circumference: 18.85


Do you want to do it again? y
Please enter a radius: 5

Radius: 5.0
Area: 78.54
Circumference: 31.42


Do you want to do it again? n
Press any key to continue . . .
*/