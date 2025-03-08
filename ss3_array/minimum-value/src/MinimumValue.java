import java.util.Scanner;

public class MinimumValue {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enther the element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        System.out.print("Your array is: " + "\t");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Minimum value is: " + min);
    }
}
