import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prime = new int[101];
        for (int i = 2; i < 101; i++) {
            prime[i] = 1;
        }
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(100); i++) {
            if (prime[i] == 1) {
                for (int j = i*i; j < 101; j+=i) {
                    prime[j] = 0;
                }
            }
        }
        for (int i = 0; i < 101; i++) {
            if (prime[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
