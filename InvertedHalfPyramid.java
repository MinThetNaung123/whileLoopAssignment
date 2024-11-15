package Assignment;

public class InvertedHalfPyramid {
    public static void main(String[] arg) {
        int rows = 8;
        int i = rows;

        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}

