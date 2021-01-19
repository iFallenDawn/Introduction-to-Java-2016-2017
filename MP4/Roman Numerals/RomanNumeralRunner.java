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
		String again = "Yes";
		String input = "";
		System.out.print("Welcome to the Roman Numeral program!\n");
		System.out.print("Enter a roman numeral: ");
		while(again.equalsIgnoreCase("Yes"))
		{
			input = sc.next();
			r = new RomanNumeral(input);
			System.out.print(r);
		}
	}
}
/*
Welcome to the Roman Numeral program!
Enter a roman numeral: xiv
The value of XIV is 14
cmi
The value of CMI is 901
xxix
The value of XXIX is 29
xcix
The value of XCIX is 99
xlix
The value of XLIX is 49
mmdccclxiv
The value of MMDCCCLXIV is 2864
m4ivx
Invalid characters, please enter a valid numeral: mqlxi
Invalid characters, please enter a valid numeral: xviii
The value of XVIII is 18

*/