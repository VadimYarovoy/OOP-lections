package L7.streams.terminal;

import java.awt.desktop.AboutEvent;
import java.util.stream.Stream;

public class Match {
    public static void main(String[] args){
        boolean isAllMatch = Stream.of(Math.random())
                .limit(5)
                .allMatch(n -> n < 4);
        System.out.println(isAllMatch);

        boolean isAnyMatch = Stream.of(Math.random() + 3.5)
                .limit(5)
                .anyMatch(n -> n < 4);

        System.out.println(isAnyMatch);

        boolean isNoneMatch = Stream.of(Math.random() + 3.5)
                .limit(5)
                .noneMatch(n -> n < 4);

        System.out.println(isNoneMatch);
    }
}
