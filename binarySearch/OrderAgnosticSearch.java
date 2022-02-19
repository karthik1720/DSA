/*Sort the array
 * Find the middle of the array
 * if num > middle = search in right side
 * else search in left side
 * to find middle of the array = startIndex + endIndex / 2
 * to find the number of occurrences : 
 *  lets consider there is an array of N elements
 *  its like we will divide the arrays into half and half till we get the final answer
 *  
 *  ---------------------------------------------------------------------------------------------------------
 *  Since we dont know the order of array ( Ascending or Descending),
 *  we can use if condition to check if the start is greater or lesser than the end element.
 *  and then we can implement the binarySearch accordingly.
 *  ---------------------------------------------------------------------------------------------------------
 *  
 *  1st occurrence   = N / 2^0
 *  2nd occurrence  = N/2^1
 *  3rd occurrence = N / 2^3
 * (Final) Kth occurrence = N / 2^K
 *  At final occurrence we will be having only 1 element
 *  1 = N / 2^K
 *  2^K = N
 *  lets take log on both sides
 *  
 *  logN = K Log 2
 *  K = Log N / Log 2
 *  K  = Log N base 2
 *  this will give the number of occurrence it takes to find the answer.
 *  ===================================================================================================
 */

package binarySearch;

public class OrderAgnosticSearch {
	public static void main(String[] args) {
		int[] arr = { 2,4,5,6,7,8,12,34,64,73};
		int[] arr2 = {123, 43, 21, 9, 5, 2, 1};
		int num = 73;
		System.out.println("Index of ascending order array: " + findNumber(arr, num));
		System.out.println("Index of descending order array : " + findNumber(arr2, num));
	}

	static int findNumber(int[] arr, int num){

		if(arr[0]<arr.length)
		{
			int start = 0, end = arr.length-1, middle = 0;
			while(start <= end){
				middle = start + (end - start)/2;   //to avoid int size issue. start + (end-start)/2   = (2(start) +end - start)/2   = (start + end)/2 
				if (arr[middle]  < num) {
					start = middle+1;
				}
				else if (arr[middle] > num) {
					end = middle-1;
				}
				else if (arr[middle] == num) {
					return middle;
				}	
			}
			System.out.println("Not Found");
			return -1;
		}
		else
		{
			int start = 0, end = arr.length-1, middle = 0;
			while(start <= end){
				middle = start + (end - start)/2;   //to avoid int size issue. start + (end-start)/2   = (2(start) +end - start)/2   = (start + end)/2 
				if (arr[middle]  > num) {
					start = middle+1;
				}
				else if (arr[middle] < num) {
					end = middle-1;
				}
				else if (arr[middle] == num) {
					return middle;
				}	
			}
		}
		System.out.println("Not Found");
		return -1;	
	}
}

