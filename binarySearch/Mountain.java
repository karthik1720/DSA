package binarySearch;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {1,10,11,12,13,15,16,15,12};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0, end = arr.length-1, middle = 0;
        while(start < end) {
            middle = start + (end - start) / 2;
            if(arr[start] > arr[start+1])
            {
                return start;
            }
            else if(arr[end] > arr[end-1]){
                return end;
            }
             if (arr[middle] > arr[middle+1]) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return middle;
    }
}
