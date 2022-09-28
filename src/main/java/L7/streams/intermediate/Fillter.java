package L7.streams.intermediate;

import java.util.stream.Stream;

public class Fillter {
    public static void main(String[] args){
        Stream.of(1, 2, 3, 4, 5)
                .filter(n -> n > 2)
                .forEach(System.out::println);
    }
}
