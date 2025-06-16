package org.example.factory_pattern.factory;


public class ShapeFactory {
    public Shape getShape(String input) {
        switch (input) {
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            default:
                return null;
        }
    }
}
