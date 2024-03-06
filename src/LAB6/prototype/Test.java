package LAB6.prototype;

public class Test {
    public static void main(String[] args) {
        Car redPrototype = new RedCar("Red");
        Car yellowPrototype = new YellowCar("Yellow");

        Car cloneRed = redPrototype.clone();
        Car cloneYellow = yellowPrototype.clone();

        System.out.println(redPrototype.getColor());
        System.out.println(yellowPrototype.getColor());
        System.out.println(cloneRed.getColor());
        System.out.println(cloneYellow.getColor());

        cloneYellow.setColor("Blue");
        cloneRed.setColor("White");

        System.out.println(cloneYellow.getColor());
        System.out.println(cloneRed.getColor());
    }
}
