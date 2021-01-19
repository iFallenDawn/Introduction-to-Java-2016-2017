//Jordan Wang
//TriangleRunner
//Spec: Runs the Triangle program

import java.util.Scanner;

public class TriangleRunner
{
	public static void main (String[]args)
	{
		double base, height;
		Scanner sc= new Scanner(System.in);
		Triangle t;

		System.out.println("Triangle Program");
		System.out.print("Enter a base: ");
		base=sc.nextDouble();
		System.out.print("Enter a height: ");
		height=sc.nextDouble();

		System.out.println("\n");
		t=new Triangle(base, height);
		System.out.println(t);
	}
}
/*
Triangle Program
Enter a base: 3
Enter a height: 5


Height: 5.0
Base: 3.0
Area: 7.5

Press any key to continue . . .
*/