//Name - Jordan Wang
//Prog - Array Example 2
//Spec - Array Example 2

public class ArrayEx2
{
	/** @return true if all numbers in numArray are in increasing order
	* For Ex: [1,2,6,9,23] returns true
	*     	  [9, 11, 13, 8]  returns false
	*/
	public static boolean goingUp(int[] numArray)
	{
		int temp = numArray[0];
		boolean blah = true;
		for(int i = 1; i<numArray.length; i++)
		{
			if(numArray[i]>temp)
			{
				temp=numArray[i];
				blah = true;
			}
			else
			{
				i=numArray.length;
				blah = false;
			}
		}
		return blah;
	}

	/** @return true if all numbers in numArray are in decreasing order
	* For Ex: [31,12,6,2,1] returns true
	*		  [31, 20, 10, 15, 9] returns false
	*/
	public static boolean goingDown(int[] numArray)
	{
		int temp = numArray[0];
		boolean blah = true;
		for(int i = 1; i<numArray.length; i++)
		{
			if(numArray[i]<temp)
			{
				temp=numArray[i];
				blah = true;
			}
			else
			{
				i=numArray.length;
				blah = false;
			}
		}
		return blah;
	}

	/** @return an array that contains count number of values that are larger than parameter x
	* For Ex: [1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
	*/
	public static int[] getValuesBiggerThanX(int[] numArray, int count, int x)
	{
		int count1 = 0;
		int[] newArray = new int[count];
		for(int i = 0; i<numArray.length; i++)
		{
			if(numArray[i]>x && count1 != count)
			{
				newArray[count1]=numArray[i];
				count1++;
			}
		}
		return newArray;
	}
}