// Jordan Wang
// Car Buying Program
// Spec: Determines whether or not you can buy a car with the amount of money that is inputted by the user.

import java.util.Scanner;

public class CarBuyingRunner
{
	public static void main(String[] args)
	{
		double car;
		Scanner sc= new Scanner(System.in);
		CarBuying c;
		String again="y";
		System.out.println("Welcome to Car Buyer!");
		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("Please enter your budget: ");
			car=sc.nextDouble();
			c=new CarBuying(car);
			System.out.print(c);
			System.out.println("\n");

			System.out.print("Do you want to do it again? ");
			again=sc.next();
		}
	}
}
/*
Welcome to Car Buyer!
Please enter your budget: 1000000
Your funds: $1000000.0
You can buy a Ferrari!

Do you want to do it again? y
Please enter your budget: 10
Your funds: $10.0
You cannot afford anything!

Do you want to do it again? n
Press any key to continue . . .
*/