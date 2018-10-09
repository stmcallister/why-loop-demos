import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SimpleFilterDemo {
    static void main(String... args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evens =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .collect(toList());
        System.out.println(evens);
    }
}
