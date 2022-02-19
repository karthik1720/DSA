package binarySearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
       char[ ] arr = {'a', 'c', 'e'};
       char target = 'e';
        System.out.println(nextGreatestLetter(arr,target));
    }
    static char nextGreatestLetter(char[] letters, char target)
    {
        int start = 0, end = letters.length-1;
        while(start<=end)
        {
       int middle = start + (end - start)/2;

            if(letters[middle]>target) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
        }
        }
        return  (letters[start % letters.length]);
    }
}

/*
same binary search method used for ceiling of a number.
Here we have to get the next char as ouput and if the char is the last of the array we should return first char.
to do so we can use
arr[start % arr.length]
here the condition breaks if start is greater than end.
which means start will have +1 value than middle and end.

if the target char is at 1st index - the loop will break when start becomes 2. (with 2 we can get the next char)

here arr.length = 3
start = 2
reminder = 2% 3 = 0 (reminder)
arr[reminder]  = a (first char)
 */