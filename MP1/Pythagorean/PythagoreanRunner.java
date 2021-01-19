// Jordan Wang
// Pythagorean Theorem
// Spec: Calculate and display hypotenuse length

import java.util.Scanner;

public class PythagoreanRunner
{
	public static void main(String[] args)
	{
		Pythagorean triple = new Pythagorean(6,8);

		System.out.println("Pythagorean Theorem Program\n");
		System.out.println(triple);
		triple.setSides(3.4,5.9);
		System.out.println(triple);
		triple.setSides(12,13);
		System.out.println(triple);
		System.out.println();
	}
}
/*
Pythagorean Theorem Program

Side: 6.0
Side: 8.0
Hypotenuse: 10.00

Side: 3.4
Side: 5.9
Hypotenuse: 6.81

Side: 12.0
Side: 13.0
Hypotenuse: 17.69


Press any key to continue . . .
*/
