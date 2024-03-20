package LAB7.Decorator;

public class SpoileredCar extends CarDecorator{

    public SpoileredCar(Car decorCar) {
        super(decorCar);
    }

    @Override
    public void about() {
        decorCar.about();
        setSpoiler(decorCar);
    }

    private void setSpoiler(Car decorCar) {
        System.out.println("Now the car has spoiler");
    }
}
