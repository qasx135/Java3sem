package LAB5;

public class ThirdExample {
    private static ThirdExample instance;

    private ThirdExample(){}

    public static ThirdExample getInstance() {
        if (instance == null) {
            instance = new ThirdExample();
            return instance;
        }
        return instance;
    }
}
