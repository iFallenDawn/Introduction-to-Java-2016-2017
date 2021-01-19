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

Please enter a radius: 1

Radius: 1.0
Area: 3.14
Circumference: 6.28


Do you want to do it again? y
Please enter a radius: 2.4

Radius: 2.4
Area: 18.10
Circumference: 15.08


Do you want to do it again? y
Please enter a radius: 33

Radius: 33.0
Area: 3421.19
Circumference: 207.35


Do you want to do it again?
*/