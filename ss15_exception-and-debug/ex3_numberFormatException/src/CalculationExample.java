import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        int x = input.nextInt();
        System.out.print("y: ");
        int y = input.nextInt();
        CalculationExample c = new CalculationExample();
        c.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
