package lecture2.streams;

import java.util.ArrayList;
import java.util.List;

public class DoubleListElements {
    static List<Integer> doubleElements(List<Integer> elements) {
        List<Integer> result = new ArrayList<>();
        for (int i : elements) {
            result.add(2 * i);
        }
        return result;
    }

    static List<Integer> doubleElementsMap(List<Integer> elements) {
        return elements.stream()
                .map(item -> item * 2)
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> elements = List.of(1,2,3,4,5);
        System.out.println(doubleElements(elements));
        System.out.println(doubleElementsMap(elements));
    }
}
