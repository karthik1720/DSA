package package1;

public class FullPyramid {
    static void method() {
        int pyramidSize = 5;
        int count = 0;
        for (int i = 1; i <= pyramidSize; i++) {
            for (int j = 1; j <= (pyramidSize * 2) ; j++) {
                if (j >= pyramidSize - count && j <= pyramidSize + count)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
            count++;
        }
    }
}
