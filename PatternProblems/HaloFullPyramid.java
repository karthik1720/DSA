package package1;

public class HaloFullPyramid {
    static void method() {
        int pyramidSize = 4;
        int count = 0;
        for (int i = 1; i <= pyramidSize; i++) {
            for (int j = 1; j <= (pyramidSize * 2) - 1; j++) {
                if (j == pyramidSize - count || j == pyramidSize + count || i == pyramidSize) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println("");
            count++;
        }
    }
}
