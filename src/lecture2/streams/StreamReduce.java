package lecture2.streams;

import java.util.List;

public class StreamReduce {
    String concat(List<String> strings) {
        return strings.stream()
                .reduce("", String::concat);
    }

    int product(List<Integer> factors) {
        return factors.stream()
                .reduce(1, (x, y) -> x * y);
    }

    
}
