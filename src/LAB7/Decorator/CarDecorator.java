package LAB7.Decorator;

public abstract class CarDecorator implements Car{

    protected Car decorCar;

    public CarDecorator(Car decorCar) {
        this.decorCar = decorCar;
    }

    @Override
    public void about() {
        decorCar.about();
    }
}
