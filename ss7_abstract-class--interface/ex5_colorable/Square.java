package com.codegym;

public class Square extends Shape implements Colorable{
    private double side;

    public Square(){}

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }

    public double getPerimeter() {
        return 4*side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
