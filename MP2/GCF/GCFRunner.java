// Jordan Wang
// GCF Client
// Spec: Write a program to identify the Greatest Common Factor between at least 2 integer numbers
import java.util.Scanner;

public class GCFRunner
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		GCF g;
		String again="y";

		System.out.println("Welcome to the GCF Program!");

		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("\nEnter your first number: ");
			num1=sc.nextInt();
			System.out.print("Enter your second number: ");
			num2=sc.nextInt();
			g=new GCF();
			g.setFactors(num1, num2);
			System.out.print("\n" + g + "\n");
			System.out.print("Would you like to do it again? <y or n> ");
			again=sc.next();
		}

	}
}
/*
Welcome to the GCF Program!

Enter your first number: 24
Enter your second number: 48

First number: 24
Second number: 48
The GCF of 24 and 48 is 24

Would you like to do it again? <y or n> y

Enter your first number: 32
Enter your second number: 192

First number: 32
Second number: 192
The GCF of 32 and 192 is 32

Would you like to do it again? <y or n> y

Enter your first number: 57
Enter your second number: 38

First number: 57
Second number: 38
The GCF of 57 and 38 is 19

Would you like to do it again? <y or n> y

Enter your first number: 98
Enter your second number: 1536

First number: 98
Second number: 1536
The GCF of 98 and 1536 is 2

Would you like to do it again? <y or n> y

Enter your first number: 12
Enter your second number: 17

First number: 12
Second number: 17
The GCF of 12 and 17 is 1

Would you like to do it again? <y or n> n
Press any key to continue . . .
*/