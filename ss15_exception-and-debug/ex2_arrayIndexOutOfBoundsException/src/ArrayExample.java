import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Elements list:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }
}
