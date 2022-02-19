package others;

import java.util.Arrays;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        String str = s.next();
        int num[] = new int[str.length()];
        int[] even = new int[str.length()];
        String string1 = "";
        int number = s.nextInt();
        even[0] = number;
int j = 1 ;
        for (int i = 0; i< str.length(); i++) {
            num[i] = Integer.parseInt(str.substring(i, i + 1));
            if (num[i] % 2 == 0) {
                even[j] = num[i];
                j++;

            }
        }
        j=0;
        for (int i = 0; i< str.length(); i++) {
            if (num[i] % 2 == 0)
            {
                string1 = string1 + num[i];
        }
                else {
                    string1 = string1 + even[j];
                        j++;
                    }





        }
        System.out.println(string1);
    }
}
