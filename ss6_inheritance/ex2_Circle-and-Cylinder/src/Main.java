public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Cylinder c = new Cylinder(1.0, "green", 2.0);
        System.out.println(c.toString());
    }
}