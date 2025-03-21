import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any index:");
        int x =  sc.nextInt();

        try {
            System.out.println("Value of element in index" + x + " is " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Out of index");
        }
    }
}