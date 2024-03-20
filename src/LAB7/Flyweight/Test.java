package LAB7.Flyweight;

public class Test {
    private static final String[] colors = {"Red", "Green", "Black"};
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            Shape circle = ShapeFactory.getCircle(getRandomColor());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
