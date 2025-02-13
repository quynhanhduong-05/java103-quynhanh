import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = 23000;
        System.out.println("Enter the currency in USD: ");
        double usd = sc.nextLong();
        double vnd = usd * 23000;
        System.out.println("Value in VND: " + vnd);
    }
}
