// Jordan Wang
// Change Converter
// Spec: Converts cents into dollars, nickels, pennies, quarters, and dimes.

public class Change
{
	//Variables
	private int totalCents;

	public Change()
	{
		totalCents=0;
	}

	public Change(int change)
	{
		totalCents=change;
	}

	public int getDollars()
	{
		int dollars;
		dollars=totalCents / 100;
		return dollars;
	}

	public int getQuarters()
	{
		int quarters;
		quarters=totalCents % 100 / 25;
		return quarters;
	}

	public int getDimes()
	{
		int dimes;
		dimes=totalCents % 100 % 25 / 10;
		return dimes;
	}

	public int getNickels()
	{
		int nickels;
		nickels=totalCents % 100 %25 % 10 / 5;
		return nickels;
	}

	public int getPennies()
	{
		int pennies;
		pennies=totalCents % 100 % 25 % 10 % 5 / 1;
		return pennies;
	}

	public String toString()
	{
		String result= "Equivalent to: " + "\n";
		result+="		" + getDollars() + " Dollars" + "\n";
		result+="		" + getQuarters() + " Quarters" + "\n";
		result+="		" + getDimes() + " Dimes" + "\n";
		result+="		" + getNickels() + " Nickels" + "\n";
		result+="		" + getPennies() + " Pennies" + "\n";
		return result;
	}
}
