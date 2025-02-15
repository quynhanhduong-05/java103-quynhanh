import java.util.Scanner;

public class InsertElement {
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
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The array is:" + "\t");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("The inserted element is: ");
        int x = sc.nextInt();
        System.out.print("The position is: ");
        int position = sc.nextInt();
        position--;
        for (int i = n; i > position; i--) {
            arr[i] = arr[i-1];
        }
        arr[position] = x;
        System.out.print("The new array is: " + "\t");
        for (int i = 0; i < n+1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
