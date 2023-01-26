package lectrue4;

import java.util.stream.Stream;

public class StreamsDemo {

  public static void main(String[] args) {
    System.out.println(Stream.iterate(1, item -> item + 1)
            .peek(i -> System.out.println("In original stream " + i))
        .filter(i -> i % 2 == 0)
            .peek(i -> System.out.println("After mapping " + i))
        .map(i -> i * 2)
        .limit(10)
        .toList()
    );
  }
}
