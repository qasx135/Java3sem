package LAB2;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human(10, "DMichael", "DKazachenko", LocalDate.now(), 100));
        list.add(new Human(20, "AMichael", "AKazachenko", LocalDate.now(), 110));
        list.add(new Human(30, "BMichael", "BKazachenko", LocalDate.now(), 120));
        list.add(new Human(40, "CMichael", "CKazachenko", LocalDate.now(), 20));
        List<Human> sorted = list.stream().filter(Human -> Human.weight() > Human.age()).sorted(Comparator.comparing(Human::lastName).reversed()).toList();
        Integer sum = list.stream().mapToInt(Human::weight).sum();
        System.out.println(Arrays.toString(sorted.toArray()));
        System.out.println(sum);
    }
}
