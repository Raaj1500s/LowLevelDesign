package org.example.factory_pattern.provider;

import org.example.factory_pattern.factory.Shape;
import org.example.factory_pattern.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        Shape rectangle = factory.getShape("Rectangle");
        circle.draw();
        rectangle.draw();
    }
}
