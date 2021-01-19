//Jordan Wang
//MathUtil
/*
MathUtil
Provides a series of methods common to Mathematics
Some of which may or may not be included in the standard Math utility provided by Java
*/

import java.util.Scanner;

public class MathUtilRunner
{
	public static void main(String[]args)
	{
		System.out.println("Math Utility Program");
		Scanner sc= new Scanner(System.in);
		int choice=getChoice();
		int x;
		int y;
		int number;
		int base;
		int exponent;
		while(choice!=5)
		{
			if(choice==1)
			{
				System.out.print("\nEnter a number to you want to find the factorial for: ");
				number=sc.nextInt();
				System.out.println(MathUtil.getFactorial(number) + "\n");
			}
			else if(choice==2)
			{
				System.out.print("\nEnter a number: ");
				base=sc.nextInt();
				System.out.print("Enter an exponent: ");
				exponent=sc.nextInt();
				System.out.println(MathUtil.getPower(base, exponent) + "\n");
			}
			else if(choice==3)
			{
				System.out.print("\nEnter a value: ");
				x=sc.nextInt();
				System.out.print("Enter another value: ");
				y=sc.nextInt();
				System.out.println(MathUtil.getMax(x, y) + "\n");
			}
			else if(choice==4)
			{
				System.out.print("\nEnter a value: ");
				x=sc.nextInt();
				System.out.print("Enter another value: ");
				y=sc.nextInt();
				System.out.println(MathUtil.getMin(x, y) + "\n");
			}
			else if(choice==5)
			{
				//Nothing to see here....
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

		System.out.println("1. Get Factorial");
		System.out.println("2. Get Power");
		System.out.println("3. Get Max");
		System.out.println("4. Get Min");
		System.out.println("5. Quit");
		System.out.print("\nEnter Choice: ");

		choice=sc.nextInt();

		return choice;
	}
}
/*
Question – What happens when you enter a number greater than 20 for a Factorial?

Can you explain why this happens?
The long data type cannot support that many digits after the 21st factorial. It is only 64 bit.
*/
/*
Math Utility Program
1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 2

Enter a number: 2
Enter an exponent: 3
8

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 2

Enter a number: 3
Enter an exponent: 4
81

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 2

Enter a number: 16
Enter an exponent: 0
1

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 2

Enter a number: 12
Enter an exponent: 8
429981696

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 1

Enter a number to you want to find the factorial for: 5
120

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 1

Enter a number to you want to find the factorial for: 0
1

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 1

Enter a number to you want to find the factorial for: 12
479001600

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 1

Enter a number to you want to find the factorial for: 20
2432902008176640000

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 3

Enter a value: 5
Enter another value: 10
10

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 3

Enter a value: 10
Enter another value: 5
10

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 3

Enter a value: 5
Enter another value: 5
5

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 4

Enter a value: 5
Enter another value: 10
5

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 4

Enter a value: 10
Enter another value: 5
5

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 4

Enter a value: 5
Enter another value: 5
5

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 6
Invalid option

1. Get Factorial
2. Get Power
3. Get Max
4. Get Min
5. Quit

Enter Choice: 5
Press any key to continue . . .
*/