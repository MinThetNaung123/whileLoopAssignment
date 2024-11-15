package Assignment;

public class SandglassStar {
    public static void main(String[] args) {
        int rows = 5;
        int i = rows;

        while (i >= 1) {
            int spaces = rows - i;
            int k = 1;
            while (k <= spaces) {
                System.out.print(" ");
                k++;
            }

            int stars = 2 * i - 1;
            int j = 1;
            while (j <= stars) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }

        i = 2;
        while (i <= rows) {
            int spaces = rows - i;
            int k = 1;
            while (k <= spaces) {
                System.out.print(" ");
                k++;
            }

            int stars = 2 * i - 1;
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
