//Jordan Wang
//Array Program
//Spec: Does things with a user inputted array
//ArrayEx1Client Solution

import java.util.Arrays;

public class ArrayEx1Client
{
	public static void main(String[] args)
	{
		int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

		System.out.println(Arrays.toString(one));
		System.out.println("The sum of spots 3-6  =  " + ArrayEx1.addRange(one,3,6));
		System.out.println("The sum of spots 2-9  =  " + ArrayEx1.addRange(one,2,9));
		System.out.println("The sum of the entire array = " + ArrayEx1.addAll(one));
		System.out.println("# of 4s  =  " + ArrayEx1.getCount(one,4));
		System.out.println("# of 7s  =  " + ArrayEx1.getCount(one,7));
		System.out.println("Before removing all 7s " + Arrays.toString(one));
		one = ArrayEx1.removeVals(one,7);
		System.out.println("After removing all 7s " + Arrays.toString(one));
		System.out.println("# of 7s  =  " + ArrayEx1.getCount(one,7));

		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3};

		System.out.println("\n\n" + Arrays.toString(two));
		System.out.println("The sum of spots 3-12  =  " + ArrayEx1.addRange(two,3,12));
		System.out.println("The sum of spots 2-9  =  " + ArrayEx1.addRange(two,2,9));
		System.out.println("The sum of the entire array = " + ArrayEx1.addAll(two));
		System.out.println("# of 0s  =  " + ArrayEx1.getCount(two,0));
		System.out.println("# of 4s  =  " + ArrayEx1.getCount(two,4));
		System.out.println("Before removing all 4s " + Arrays.toString(two));
		two = ArrayEx1.removeVals(two,4);
		System.out.println("After removing all 4s " + Arrays.toString(two));
		System.out.println("# of 4s  =  " + ArrayEx1.getCount(two,4));
	}
}

/*
[7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7]
The sum of spots 3-6  =  14
The sum of spots 2-9  =  34
The sum of the entire array = 61
# of 4s  =  1
# of 7s  =  3
Before removing all 7s [7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7]
After removing all 7s [4, 10, 0, 1, 6, 5, 3, 2, 9]
# of 7s  =  0


[4, 2, 3, 4, 6, 7, 8, 9, 0, 10, 0, 1, 7, 6, 5, 3]
The sum of spots 3-12  =  52
The sum of spots 2-9  =  47
The sum of the entire array = 75
# of 0s  =  2
# of 4s  =  2
Before removing all 4s [4, 2, 3, 4, 6, 7, 8, 9, 0, 10, 0, 1, 7, 6, 5, 3]
After removing all 4s [2, 3, 6, 7, 8, 9, 0, 10, 0, 1, 7, 6, 5, 3]
# of 4s  =  0
Press any key to continue . . .
*/