package LAB6.fabricMethod;

public class Russian extends Message{
    @Override
    public void sayHi(){
        System.out.println("Привет");
    }

    @Override
    public void sayBy() {
        System.out.println("Пока");
    }
}
