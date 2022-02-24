package package1;

public class Diamond {
    static void method() {
        int pyramidSize = 4;
        for (int i = 1; i <= pyramidSize * 2; i++) {
            int col = i > pyramidSize ? pyramidSize * 2 - i : i;
            int noOfSpaces = pyramidSize - col;

            for (int k = 1; k <= noOfSpaces ; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
               
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
