import java.util.Scanner;

public class BubbleSortByStep {
    public static void bubbleSortByStep(int[] arr){
        boolean needNextPass = true;
        for(int i = 1; i < arr.length && needNextPass; i++){
            needNextPass = false;
            for(int j = 0; j < arr.length - i; j++){
                if (arr[j] > arr[j+1]){
                    System.out.println("Swap " + arr[j] + " with " + arr[j + 1]);
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the " + i + "th sort: ");
            for(int j = 0; j < arr.length - i; j++){
                System.out.println(arr[j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = input.nextInt();

        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing");
        bubbleSortByStep(list);
    }
}
