package package1;

public class InvertedHalfPyramidNum {
    static void method() {
        int pyramidSize = 5;
        for (int i = pyramidSize; i >=0; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
