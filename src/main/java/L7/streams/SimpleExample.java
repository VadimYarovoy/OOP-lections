package L7.streams;

import java.util.Arrays;

public class SimpleExample {
    public static void main(String[] args){
        var array = new int[]{-1, -2, 0, 1, 2};

        for(int i: array) {
            if (i > 0) {
                System.out.println(i);
            }

            System.out.println();
        }

        Arrays.stream(array)
                .filter(n -> n > 0)
                .forEach(System.out::println);
    }
}
