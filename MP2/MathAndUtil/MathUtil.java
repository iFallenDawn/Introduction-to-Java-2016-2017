//Jordan Wang
//MathUtil
/*
MathUtil
Provides a series of methods common to Mathematics
Some of which may or may not be included in the standard Math utility provided by Java
*/

public class MathUtil
{
	/** Calculates the factorial
	* @param number the number to get the factorial of
	* @return the value of the factorial of the number
	*/
	public static long getFactorial(int number)
	{
		long result=1;
		for(int i=number;i>0;i--)
		{
			result=result*i;
		}
		return result;
	}
	/** Calculates the power
	* @param base the base to work with
	* @param exponent the exponent to raise to
	* @return base to the exponent power
	*/
	public static long getPower(int base, int exponent)
	{
		long result=1;
		for(int i=0;i<exponent;i++)
		{
			result=result*base;
		}
		return result;
	}

	/** @ return the larger of x and y */
	public static int getMax(int x, int y)
	{
		int max;
		if(y>x)
			max=y;
		else
			max=x;
		return max;
	}

	/** @ return the smaller of x and y */
	public static int getMin(int x, int y)
	{
		int min;
		if(y<x)
			min=y;
		else
			min=x;
		return min;
	}
}