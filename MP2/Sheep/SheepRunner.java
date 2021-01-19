//Jordan Wang
//Sheep Counter
//Spec: Counts sheep based off user input.

import java.util.Scanner;

public class SheepRunner
{
	public static void main(String[] args)
	{
		Sheep bah;
		Scanner sc = new Scanner(System.in);
		int howMany;

		System.out.println("Welcome to the Sheep Program! Guaranteed to make you verrrry sleeeepy...");
		System.out.print("How many sheep would you like to count? (neg to quit): ");
		howMany = sc.nextInt();
		while(howMany > 0)
		{
			bah=new Sheep();
			bah.setNumSheep(howMany);
			System.out.println(bah);
			System.out.print("How many sheep would you like to count? (neg to quit): ");
			howMany = sc.nextInt();
		}
	}
}
/*
Welcome to the Sheep Program! Guaranteed to make you verrrry sleeeepy...
How many sheep would you like to count? (neg to quit): 3
1 sheep
  _________
 /         \
/    o o    \
|   _   _    \
 \   \_/      \@@@@@@@@@@@@@@@@@@@@
  \          @@@@@@@@@@@@@@@@@@@@@@@@@
   \@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
          1111                 1111

2 sheep
  _________
 /         \
/    o o    \
|   _   _    \
 \   \_/      \@@@@@@@@@@@@@@@@@@@@
  \          @@@@@@@@@@@@@@@@@@@@@@@@@
   \@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
          1111                 1111

3 sheep
  _________
 /         \
/    o o    \
|   _   _    \
 \   \_/      \@@@@@@@@@@@@@@@@@@@@
  \          @@@@@@@@@@@@@@@@@@@@@@@@@
   \@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
          1111                 1111


How many sheep would you like to count? (neg to quit): -1
Press any key to continue . . .
*/