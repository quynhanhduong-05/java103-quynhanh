public class Main {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        System.out.println(p.toString());

        MoveablePoint a = new MoveablePoint(1, 1);
        a.move();
        System.out.println(a.toString());
    }
}