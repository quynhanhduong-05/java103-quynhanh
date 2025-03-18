public class Main {
    static int[] arr = {1, 9, 90312, 90, 13, 34};
    public static void insertionSort (int[] arr) {
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x =  arr[i];
            pos = i;
            while (pos >= 0 && arr[pos - 1] > x) {
                arr[pos] = arr[pos - 1];
                System.out.println(x + " is shifted to the left.");
                pos--;
            }
            arr[pos] = x;
        }
    }
    public static void main(String[] args) {
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}