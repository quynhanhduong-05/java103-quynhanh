import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            ch = Character.toLowerCase(ch);
            stack.push(ch);
            queue.offer(ch);
        }
        boolean flag = true;
        for (int i = 0; i < input.length(); i++) {
            if (stack.pop() != queue.poll()) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("is a palindmore");
        } else {
            System.out.println("not a palindmore");
        }
    }
}