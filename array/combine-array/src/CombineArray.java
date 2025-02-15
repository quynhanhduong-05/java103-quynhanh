import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        System.out.print("Please enter the size of the first array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter the element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Your first array is: " + "\t");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Please enter the size of the second array: ");
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Please enter the element " + (i+1) + ": ");
            arr2[i] = scanner.nextInt();
        }
        System.out.print("Your second array is: " + "\t");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int sum = n + m;
        int[] arr3 = new int[sum];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr[i];
        }
        int j = 0;
        for (int i = sum - m; i < sum; i++) {
            arr3[i] = arr2[j];
            j++;
        }
        System.out.print("Your new array is: " + "\t");
        for (int i = 0; i < sum; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
