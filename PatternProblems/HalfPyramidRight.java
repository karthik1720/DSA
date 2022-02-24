package package1;

public class HalfPyramidRight {
    static void method() {
        int count = 6;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j >= count)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
            count--;
        }
    }
}
