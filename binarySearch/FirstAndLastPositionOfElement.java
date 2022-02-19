package binarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums = {5,5,5,5,5,5,5,5};
        int target = 5;
        boolean startIndex;
        int[] arr = {-1,-1};
        arr[0] = searchRange1(nums,target,true);
        arr[1] = searchRange1(nums,target,false);
        System.out.println(Arrays.toString(arr));
    }

    static int searchRange1(int[] nums, int target, boolean startIndex) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < nums[middle]) {
                end = middle - 1;

            } else if (target > nums[middle]) {
                start = middle + 1;

            } else {
                ans = middle;
                if (startIndex)
                    end = middle - 1;
                else
                    start = middle + 1;
            }

        }
        return ans;
    }




    static int[] normalMethod(int[] nums, int target) {
        int start =-1;
        int end = -1;

        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i] == target) {
                start = i;
                break;
            }
        }
        for (int j = nums.length-1; j >= 0; j--)
        {
            if(nums[j]==target){
                end = j;
                break;
        }}

        int arr[] = {start,end};
        return arr;
    }

}
