import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int n, m;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the matrix: ");
        n = input.nextInt();
        System.out.print("Enter the width of the matrix: ");
        m = input.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter " + m + " elements of the line " + i + ": ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("The maximum value is " + max);

    }
}
