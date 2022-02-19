package arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ascendingOrder {
	public static void main(String[] args) throws Exception {
		int[] arr ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size : " );
		int size = s.nextInt();
		//Getting size for array
		try {
			if (size <= 1 )
			{
				throw new ArithmeticException(" Array size should be more than 2...given size is : " + size);
			}
			else
			{
				arr = new int[size];
			}
			//get inputs
			for (int i = 0; i<arr.length ; i++)
			{
				arr[i] = s.nextInt();
			}
			//ascending order
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println(arr.length);
		}
		catch (Exception E)
		{
			System.out.println(E.getMessage() );
		}
		finally
		{
			s.close();
		}
	}
}
