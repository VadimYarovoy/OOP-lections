package L7.streams.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {
    public static void main(String[] args){
        listExample();
    }

    private static void listExample() {
        List<Integer> integers = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());

        integers.forEach(System.out::println);

        ArrayList<String> alp = Stream.of("a", "b", "c")
                .collect(Collectors.toCollection(ArrayList::new));

        alp.forEach(System.out::println);
    }

    private static void mapExample() {
    }
}
