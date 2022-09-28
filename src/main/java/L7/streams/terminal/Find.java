package L7.streams.terminal;

import java.util.stream.IntStream;

public class Find {
    public static void main(String[] args){
        int i = IntStream.range(0, 5000)
                .parallel()
                .findAny().getAsInt();

        System.out.println(i);

        int k = IntStream.range(0, 500)
                .parallel()
                .findFirst().getAsInt();
        System.out.println(k);
    }
}
