package com.codegym;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Circle(5);

        System.out.println("Before change:");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        for (Shape shape : shapes) {
            shape.resize(20);
        }

        System.out.println("After change:");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
