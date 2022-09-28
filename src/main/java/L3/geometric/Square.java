package L3.geometric;

public interface Square {
    double PI = 3.14;
    double square();

    default void print() {
        System.out.println("Default output");
    }

    interface SomeInt {
        int someMethod();
    }
}
