package LAB6.abstractFabric;

public class English extends Message {
    @Override
    public void sayHi(){
        System.out.println("Hello");
    }

    @Override
    public void sayBy() {
        System.out.println("By");
    }
}
