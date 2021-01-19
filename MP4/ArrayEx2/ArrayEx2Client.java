//ArrayEx2Client - Solution

import java.util.Arrays;

public class ArrayEx2Client
{
	public static void main(String[] args)
	{
		int[] one = {1,2,3,4,5,6,7,8,9,10};
		int[] two = {1,2,3,9,11,20,30};
		int[] three = {9,8,7,6,5,4,3,2,1-1,-2};
		int[] four = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};

		System.out.println(Arrays.toString(one));
		System.out.println("is going Up ?  " + ArrayEx2.goingUp(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Up ?  " + ArrayEx2.goingUp(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Up ?  " + ArrayEx2.goingUp(three));
		System.out.println(Arrays.toString(four));
		System.out.println("is going Up ?  " + ArrayEx2.goingUp(four));

		System.out.println("\n\n"+Arrays.toString(one));
		System.out.println("is going Down ?  " + ArrayEx2.goingDown(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Down ?  " + ArrayEx2.goingDown(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Down ?  " + ArrayEx2.goingDown(three));
		System.out.println(Arrays.toString(four));
		System.out.println("is going Down ?  " + ArrayEx2.goingDown(four));
		System.out.println("\n\n");

		System.out.println(Arrays.toString(four));
		int[] updated = ArrayEx2.getValuesBiggerThanX(four, 7, 9);
		System.out.println("first 7 values greater than 9  " + Arrays.toString(updated));
		updated = ArrayEx2.getValuesBiggerThanX(four, 5, 15);
		System.out.println("first 5 values greater than 15  " + Arrays.toString(updated));
	}
}

/*
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
is going Up ?  true
[1, 2, 3, 9, 11, 20, 30]
is going Up ?  true
[9, 8, 7, 6, 5, 4, 3, 2, 0, -2]
is going Up ?  false
[3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0]
is going Up ?  false


[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
is going Down ?  false
[1, 2, 3, 9, 11, 20, 30]
is going Down ?  false
[9, 8, 7, 6, 5, 4, 3, 2, 0, -2]
is going Down ?  true
[3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0]
is going Down ?  false



[3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0]
first 7 values greater than 9  [12, 15, 18, 21, 23, 19, 17]
first 5 values greater than 15  [18, 21, 23, 19, 17]
Press any key to continue . . .
*/