package assign;

import java.util.Arrays;

/*
Pass source array and the rotation Index as K
Step 1 : Declare the targetArray as per the length of the source array
Step 2 : Iterate through the source array from 0 to length
Step 3 : Determine the rotatedIndex = (i + k) % siurceArray.length;
*/

public class RotateArray {
	public static void main(String[] args) 
	{
		int[] array = {3,8,9,7,6};
		int noOfRotations = 5;
				
		System.out.println("Input Array is : "+Arrays.toString(array));
		System.out.println("Rotated Array is : "+Arrays.toString(RotateArray.solution(array, noOfRotations)));
	}
	
	
	public static int[] solution(int[] A, int K)
	{
		int[] targetArray = new int[A.length];
		
		for(int i = 0; i<A.length; i++)
		{
			int rotatedIndex = (i+K) % A.length;
			targetArray[rotatedIndex] = A[i];
		}
		
		return targetArray;
	}

}

