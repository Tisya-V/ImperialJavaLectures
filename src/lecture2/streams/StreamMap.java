package lecture2.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMap {
    List<Integer> toInteger(List<String> strings) {
        return strings.stream()
                .map(Integer::parseInt)
                .toList();
    }

    Set<String> toUpper(Set<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    List<String> emphasise(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .map(s -> "*" + s + "*")
                .collect(Collectors.toList());
    }
}
