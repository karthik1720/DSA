package package1;

public class FullPyramid2 {
    static void method() {
        int pyramidSize = 6;
        int count = 0;

        for (int i = 1; i <= pyramidSize; i++) {
            for (int j = 1; j <= (pyramidSize * 2); j++) {
                if (j >= pyramidSize - count && j <= pyramidSize + count)
                    System.out.print(checkPyramid(pyramidSize, count, j));
                else
                    System.out.print(" ");
            }
            System.out.println("");
            count++;
        }
    }

    static String checkPyramid(int pyramidSize, int count, int j) {
        if (pyramidSize % 2 == 0)
            return posPyramid(count, j);
        else
            return negPyramid(count, j);
    }

    static String posPyramid(int count, int j) {
        if (((count) % 2 != 0 && j % 2 != 0) || ((count) % 2 == 0 && j % 2 == 0))
            return "*";
        else
            return " ";
    }

    static String negPyramid(int count, int j) {
        if (((count) % 2 != 0 && j % 2 != 0) || ((count) % 2 == 0 && j % 2 == 0))
            return " ";
        else
            return "*";
    }
}
