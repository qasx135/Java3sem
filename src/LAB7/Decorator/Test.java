package LAB7.Decorator;

public class Test {
    public static void main(String[] args) {
        Car simpleCar = new SimpleCar();
        Car spoilerCar = new SpoileredCar(new SimpleCar());

        simpleCar.about();
        spoilerCar.about();
    }
}
