public class QuadracticEquation {
    private double a, b, c;
    double discriminant = 0;

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        discriminant = b * b - 4 * a * c;
        return discriminant;
    }

    public double getRoot1() {
        if (discriminant >= 0) {
            return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (discriminant >= 0) {
            return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        } else {
            return 0;
        }
    }
}
