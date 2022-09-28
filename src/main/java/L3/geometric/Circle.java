package L3.geometric;

public class Circle implements  Square, Drawable{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double square() {
        return r*r*Square.PI;
    }

    public void print() {
        System.out.println("Circle = " + square());
    }
}
