package L5;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*Box<Integer> integerBox = new Box<>();

        //Box<int> intBox; // только обертки

        integerBox.setObj(5);
        System.out.println(integerBox.getObj());

        var floatBox = new Box<Float>();
        floatBox.setObj(7.5f);
        System.out.println(floatBox.getObj());

        printSomething(integerBox);
        printSomething(floatBox);
        printSomething(10);

        System.out.println(integerBox.getClass() == floatBox.getClass());

        integerBox.addObjectToBox("Hello");

        //Box<String> stringBox;

        System.out.println(integerBox.getObj());*/

        /*Math<Integer> integerMath = new Math<>(new Integer[]{1, 2});
        Math<Short> shortMath = new Math<>(new Short[]{1, 2});

        System.out.println(integerMath.isSameAvg(shortMath));*/

        var boxSet = new TreeSet<Box<Integer>>();

        Box<Integer> integerBox = new Box<>();
        integerBox.addObjectToBox(5);

        Box<Integer> integerBox2 = new Box<>();
        integerBox2.addObjectToBox(7);

        boxSet.add(integerBox2);
        boxSet.add(integerBox);

        for (Box b: boxSet) {
            System.out.println(b.getObj());
        }




    }

    private static <T> void printSomething(T t){
        System.out.println(t.getClass());
    }
}
