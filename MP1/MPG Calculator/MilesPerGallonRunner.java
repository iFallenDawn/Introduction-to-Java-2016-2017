// Jordan Wang
// Miles Per Gallon Calculator
// Spec: Calculates mpg and cost per mile

import java.util.Scanner;

public class MilesPerGallonRunner
{
	public static void main(String[] args)
	{
		//All the variables
		double startOdometer, gallons, endOdometer, costPerGallon;
		Scanner sc=new Scanner(System.in);
		MilesPerGallon MPG;
		String again="y";

		//Gets User input
		System.out.println("Miles Per Gallon Calculator");
		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("Start Odometer: ");
			startOdometer=sc.nextDouble();
			System.out.print("End Odometer: ");
			endOdometer=sc.nextDouble();
			System.out.print("Gallons Used: ");
			gallons=sc.nextDouble();
			System.out.print("Cost Per Gallon: ");
			costPerGallon=sc.nextDouble();

			//Prints everything
			System.out.println("\n");
			MPG= new MilesPerGallon(startOdometer, endOdometer, gallons, costPerGallon);
			System.out.print(MPG);
			System.out.println("\n");
			System.out.print("Do you want to do it again? ");
			again=sc.next();
		}
	}
}
/*
Miles Per Gallon Calculator
Start Odometer: 38600.5
End Odometer: 38900.5
Gallons Used: 15
Cost Per Gallon: 3.009


Miles Traveled: 300.00
Gallons Used: 15.0
Cost Per Gallon: $3.01
Miles Per Gallon: 20.00
Cost Per Mile: $0.15


Do you want to do it again? y
Start Odometer: 38900.2
End Odometer: 39198.8
Gallons Used: 17.896
Cost Per Gallon: 3.499


Miles Traveled: 298.60
Gallons Used: 17.896
Cost Per Gallon: $3.50
Miles Per Gallon: 16.69
Cost Per Mile: $0.21


Do you want to do it again? y
Start Odometer: 55025.6
End Odometer: 55473.7
Gallons Used: 12.25
Cost Per Gallon: 3.269


Miles Traveled: 448.10
Gallons Used: 12.25
Cost Per Gallon: $3.27
Miles Per Gallon: 36.58
Cost Per Mile: $0.09


Do you want to do it again? n
Press any key to continue . . .
*/