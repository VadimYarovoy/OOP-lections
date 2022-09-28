package L7.streams.terminal;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Count {
    public static void main(String[] args){
        System.out.println(
                IntStream.range(0, 5)
                        .filter(n -> n > 2)
                        .count()
        );
    }
}
