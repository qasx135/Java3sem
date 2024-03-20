package LAB7.Flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> shapes = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) shapes.get(color);
        if (circle == null) {
            circle = new Circle(color);
            shapes.put(color, circle);
        }
        return circle;
    }
}
