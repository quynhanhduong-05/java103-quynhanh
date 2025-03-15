import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] list, int key, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        if (key == list[mid]) {
            return mid;
        } else if (key < list[mid]) {
            return binarySearch(list, key, low, mid - 1);
        } else {
            return binarySearch(list, key, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list =  new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        int key = sc.nextInt();
        System.out.println(binarySearch(list, key, 0, list.length - 1));
    }
}
