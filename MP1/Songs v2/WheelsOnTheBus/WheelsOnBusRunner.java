// Jordan Wang
// Wheels on the Bus Object
// Spec: Given an item and the noise it makes, sing Wheels on the Bus

import java.util.Scanner;

public class WheelsOnBusRunner
{
	public static void main(String []args)
	{
		String item;
		String sound;
		String again="y";
		WheelsOnBus w;
		Scanner input= new Scanner(System.in);

		System.out.println("Wheels on the bus song");

		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("Item on the bus: ");
			item=input.next();
			System.out.print("Enter the sound a " + item + " makes: ");
			sound=input.next();
			System.out.print("\n");
			w=new WheelsOnBus(item, sound);
			System.out.print(w);
			System.out.print("\n");
			System.out.print("Do it again? <y or n>: ");
			again=input.next();
		}
	}
}
/*
Wheels on the bus song
Item on the bus: baby
Enter the sound a baby makes: wah

The baby on the bus goes wah wah wah,
wah wah wah,
wah wah wah,
The baby on the bus goes wah wah wah,
All through the town.

Do it again? <y or n>: y
Item on the bus: wipers
Enter the sound a wipers makes: swish

The wipers on the bus goes swish swish swish,
swish swish swish,
swish swish swish,
The wipers on the bus goes swish swish swish,
All through the town.

Do it again? <y or n>: y
Item on the bus: bell
Enter the sound a bell makes: ding

The bell on the bus goes ding ding ding,
ding ding ding,
ding ding ding,
The bell on the bus goes ding ding ding,
All through the town.

Do it again? <y or n>: n
Press any key to continue . . .
*/