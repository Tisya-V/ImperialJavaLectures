package lecture2.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        // Converting list to stream
        List<String> myStringList = new ArrayList<>();
        Stream<String> myStringStream = myStringList.stream();

        // Converting stream to list
        Stream<String> myStringStream2 = Stream.of();
        List<String> myStringList2 = myStringStream2.toList();

        // Converting stream to set
        Set<String> myStringSet = myStringStream2.collect(Collectors.toSet());
    }
}
