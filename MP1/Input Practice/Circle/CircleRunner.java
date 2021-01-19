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

		System.out.println("Welcome to Circle Calcs!\n");
		System.out.print("Please enter a radius: ");
		radius=sc.nextDouble();

		System.out.print("\n");
		c= new Circle(radius);
		System.out.print(c);
	}
}
/*
Welcome to Circle Calcs!

Please enter a radius: 1

Radius: 1.0
Area: 3.14
Circumference: 6.28
Press any key to continue . . .
*/