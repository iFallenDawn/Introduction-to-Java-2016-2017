//Jordan Wang
//Old MacDonald Program
//Spec: Sings Old MacDonald based off user input

import java.util.Scanner;

public class OldMacDonaldRunner
{
	public static void main(String []args)
	{
		String animal;
		String sound;
		String again="y";
		OldMacDonald o;
		Scanner input= new Scanner(System.in);

		System.out.println("Welcome to the Old MacDonald Song App!");

		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("Enter an animal: ");
			animal=input.next();
			System.out.print("Enter a sound: ");
			sound=input.next();
			System.out.print("\n");
			o=new OldMacDonald(animal, sound);
			System.out.print(o);
			System.out.print("\n");

			System.out.print("Do it again? <y or n>: ");
			again=input.next();
		}
	}
}
/*
Welcome to the Old MacDonald Song App!
Enter an animal: cow
Enter a sound: moo

Old MacDonald had a farm,
E-I-E-I-O!
And on his farm he had a cow,
E-I-E-I-O!
With a moo moo here,
And a moo moo there,
Here a moo, there a moo...
Everywhere a moo moo!
Old MacDonald had a farm,
E-I-E-I-O!

Do it again? <y or n>: y
Enter an animal: dog
Enter a sound: bark

Old MacDonald had a farm,
E-I-E-I-O!
And on his farm he had a dog,
E-I-E-I-O!
With a bark bark here,
And a bark bark there,
Here a bark, there a bark...
Everywhere a bark bark!
Old MacDonald had a farm,
E-I-E-I-O!

Do it again? <y or n>: y
Enter an animal: duck
Enter a sound: quack

Old MacDonald had a farm,
E-I-E-I-O!
And on his farm he had a duck,
E-I-E-I-O!
With a quack quack here,
And a quack quack there,
Here a quack, there a quack...
Everywhere a quack quack!
Old MacDonald had a farm,
E-I-E-I-O!

Do it again? <y or n>: n
Press any key to continue . . .
*/