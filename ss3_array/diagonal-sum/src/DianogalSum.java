import java.util.Scanner;

public class DianogalSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the matrix: ");
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element " + (i+1) + " and " + (j+1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        sum *= 2;
        System.out.println("The sum is: " + sum);
    }
}
