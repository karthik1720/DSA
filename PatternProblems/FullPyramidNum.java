package package1;

public class FullPyramidNum {
    static void method() {
        int pyramidSize = 5;
int count=pyramidSize;
        for (int i = pyramidSize; i >= 1; i--) {
            for (int j = 1; j <= pyramidSize; j++) {
               if(j>=count)
                System.out.print(i);
                else
                System.out.print(" ");
            }
            System.out.println();
            count--;
        }
        for (int i = 1; i <= pyramidSize; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
