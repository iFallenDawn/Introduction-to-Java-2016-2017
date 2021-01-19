//Jordan Wang
//Happy Birthday Program
//Spec: Sings happy birthday

import java.util.Scanner;

public class BirthdayRunner
{
	public static void main(String []args)
	{
		String name;
		Birthday b;
		Scanner input= new Scanner(System.in);

		System.out.println("Welcome to the Happy Birthday Song App!");
		System.out.print("Whose birthday is it? <end to quit>: ");
		name=input.nextLine();

		while(!name.equalsIgnoreCase("end"))
		{
			System.out.print("\n");
			b=new Birthday(name);
			System.out.print(b);
			System.out.print("\n");
			System.out.print("Whose birthday is it? <end to quit>: ");
			name=input.nextLine();
		}
		System.out.println("Thanks for singing along!");
	}
}

/*
Welcome to the Happy Birthday Song App!
Whose birthday is it? <end to quit>: Charles

Happy Birthday to you...
Happy Birthday to you...
Happy Birthday dear Charles!
Happy Birthday to you!

Whose birthday is it? <end to quit>: Jack

Happy Birthday to you...
Happy Birthday to you...
Happy Birthday dear Jack!
Happy Birthday to you!

Whose birthday is it? <end to quit>: Pubert

Happy Birthday to you...
Happy Birthday to you...
Happy Birthday dear Pubert!
Happy Birthday to you!

Whose birthday is it? <end to quit>: end
Thanks for singing along!
Press any key to continue . . .
*/