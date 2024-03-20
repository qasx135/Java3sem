package LAB7.Flyweight;

public class Circle implements Shape {

    private String color;

    public Circle(String color) {
        this.color = color;
        System.out.println("Constructor works");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle");
    }
}
