package package1;

public class InvertedHaloHalfPyramid {
    static void method() {
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                if (i == 1 || i == 6 || j == i || j == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
