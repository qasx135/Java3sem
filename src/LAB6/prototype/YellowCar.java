package LAB6.prototype;

public class YellowCar implements Car{
    private String color;

    public YellowCar(String color) {
        this.color = color;
    }
    @Override
    public Car clone() {
        return new RedCar(this.color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
