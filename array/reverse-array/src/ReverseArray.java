import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: " + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int i = 0; i <array.length/2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
