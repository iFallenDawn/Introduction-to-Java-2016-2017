// Jordan Wang
// Time Converter
// Spec: Converts between days, hours, and mins.
import java.util.Scanner;

public class TimeConvertRunner
{
	public static void main(String []args)
	{
		//Variables
		int mins;
		TimeConvert t;
		Scanner input= new Scanner(System.in);

		System.out.println("Days-Hours-Minutes Program");
		System.out.print("Enter a number of minutes: ");
		mins=input.nextInt();
		while(mins>0)
		{
			t= new TimeConvert(mins);
			System.out.print(t);
			System.out.print("\n");
			System.out.print("Enter a number of minutes: ");
			mins=input.nextInt();
		}
	}
}
/*
Days-Hours-Minutes Program
Enter a number of minutes: 1440
Equivalent to:
                1 Day(s)
                0 Hour(s)
                0 Min(s)

Enter a number of minutes: 2500
Equivalent to:
                1 Day(s)
                17 Hour(s)
                40 Min(s)

Enter a number of minutes: 3408
Equivalent to:
                2 Day(s)
                8 Hour(s)
                48 Min(s)

Enter a number of minutes: 126467
Equivalent to:
                87 Day(s)
                19 Hour(s)
                47 Min(s)

Enter a number of minutes: -1
Press any key to continue . . .

*/