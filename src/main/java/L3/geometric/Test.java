package L3.geometric;

public class Test {
    public static void main(String[] args) {
        Quadrate box = new Quadrate(4);
        Rectangle rec = new Rectangle(2, 3);
        Circle cir = new Circle(4);

        box.print();
        rec.print();
        cir.print();

        Square[] squares = {box, rec, cir};

        if (box instanceof Square) {
            System.out.println("Yes");
        }

        for (Square sq: squares) {
            ((Drawable) sq).draw();
        }
    }
}
