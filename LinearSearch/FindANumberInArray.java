package LinearSearch;
import java.util.Scanner;

public class FindANumberInArray {

	private static final int[] arr = new int[5] ;

	public static void main(String[] args) {
		getInput();
		System.out.println("Index : " + getData(3));
	}
//compares the elements with the number that want to search and returns the index of that number.
	static int getData(int number)
	{
		for( int i = 0; i < arr.length; i++)
		{
			if (arr[i] == number)
				return i;
		}
		System.out.println("Not Found");
		return -1;
	}
// Gets elements for arrays from the users.
	static void getInput()
	{
		Scanner s = new Scanner(System.in);
		for ( int i = 0; i < arr.length; i++)
		{
			arr[i]= s.nextInt();
		}
		s.close();
	}
}