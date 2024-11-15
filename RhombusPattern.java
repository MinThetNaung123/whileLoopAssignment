package Assignment;

public class RhombusPattern {
    public static void main(String[] args) {
        int rows = 5;
        int i = 1;

        while (i <= rows) {
            int space = rows - i;
            int stars = rows;
            int k = 1;

            while (k <= space) {
                System.out.print(" ");
                k++;
            }

            int j = 1;
            while (j <= stars) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

