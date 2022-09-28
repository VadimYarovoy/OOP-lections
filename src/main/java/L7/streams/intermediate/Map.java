package L7.streams.intermediate;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args){
        Stream.of("1", "2", "5")
                .map(Integer::parseInt)
                .map(n -> n * n)
                .forEach(System.out::println);


        System.out.println("--------------");


        Stream.of(1, 2, 3)
                .flatMapToInt(n -> IntStream.range(0, n))
                .forEach(System.out::println);
    }
}
