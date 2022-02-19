package LinearSearch;
import java.util.Scanner;

public class FindACharInString {

	private static String str = "" ;
	private static char ch;
	public static void main(String[] args) {
		getInput();
		System.out.println("Index  of " + ch + " is : " + getData(ch));
	}
	//compares the elements with the number that want to seach and returns the index of that number.
	static int getData(char ch)
	{
		for( int i = 0; i < str.length(); i++)
		{
			char s = str.charAt(i);
			if (s ==ch)
				return i;
		}
		System.out.println("Not Found");
		return -1;
	}
	// Gets string and a char to find the index in that string.
	static void getInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string :");
		str = s.next();
		System.out.println("Enter the char to find : ");
		ch = s.next().charAt(0);
		s.close();
	}
}