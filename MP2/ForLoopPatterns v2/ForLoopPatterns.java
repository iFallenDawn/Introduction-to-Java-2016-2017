//Jordan Wang
//For Loop Patterns Program
//Spec: Uses for loops to create the specified patterns

public class ForLoopPatterns
{
	public static void main(String []args)
	{
		//Put all the printing stuff in here
		System.out.print("Pattern 1");
		pattern1();
		System.out.print("\n");
		System.out.print("Pattern 2");
		pattern2();
		System.out.print("\n");
		System.out.print("Pattern 3");
		pattern3();
		System.out.print("\n");
		System.out.print("Pattern 4");
		pattern4();
		System.out.print("\n");
		System.out.print("Pattern 5");
		pattern5();
		System.out.print("\n");
	}

	public static void pattern1()
	{
		for(int i=0; i<8; i++)
		{
			System.out.println();
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}

	public static void pattern2()
	{
		for(int i=7; i>0; i--)
		{
			System.out.println();
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}

	public static void pattern3()
	{
		for(int i=7; i>0; i--)
		{
			System.out.println();
			for(int j=6; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<i; k++)
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}

	public static void pattern4()
	{
		for(int i=9; i>0; i-=2)
		{
			System.out.println();
			for(int j=7; j>=i; j-=2)
			{
				System.out.print(" ");
			}
			for(int k=0; k<i; k++)
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}

	public static void pattern5()
	{
		int columns=0;
		for(int i=0; i<9;i++)
		{
			System.out.println();
			for(int j=0; j<8; j++)
			}
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
