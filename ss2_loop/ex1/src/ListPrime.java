import java.util.Scanner;

public class ListPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prime = new int[1000001];
        for (int i = 2; i < 1000001; i++) {
            prime[i] = 1;
        }
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (prime[i] == 1) {
                for (int j = i*i; j < 1000001; j+=i) {
                    prime[j] = 0;
                }
            }
        }
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        int count = 0;
        int i = 0;
        while (count != number) {
            if (prime[i] == 1) {
                count++;
                System.out.println(i);
            }
            i++;
        }
    }
}
