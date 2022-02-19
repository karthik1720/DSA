package LinearSearch;

import java.util.Arrays;

public class EvenNumbers {

	public static void main(String[] args) {

		final int arr[] = {12,9,215,6342,3,2,2};
		System.out.println("Count of even numbers : " + EvenNumber(arr));
		System.out.println(Arrays.toString(arr));
		//System.out.println("Count of even number of digits : " + EvenNumberOfDigits(arr));
		System.out.println(Arrays.toString(arr));
		System.out.println("Number of digits in each elements of an array : " + Arrays.toString(NumberOfDigits(arr)));
		System.out.println(Arrays.toString(arr));
	}
	static //Finds the number of even numbers in the given array
	int EvenNumber(int[] arr)
	{
		int count = 0;
		for( int i = 0; i < arr.length; i++)
		{
			if ((arr[i]%2)==0)
				count++;
		}
		return count;
	}

//	static int EvenNumberOfDigits(int[] arr) {
//
//		//System.out.println(Arrays.toString(nums));
//		int nums[] = NumberOfDigits(arr);
//		int count=0;
//		for (int i =0 ; i < arr.length ; i++)
//		{
//
//			if( nums[i]%2 ==0)
//			{
//				count ++;
//			}
//		}
//		return count;
//	}

	static int[] NumberOfDigits(int[] arr) {

		int num[] = new int [arr.length];
		int nums[] = new int[arr.length];
		nums = arr;
		System.out.println(Arrays.toString(nums));
		for (int i =0 ; i < arr.length ; i++)
		{
			if(nums[i]>0) {
				num[i] ++;
				nums[i] = nums[i]/10;
				i--;
			}
		}
		return num ;
	}
}
