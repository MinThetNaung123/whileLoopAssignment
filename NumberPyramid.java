package Assignment;

public class NumberPyramid {
    public static void main(String[] arg){
        int rows = 5;
        int i = 1;
        int number = 1;

        while (i <= rows) {
            int space = rows - i;
            int j = 1;

            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print(number + " ");
                k++;
            }
            number++;
            System.out.println();
            i++;
        }
    }

}
