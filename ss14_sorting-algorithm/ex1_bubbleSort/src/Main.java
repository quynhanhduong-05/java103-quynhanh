public class Main {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort (int[] array) {
        boolean needNextPass = true;
        for (int i = 1; i < array.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp =  array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}