package L7.streams.intermediate;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sorted {
    public static void main(String[] args){
        Stream.of(7, 9, 4, 5 ,1, 2, 3, 4, 5)
                .sorted()
                .forEach(System.out::println);


        Stream.of(new Cat(4), new Cat(2), new Cat(5), new Cat(1))
                .sorted(Comparator.comparingInt(cat -> cat.age))
                .forEach(System.out::println);


    }

    private static class Cat{
        int age;

        public Cat(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "age=" + age +
                    '}';
        }
    }
}
