import java.util.Scanner;

public class TriangleValidator {
    public static void checkTriangle (double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Triangle lengths must be positive");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Triangle is invalid");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("a: ");
            double a = input.nextDouble();
            System.out.print("b: ");
            double b = input.nextDouble();
            System.out.print("c: ");
            double c = input.nextDouble();

            checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid input");
        } finally {
            input.close();
        }
    }
}
