package Assignment;

public class AlphabetPyramid {
    public static void main(String[] arg){
        int rows = 5;
        int i = 1;

        while (i <= rows) {
            int space = rows - i;
            int j = 1;

            while (j <= space) {
                System.out.print(" ");
                j++;
            }

            char alpha = 'A';
            int k = 1;
            while (k <= i) {
                System.out.print(alpha + " ");
                alpha++;
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
