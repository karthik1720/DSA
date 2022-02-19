package binarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,10,12,13,14,16,17,19,21,32,42,52,56,78,89}; //lets consider this as an infinite array
        int target = 12;
        System.out.println(lengthOfAnArray(arr,target));
    }
    static int lengthOfAnArray(int[] arr,int target)
    {
        int start = 0, end = 1, tempStart =2;
        try {
            while (arr[end] < target) {
                tempStart = end + 1;
                //  end = end + (end - start +1)*2;
                end = tempStart * 2 + 1;
                start = tempStart;
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("OutOfBound");  //will surely throw outofbound array cuz we gave non infinite array here.
        }
        return (search(arr,target,start,end));
    }
    static int search(int[] arr, int num, int start, int end)
    {
     int  middle = 0 ;
        while (start <= end) {
            middle = start + (end-start) / 2;
            if (arr[middle] > num)
                end = middle - 1;
            else if (arr[middle] < num)
                start = middle + 1;
            else
                return middle;
        }
        return -1;
    }
}
