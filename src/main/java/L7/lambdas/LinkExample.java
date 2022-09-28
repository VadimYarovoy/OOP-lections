package L7.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LinkExample {
    public static void main(String[] args) {
        List<Integer>  nums = new ArrayList<>();
        nums.add(4);
        nums.add(67);

        nums.forEach(System.out::println);
        nums.forEach(i -> System.out.println(i)); // same as ^
    }
}
