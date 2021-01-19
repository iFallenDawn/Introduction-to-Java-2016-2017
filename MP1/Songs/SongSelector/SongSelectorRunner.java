//Jordan Wang
//Song Selector
//Spec: Prints out a song based off user input

import java.util.Scanner;

public class SongSelectorRunner
{
	public static void main(String []args)
	{
		System.out.println("Song Selector");
		Scanner sc= new Scanner(System.in);
		int choice=getChoice();
		String sound;
		while(choice!=4)
		{
			if(choice==1)
			{
				String name;
				Birthday b;
				System.out.print("Enter a name: ");
				name=sc.nextLine();
				System.out.print("\n");
				b= new Birthday(name);
				System.out.print(b + "\n");
			}
			else if(choice==2)
			{
				String animal;
				OldMacDonald o;
				System.out.print("Enter an animal: ");
				animal=sc.nextLine();
				System.out.print("Enter a sound: ");
				sound=sc.nextLine();
				System.out.print("\n");
				o= new OldMacDonald(animal, sound);
				System.out.print(o + "\n");
			}
			else if(choice==3)
			{
				String item;
				WheelsOnBus w;
				System.out.print("Enter an item: ");
				item=sc.nextLine();
				System.out.print("Enter a sound: ");
				sound=sc.nextLine();
				System.out.print("\n");
				w=new WheelsOnBus(item, sound);
				System.out.print(w + "\n");
			}
			else if (choice==4)
			{
				//Nothing here
			}
			else
			{
				System.out.println("Invalid option\n");
			}

			choice=getChoice();
		}
	}
	public static int getChoice()
	{
		Scanner sc= new Scanner(System.in);
		int choice=0;

		System.out.println("1. Happy Birthday");
		System.out.println("2. Old MacDonald");
		System.out.println("3. Wheels On The Bus");
		System.out.println("4. Quit");
		System.out.print("\nEnter Choice: ");

		choice=sc.nextInt();

		return choice;
	}
}
/*
Song Selector
1. Happy Birthday
2. Old MacDonald
3. Wheels On The Bus
4. Quit

Enter Choice: 1
Enter a name: obama

Happy Birthday to you...
Happy Birthday to you...
Happy Birthday dear obama!
Happy Birthday to you!

1. Happy Birthday
2. Old MacDonald
3. Wheels On The Bus
4. Quit

Enter Choice: 2
Enter an animal: monkey
Enter a sound: ooo

Old MacDonald had a farm,
E-I-E-I-O!
And on his farm he had a monkey,
E-I-E-I-O!
With a ooo ooo here,
And a ooo ooo there,
Here a ooo, there a ooo...
Everywhere a ooo ooo!
Old MacDonald had a farm,
E-I-E-I-O!

1. Happy Birthday
2. Old MacDonald
3. Wheels On The Bus
4. Quit

Enter Choice: 3
Enter an item: wheels
Enter a sound: round

The wheels on the bus goes round round round,
round round round,
round round round,
The wheels on the bus goes round round round,
All through the town.

1. Happy Birthday
2. Old MacDonald
3. Wheels On The Bus
4. Quit

Enter Choice: 5
Invalid option

1. Happy Birthday
2. Old MacDonald
3. Wheels On The Bus
4. Quit

Enter Choice: 4
Press any key to continue . . .
*/
