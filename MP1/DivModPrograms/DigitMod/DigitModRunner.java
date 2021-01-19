//Jordan Wang
//Digit Mod Program
//Spec: Returns hundreds, tens, and ones for digits in between 100-999.

import java.util.Scanner;

public class DigitModRunner
{
	public static void main(String []args)
	{
		int number;
		DigitMod d;
		Scanner input= new Scanner(System.in);

		System.out.println("3 Digit Mod Program");
		System.out.print("Original Number: ");
		number=input.nextInt();
		while(number>=0 && number<=999)
		{
			d= new DigitMod(number);
			System.out.print(d);
			System.out.print("\n");
			System.out.print("Original Number: ");
			number=input.nextInt();
		}
	}
}
/*
3 Digit Mod Program
Original Number: 389
        3 Hundred(s)
        8 Ten(s)
        9 One(s)

Original Number: 142
        1 Hundred(s)
        4 Ten(s)
        2 One(s)

Original Number: 33
        3 Ten(s)
        3 One(s)

Original Number: 0
        0 One(s)

Original Number: -1
Press any key to continue . . .
*/