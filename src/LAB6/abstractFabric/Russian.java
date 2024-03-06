package LAB6.abstractFabric;

public class Russian extends Message {
    @Override
    public void sayHi(){
        System.out.println("Привет");
    }

    @Override
    public void sayBy() {
        System.out.println("Пока");
    }
}
