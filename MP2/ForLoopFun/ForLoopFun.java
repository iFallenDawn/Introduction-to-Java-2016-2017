// Jordan Wang
// ForLoopFun
// Spec: Use a for loop in each of the methods below to
// 		 complete the patterns as defined.

public class ForLoopFun
{
	public static void main(String[] args)
	{
		int result;

		System.out.println("*** For Loop Fun ***");
		System.out.println("\nPattern 1:");
		pattern1();
		System.out.println("\nPattern 2:");
		pattern2();
		System.out.println("\nPattern 3:");
		pattern3();
		System.out.println("\n\nPattern 4:");
		pattern4();
		System.out.println("\n\nPattern 5:");
		pattern5();
		System.out.print("\n\nThe sum of the integers from 1 to 1000: ");
		result = calc1();
		System.out.println(result);
		System.out.print("The sum of the integers from 300 to 500: ");
		result = calc2();
		System.out.println(result);
		System.out.print("The sum of the even integers from 1000 to 1: ");
		result = calc3();
		System.out.println(result);
		System.out.print("The sum of the odd from 1000 to 1: ");
		result = calc4();
		System.out.println(result);
		System.out.print("The sum of the multiples of 5 from 1 to 5000: ");
		result = calc5();
		System.out.println(result);
	}

	public static void pattern1()
	// post: Print the word Foo 10 times with a tab in-between.
	{
		for(int i=0; i<10; i++)
		{
			System.out.print("Foo\t");
		}
	}

	public static void pattern2()
	// post: Print the integers from 10 down to 1 inclusive each separated by a tab.
	{
		for(int i=10; i>0; i--)
		{
			System.out.print(i + "\t");
		}
	}

	public static void pattern3()
	// post: Print the integers from 20 to 40 inclusive each separated by a tab
	{
		for(int i=20; i<=40; i++)
		{
			System.out.print(i + "\t");
		}
	}

	public static void pattern4()
	// post: Use a for loop that counts from 200 down to 100 but only print out numbers
	//		 that are multiples of 7.  Separate each by a tab.
	{
		for(int i=200; i>=100; i--)
		{
			if(i%7==0)
			{
				System.out.print(i + "\t");
			}
		}
	}

	public static void pattern5()
	// post: Use a for loop that counts from 200 down to 100 but only print out numbers
	//		 that are multiples of 22.  Separate each by a tab.
	{
		for(int i=200; i>=100; i--)
		{
			if(i%22==0)
			{
				System.out.print(i + "\t");
			}
		}
	}

	public static int calc1()
	// post: Use a for loop to count the integers from 1 to 1000 inclusive and return the sum.
	{
		int sum=0;
		for(int i=1; i<=1000; i++)
		{
			sum+=i;
		}
		return sum;
	}

	public static int calc2()
	// post: Use a for loop to count the integers between 300 and 500 inclusive and return the sum.
	{
		int sum=0;
		for(int i=300; i<=500; i++)
		{
			sum+=i;
		}
		return sum;
	}

	public static int calc3()
	// post: Use a for loop to count from 1000 down to 1
	//       adding all the even numbers only and return the result.
	{
		int sum=0;
		for(int i=1000; i>=1; i--)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

	public static int calc4()
	// post: Use a for loop to count from 1000 down to 1 inclusive
	//		 adding all the odd numbers only and return the result.
	{
		int sum=0;
		for(int i=1000; i>=1; i--)
		{
			if(i%2==1)
			{
				sum+=i;
			}
		}
		return sum;
	}

	public static int calc5()
	// post: Use a for loop to count from 1 to 5000 inclusive
	// 		 adding all the multiples of 5 only and return the result.
	{
		int sum=0;
		for(int i=1; i<=5000; i++)
		{
			if(i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
}
/*
*** For Loop Fun ***

Pattern 1:
Foo     Foo     Foo     Foo     Foo     Foo     Foo     Foo     Foo     Foo

Pattern 2:
10      9       8       7       6       5       4       3       2       1

Pattern 3:
20      21      22      23      24      25      26      27      28      29
30      31      32      33      34      35      36      37      38      39
40

Pattern 4:
196     189     182     175     168     161     154     147     140     133
126     119     112     105

Pattern 5:
198     176     154     132     110

The sum of the integers from 1 to 1000: 500500
The sum of the integers from 300 to 500: 80400
The sum of the even integers from 1000 to 1: 250500
The sum of the odd from 1000 to 1: 250000
The sum of the multiples of 5 from 1 to 5000: 2502500
Press any key to continue . . .
*/

