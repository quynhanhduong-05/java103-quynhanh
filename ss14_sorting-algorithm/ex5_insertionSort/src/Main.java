public class Main {
    static int[] arr = {1, 5, 123, 54, 1212};
    public static void insertionSort(int[] arr) {
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && arr[pos - 1] > x) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }
    public static void main(String[] args) {
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}