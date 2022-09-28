package L7.streams.intermediate;

import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args){
        Stream.of(1, 2, 2, 2)
                .distinct()
                .forEach(System.out::println);
    }
}
