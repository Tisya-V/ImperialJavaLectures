package lecture2.playground;

public class Demo {
    public static void main(String[] args) {
        I myI = args.length == 0 ? new A() : new B();
        myI.foo();
    }
}
