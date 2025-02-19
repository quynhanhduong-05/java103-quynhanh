import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextInt();
        System.out.print("Enter b: ");
        double b = scanner.nextInt();
        System.out.print("Enter c: ");
        double c = scanner.nextInt();

        QuadracticEquation result = new QuadracticEquation(a, b, c);
        if (result.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + result.getRoot1() + " and " + result.getRoot2());
        } else if (result.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + result.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}