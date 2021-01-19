// Jordan Wang
// Pythagorean Theorem
// Spec: Calculate and display hypotenuse length

import java.util.Scanner;

public class PythagoreanRunner
{
	public static void main(String[] args)
	{
		double a, b;
		Scanner sc= new Scanner(System.in);
		Pythagorean p;

		System.out.println("Pythagorean Theorem Program");
		System.out.print("Enter a side length: ");
		a=sc.nextDouble();
		System.out.print("Enter a side length: ");
		b=sc.nextDouble();

		System.out.println("\n");
		p=new Pythagorean(a, b);
		System.out.print(p);
	}
}
/*
Pythagorean Theorem Program
Enter a side length: 3
Enter a side length: 4


Side: 3.0
Side: 4.0
Hypotenuse: 5.00
Press any key to continue . . .
*/
