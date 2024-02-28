package LAB4;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutorService implements ExecutorService {
    ExecutorService executor;
    MyExecutorService(int countThreads) {
        executor = Executors.newFixedThreadPool(countThreads);
    }
}
