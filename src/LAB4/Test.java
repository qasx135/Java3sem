package LAB4;

import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        MyExecutorService executorService = new MyExecutorService(10);
        executorService.submit(() -> {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Something in submit");
        });
        System.out.println("On start");
    }
}
