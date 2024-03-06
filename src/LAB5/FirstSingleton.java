package LAB5;

public class FirstSingleton {
    private FirstSingleton firstExample;
    public synchronized FirstSingleton getFirstExample() {
        if (firstExample == null) {
            firstExample = new FirstSingleton();
            return firstExample;
        }
        return firstExample;
    }
}
