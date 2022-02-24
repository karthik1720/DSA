package package1;

public class HalfPyramidNumHalo {
    static void method() {
        int pyramidSize = 5;
        for (int i = 1; i <= pyramidSize; i++) {
            for (int j = 1; j <= i; j++) {
                if(j == 1 || i == 1 || j == i || i == pyramidSize)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
