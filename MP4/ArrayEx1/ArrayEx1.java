//Jordan Wang
//Array Program
//Spec: Does things with a user inputted array
//ArrayEx1 Solution

public class ArrayEx1
{
	/** @return the sum of all of the elements of the array */
	public static int addAll(int[] numArray)
	{
		int sum = 0;
		for(int i = 0; i < numArray.length; i++)
		{
			sum+= numArray[i];
		}
		return sum;
	}


	/** @return the sum of the numbers from start to stop index, inclusive */
	public static int addRange(int[] numArray, int start, int stop)
	{
		int sum = 0;
		if(stop < numArray.length && start>=0)
		{
			for(int i = start; i <= stop; i++)
			{
				sum+= numArray[i];
			}
		}
		return sum;
	}

	/** @ return the number of times val is present in numArray */
	public static int getCount(int[] numArray, int val)
	{
		int count = 0;
		for(int i = 0; i < numArray.length; i++)
		{
			if(numArray[i] == val)
			{
				count++;
			}
		}
		return count;
	}

	/** @return an array with every value except val
	* Our approach:
	* 1) Create a new array of the appropriate size
	* 2) Traverse the numArray and if any number in numArray is != val
	*      then add that number to the new array
	* 3) Return the new array
	* Note: you will need to keep track of two indices... one for the new array and one for the old */
	public static int[] removeVals(int[] numArray, int val)
	{
		int count = 0;
		int count2 = 0;
		for(int i = 0; i < numArray.length; i++)
		{
			if(numArray[i] == val)
			{
				count++;
			}
		}
		int []newArray = new int[numArray.length-count];
		for(int i = 0; i < numArray.length; i++)
		{
			if(numArray[i]!= val)
			{
				newArray[count2] = numArray[i];
				count2++;
			}
		}
		return newArray;
	}
}