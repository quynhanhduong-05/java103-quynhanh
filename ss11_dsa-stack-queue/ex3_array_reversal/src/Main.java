import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack =  new Stack<Integer>();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Stack<String> wStack = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            wStack.push(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
            words[i] = wStack.pop();
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}