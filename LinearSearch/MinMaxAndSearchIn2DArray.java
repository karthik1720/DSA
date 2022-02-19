package LinearSearch;

import java.util.Arrays;

public class MinMaxAndSearchIn2DArray {

	private static final int MIN_VALUE = 0;

	public static void main(String[] args) {

		int[][] arr = new int [][] {
			{1,2,3},
			{5,10,2},
			{9,7,2}};

			int num = 3;
			System.out.println("Array Index of given num : " + Arrays.toString(search(arr,num)));
			System.out.println("Max Value : " + Max(arr));
			System.out.println("Min Value : " + Min(arr));
	}

	static int[] search(int[][] arr, int num){
		for(int i = 0; i < arr.length ; i++) {
			for (int j = 0; j < arr.length ; j++) {
				if (arr[i][j] == num)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}

	static int Max(int[][] arr) {
		int max = MIN_VALUE;
		for (int[] ints : arr) {
			for (int j = 0; j < arr.length; j++) {
				if (ints[j] > max) {
					max = ints[j];
				}
			}
		}
		return max;
	}

	static int Min(int[][] arr) {
		int min = arr[0][0];
		for (int[] ints : arr) {
			for (int j = 0; j < arr.length; j++) {
				if (ints[j] < min) {
					min = ints[j];
				}
			}
		}
		return min;
	}
}
