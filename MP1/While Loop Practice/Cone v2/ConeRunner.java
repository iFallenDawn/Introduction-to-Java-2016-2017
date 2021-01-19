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
		String again="y";

		System.out.println("Right Circular Cone Program\n");
		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("Enter a radius: ");
			radius=sc.nextDouble();
			System.out.print("Enter a height: ");
			height=sc.nextDouble();

			System.out.print("\n");
			c=new Cone(radius, height);
			System.out.print(c);
			System.out.println("\n");
			System.out.print("Do you want to do it again? ");
			again=sc.next();
		}
	}
}
/*
Right Circular Cone Program

Enter a radius: 3
Enter a height: 5

Radius: 3.0
Height: 5.0
Slant Height: 5.83
Volume: 47.12
Lateral Surface Area: 54.96
Surface Area: 83.23


Do you want to do it again? y
Enter a radius: 5
Enter a height: 6

Radius: 5.0
Height: 6.0
Slant Height: 7.81
Volume: 157.08
Lateral Surface Area: 122.68
Surface Area: 201.22


Do you want to do it again? n
Press any key to continue . . .
*/




