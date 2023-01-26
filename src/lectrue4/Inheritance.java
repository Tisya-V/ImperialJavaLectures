package lectrue4;

import java.util.List;

class A {
  void foo() {
    System.out.println("In foo of class A");
  }
}

class B extends A {
  @Override
  void foo() {
    super.foo();
    System.out.println("In foo of class B");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    A someA = new A();
    B someB = new B();
    A someOtherB = new B();

    someA.foo();
    someB.foo();
    someOtherB.foo();
    List.of(1,3,4);
  }
}