package L3.geometric;

public class Quadrate implements Square, Drawable {
    private int a;

    public Quadrate(int a){
        this.a = a;
    }

    @Override
    public double square() {
        return a*a;
    }

    public void print() {
        System.out.println("Square =" +  square());
    }

    @Override
    public void draw() {
        System.out.println("Drawing box");
    }

}
