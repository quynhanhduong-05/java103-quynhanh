import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.nextLine();

        int[] frequentChar = new int[255]; // [1]
        for (int i = 0; i < str.length(); i++) { // [2]
            int ascii = (int) str.charAt(i); // [3]
            frequentChar[ascii]++; // [4]
        }

        int max = 0; // [5]
        char character = (char) 255; // [6]
        for (int i = 0; i < frequentChar.length; i++) { // [7]
            if (frequentChar[i] > max) { // [8]
                max = frequentChar[i]; // [9]
                character = (char) i; // [10]
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times"); // [11]
    }
}
