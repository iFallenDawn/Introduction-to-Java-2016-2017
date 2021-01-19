// Jordan Wang
// Grade Converter
// Spec: Converts grade into GPA

import java.util.Scanner;

public class GradeConverterRunner
{
	public static void main(String[] args)
	{
		//Variables
		int numberGrade;
		boolean weighted;
		Scanner sc=new Scanner(System.in);
		String again="y";
		GradeConverter g;

		System.out.println("Welcome to GPA Converter!");
		System.out.print("\n");
		while(again.equalsIgnoreCase("y"))
		{
			System.out.print("Numerical Grade: ");
			numberGrade=sc.nextInt();
			System.out.print("Weighted (True or False): ");
			weighted=sc.nextBoolean();
			System.out.print("\n");

			g=new GradeConverter(numberGrade, weighted);
			System.out.print(g);
			System.out.print("\n");

			System.out.print("Do you want to do it again? ");
			again=sc.next();
			System.out.print("\n");
		}
	}
}
/*
Welcome to GPA Converter!

Numerical Grade: 80
Weighted (True or False): True

Numerical Grade: 80
Letter Grade: B-
Weighted: Yes
GPA Points: 3.67
Do you want to do it again? y

Numerical Grade: 80
Weighted (True or False): False

Numerical Grade: 80
Letter Grade: B-
Weighted: No
GPA Points: 2.67
Do you want to do it again? y

Numerical Grade: 93
Weighted (True or False): True

Numerical Grade: 93
Letter Grade: A
Weighted: Yes
GPA Points: 5.0
Do you want to do it again? y

Numerical Grade: 93
Weighted (True or False): False

Numerical Grade: 93
Letter Grade: A
Weighted: No
GPA Points: 4.0
Do you want to do it again? n

Press any key to continue . . .
*/