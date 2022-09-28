package L7.streams.intermediate;

import java.util.stream.Stream;

public class Bounds {
    public static void main(String[] args){
        Stream.of(1, 2, 3, 4, 5)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("--------------");

        Stream.of(1, 2, 3, 4, 5)
                .skip(3)
                .forEach(System.out::println);
    }
}
