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
		String again="y";

		System.out.println("Triangle Program");
		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("Enter a base: ");
			base=sc.nextDouble();
			System.out.print("Enter a height: ");
			height=sc.nextDouble();

			System.out.println("\n");
			t=new Triangle(base, height);
			System.out.println(t);
			System.out.print("Do you want to do it again? ");
			again=sc.next();
		}
	}
}
/*
Triangle Program
Enter a base: 3
Enter a height: 5


Height: 5.0
Base: 3.0
Area: 7.5

Do you want to do it again? n
Press any key to continue . . .
*/