public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {}

    public Cylinder (double height) {
        this.height = height;
    }

    public Cylinder (double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "A cyclinder with radius " + super.getRadius() + ", color " + super.getColor() + ", area " + super.getArea() + ", height " + height + " and volume " + getVolume();
    }
}
