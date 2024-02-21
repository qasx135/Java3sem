package LAB1;

import java.util.function.Predicate;

public class PIN implements Predicate<String> {
    @Override
    public boolean test(String s) {
        String regex = "\\d{4}|\\d{6}";
        return s.matches(regex);
    }
}
