package package1;

public class PyramidNum {
    static void method() {
        int pyramidSize = 4;
        for (int i = 1; i <= pyramidSize; i++) {

            int noOfSpaces = pyramidSize - i;

            for (int k = 1; k <= noOfSpaces; k++) {
                System.out.print(" ");
            }
            for (int j = i ; j >= 1; j--) {

                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {

                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
