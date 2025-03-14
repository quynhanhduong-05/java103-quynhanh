import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void toBinary (long n) {
        Stack<Integer> binary = new Stack<Integer>();
        if (n == 0) {
            for (int i = 0; i < 32; i++) {
                binary.push(0);
            }
        } else if (n > 0) {
            while (n > 0) {
                binary.push((int) n % 2);
                n /= 2;
            }
            for (int i = binary.size(); i < 32; i++) {
                binary.push(0);
            }
        } else {
            boolean remainder = false;
            if (Math.abs((int) n % 2 - 1) == 1) {
                remainder = true;
                binary.push(0);
                n/=2;
            } else {
                binary.push(1);
            }
            while (Math.abs(n) > 0) {
                if (Math.abs((int) n % 2 - 1) == 1) {
                    if (remainder) {
                        binary.push(0);
                        remainder = true;
                    } else {
                        binary.push(1);
                        remainder = false;
                    }
                } else {
                    if (remainder) {
                        binary.push(1);
                        remainder = false;
                    } else {
                        binary.push(0);
                        remainder = false;
                    }
                }
                n /= 2;
            }
            for (int i = binary.size(); i < 32; i++) {
                binary.push(1);
            }
        }
        for (int i = 0; i < 32; i++) {
            System.out.print(binary.pop());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        toBinary(number);
    }
}