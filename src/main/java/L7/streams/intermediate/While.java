package L7.streams.intermediate;

import java.util.stream.Stream;

public class While {
    public static void main(String[] args){
        Stream.of(1, 2, 3, 4, 3, 2, 1)
                .takeWhile(n -> n < 3)
                .forEach(System.out::println);

        System.out.println("--------------");

        Stream.of(1, 2, 3, 4, 3, 2, 1)
                .dropWhile(n -> n < 3)
                .forEach(System.out::println);
    }
}
