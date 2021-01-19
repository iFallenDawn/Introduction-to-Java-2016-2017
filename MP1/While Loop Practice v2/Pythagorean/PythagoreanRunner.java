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
		String again="y";

		System.out.println("Pythagorean Theorem Program");
		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("Enter a side length: ");
			a=sc.nextDouble();
			System.out.print("Enter a side length: ");
			b=sc.nextDouble();

			System.out.println("\n");
			p=new Pythagorean(a, b);
			System.out.print(p);
			System.out.println("\n");
			System.out.print("Do you want to do it again? ");
			again=sc.next();
		}
	}
}
/*
Pythagorean Theorem Program
Enter a side length: 6
Enter a side length: 8


Side: 6.0
Side: 8.0
Hypotenuse: 10.00


Do you want to do it again? y
Enter a side length: 3.4
Enter a side length: 5.9


Side: 3.4
Side: 5.9
Hypotenuse: 6.81


Do you want to do it again? y
Enter a side length: 12
Enter a side length: 13


Side: 12.0
Side: 13.0
Hypotenuse: 17.69


Do you want to do it again? n
Press any key to continue . . .
*/
