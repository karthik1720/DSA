package binarySearch;
/*Ceiling of a number:
which means if the number is not found in the array, we should return the smallest of the greatest numbers of the number.
i.e., number next to the number.

for floor of the number - greatest number of the smallest numbers of the number. one element before the number
we can replace start with last in the last return statement
 */


public class CeilingOfANumber {
    public static void main(String[] args) {

        int[] arr = {2,4,4,4,6,7,10,12,13,16,19};
        int num = 17;
        System.out.println(search(arr, num));
    }

    static int search(int[] arr, int num)
    {
        int start = 0, middle = 0, last = arr.length-1 ;

        while (start <= last) {
            middle = start + (last-start) / 2;
            if (arr[middle] > num)
                last = middle - 1;
            else if (arr[middle] < num)
                start = middle + 1;
            else
                return middle;

        }

        return arr[start];
    }
}
