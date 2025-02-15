import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Please enter row " + (i+1) + " and column " + (j+1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("The matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        int column;
        System.out.print("Please enter the column: ");
        column = sc.nextInt();
        column--;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][column];
        }
        System.out.println("The sum of the columns is: " + sum);
    }
}
