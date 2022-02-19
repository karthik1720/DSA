package LinearSearch;

import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		int Num;
		System.out.println("Enter the total number of elements");
		Num = s.nextInt();
		for(int i = 0; i<Num; i++)
		{
			arr[i] = s.nextInt();	
		}
		System.out.println("The min number is : " + min(arr, Num));
		System.out.println("The min number is : " + max(arr, Num));
		s.close();
	}


	static int min(int arr[], int Num)
	{
		int minNum = arr[0];
		for (int i = 1; i<Num;i++)
		{
			if(arr[i]<minNum)
			{
				minNum = arr[i];
			}
		}
		return minNum;
	}
	
	static int max(int arr[], int Num)
	{
		int maxNum = arr[0];
		for (int i = 1; i<Num;i++)
		{
			if(arr[i]>maxNum)
			{
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

}
