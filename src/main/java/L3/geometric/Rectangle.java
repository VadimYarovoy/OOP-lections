package L3.geometric;

public class Rectangle implements Square, Drawable{
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a * b;

    }

    public void print() {
        System.out.println("Rectangle = " + square());
    }
}

