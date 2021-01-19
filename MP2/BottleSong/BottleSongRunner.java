//Jordan Wang
//Bottle Song
//Spec: Returns the bottle song based off user input.

import java.util.Scanner;

public class BottleSongRunner
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number;
		String beverage;
		String again="y";
		Bottles b;

		System.out.println("Bottle Song Runnner");

		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("\nWhat beverage would you like in the song? ");
			beverage=sc.nextLine();
			System.out.print("How many of it would you like in the song? ");
			number=sc.nextInt();
			sc.nextLine();
			b=new Bottles(beverage, number);
			System.out.println(b);
			System.out.print("Would you like to do it again? <y or n> ");
			again=sc.nextLine();
		}
	}
}
/*
Bottle Song Runnner

What beverage would you like in the song? Milk
How many of it would you like in the song? 4

4 bottles of Milk on the wall
4 bottles of Milk
Take one down, pass it around
3 bottles of Milk on the wall!

3 bottles of Milk on the wall
3 bottles of Milk
Take one down, pass it around
2 bottles of Milk on the wall!

2 bottles of Milk on the wall
2 bottles of Milk
Take one down, pass it around
1 bottle of Milk on the wall!

1 bottle of Milk on the wall
1 bottle of Milk
Take one down, pass it around
No more bottles of Milk on the wall!

Would you like to do it again? <y or n> y

What beverage would you like in the song? Coke
How many of it would you like in the song? 2

2 bottles of Coke on the wall
2 bottles of Coke
Take one down, pass it around
1 bottle of Coke on the wall!

1 bottle of Coke on the wall
1 bottle of Coke
Take one down, pass it around
No more bottles of Coke on the wall!

Would you like to do it again? <y or n> y

What beverage would you like in the song? Organic Pear Juice
How many of it would you like in the song? 3

3 bottles of Organic Pear Juice on the wall
3 bottles of Organic Pear Juice
Take one down, pass it around
2 bottles of Organic Pear Juice on the wall!

2 bottles of Organic Pear Juice on the wall
2 bottles of Organic Pear Juice
Take one down, pass it around
1 bottle of Organic Pear Juice on the wall!

1 bottle of Organic Pear Juice on the wall
1 bottle of Organic Pear Juice
Take one down, pass it around
No more bottles of Organic Pear Juice on the wall!

Would you like to do it again? <y or n> n
Press any key to continue . . .
*/