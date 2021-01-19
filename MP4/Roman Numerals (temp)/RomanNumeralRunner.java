//Jordan Wang
//RomanNumeral
// Spec: Console for user input that is used in the RomanNumeral object

import java.util.Scanner;

public class RomanNumeralRunner
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		RomanNumeral r = new RomanNumeral();
		boolean again = true;
		String input = "";
		System.out.print("Welcome to the Roman Numeral program!\n");
		System.out.print("Enter a roman numeral: ");
		while(again == true)
		{
			input = sc.next();
			r = new RomanNumeral(input);
			System.out.print(r);
		}
	}
}