package package1;

public class HalfPyramidNum {
    static void method() {
        int pyramidSize = 5;
        for (int i = 1; i <= pyramidSize; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
