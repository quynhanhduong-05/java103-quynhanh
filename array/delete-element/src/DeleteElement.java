import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the size of the array: ");
            n = sc.nextInt();
            if (n > 20) {
                System.out.println("The array is too large.");
            }
        } while (n > 20);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The array is:" + "\t");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the element to be deleted: ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int j = i;
            if (arr[i] == x) {
                while (j < n - 1) {
                    arr[j] = arr[j + 1];
                    j++;
                }
            }
        }
        arr[n-1] = 0;
        System.out.print("The new array is:" + "\t");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
