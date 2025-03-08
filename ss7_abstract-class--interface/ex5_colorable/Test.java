package com.codegym;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(2, 5);
        shapes[2] = new Square(4);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if(shape instanceof Square){
                Colorable temporary = (Colorable) shape;
                temporary.howToColor();
            }
        }
    }
}
