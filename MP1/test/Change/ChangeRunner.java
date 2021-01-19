// Jordan Wang
// Change Converter
// Spec: Converts cents into dollars, nickels, pennies, quarters, and dimes.
import java.util.Scanner;

public class ChangeRunner
{
	public static void main(String []args)
	{
		//Variables
		int totalCents;
		Change c;
		Scanner input= new Scanner(System.in);

		System.out.println("Change Converter Program");
		System.out.print("Enter a number of cents: ");
		totalCents=input.nextInt();
		while(totalCents>0)
		{
			c= new Change(totalCents);
			System.out.print(c);
			System.out.print("\n");
			System.out.print("Enter a number of cents: ");
			totalCents=input.nextInt();
		}
	}
}
/*
Change Converter Program
Enter a number of cents: 10000
Equivalent to:
                100 Dollars
                0 Quarters
                0 Dimes
                0 Nickels
                0 Pennies

Enter a number of cents: 99
Equivalent to:
                0 Dollars
                3 Quarters
                2 Dimes
                0 Nickels
                4 Pennies

Enter a number of cents: 41
Equivalent to:
                0 Dollars
                1 Quarters
                1 Dimes
                1 Nickels
                1 Pennies

Enter a number of cents: 33
Equivalent to:
                0 Dollars
                1 Quarters
                0 Dimes
                1 Nickels
                3 Pennies

Enter a number of cents: -1
Press any key to continue . . .
*/