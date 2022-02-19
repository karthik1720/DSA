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
public class SearchNumber {

	public static void main(String[] args) {
		int[] arr = { 2,4,5,5,5,5,5,5,5,5,5,5,6,7,8,12,34,64,73}; //2,4,5,6,7,8,12,34,64,73         4       9
		int num = 5;
		System.out.println("Index : " + test(arr, num));
	}

	static int findNumber(int[] arr, int num){
		int start = 0, end = arr.length-1, middle = 0;
		while(start <= end){
			middle = start + (end - start)/2;   //to avoid int size issue. start + (end-start)/2   = (2(start) +end - start)/2   = (start + end)/2 

			if (arr[middle]  < num) {
				start = middle+1;          // +1 and -1 is used to break the loop after reaching the last element.
			}
			else if (arr[middle] > num) {
				end = middle-1;
			}
			else  {	
				return middle;
			}
		}
		System.out.println("Not Found");
		return -1;
	}


	static int test(int[] arr, int num){
		int start = 0;
		int end = arr.length-1;
		int middle = 0;
		boolean startIndex = false;
		while(start <= end){
			middle = start + (end - start)/2;   //to avoid int size issue. start + (end-start)/2   = (2(start) +end - start)/2   = (start + end)/2

			if (arr[middle]  < num) {
				start = middle+1;          // +1 and -1 is used to break the loop after reaching the last element.
			}
			else if (arr[middle] > num) {
				end = middle-1;
			}
			if(arr[middle] == num) {
				if(startIndex)
					end = end-1;
				else
					start = start+1;

			}
		}
		return -1;
	}
}


