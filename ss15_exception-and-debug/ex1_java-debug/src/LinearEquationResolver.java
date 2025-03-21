import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();

        if (a != 0) {
            double solution = -b/a;
            System.out.printf("The solution is %f!", solution);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
