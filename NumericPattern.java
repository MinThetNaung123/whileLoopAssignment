package Assignment;

public class NumericPattern {
    public static void main(String[] args) {
        int rows = 5;
        int i = rows;

        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i--;
        }

        // Bottom half of the pattern
        i = 2;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

