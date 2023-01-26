package lectrue4;

import java.util.HashSet;
import java.util.Set;

public class GarbageCollectionsDemo {
  public static void main(String[] args) {
    Set<String> strings = new HashSet<>();
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      strings.add(String.valueOf(i));
    }
    System.out.println(strings.size());
    // Throws java.lang.OutOfMemoryError: Java heap space
    // This is because the MAX_VALUE strings created remain in the heap
    // They are not garbage collected since "strings" hold a reference to them.
    // Ultimately, there is no space available to store more strings.
    // That causes the program to crash.
  }

  private static void nullPointers() {
    int a = 10;
    Car c = null;
    c = new Car("Red", "Fiesta");
    c = new Car("Blue", "Torino"); // Red Fiesta is eligible for garbage collection.
    // since Red Fiesta is now unreachable, it is safe to delete it to free space.
    Car d = c;
    c = null; // This does not do anything because `d` still has a reference to Blue Torino.
    d = c; // Now that Blue Torino is unreachable, it is eligible for garbage collection.
  }

  private static class Car {
    String color, name;

    public Car(String color, String name) {
      this.color = color;
      this.name = name;
    }
  }
}
