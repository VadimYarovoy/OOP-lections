package L7.streams;

import java.util.stream.Stream;

public class StreamCreationExample {
    public static void main(String[] args){
        System.out.println("Empty");
        Stream.empty().forEach(System.out::println);

        System.out.println("from data");
        Stream.of(1, 2, 3).forEach(System.out::println);

        System.out.println("null check");
        Stream.ofNullable(new Object()).forEach(System.out::println);
        Stream.ofNullable(null).forEach(System.out::println);

        System.out.println("generator");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("iterate");
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("predicate");
        Stream.iterate(1, n -> n < 6, n ->  n + 1)
                .forEach(System.out::println);

        System.out.println("concate");
        Stream.concat(
                Stream.of(5),
                Stream.of("a")
        ).forEach(System.out::println);

        System.out.println("SreamBuilder");
        Stream.builder()
                .add(1)
                .add(2)
                .build()
                .forEach(System.out::println);
    }
}
