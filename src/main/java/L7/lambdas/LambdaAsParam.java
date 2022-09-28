package L7.lambdas;


@FunctionalInterface
interface Condition {
    boolean checkCondition(int x);
}

public class LambdaAsParam {
    public static void main(String[] args){
        Condition condition = x -> x < 5;
        int[] numbers = {1, 3, 5, 7, 9};
        getNumsFromArr(numbers, condition);

        getNumsFromArr(numbers, x -> x > 5);
        getNumsFromArr(numbers, x -> x == 5);

    }

    private static void getNumsFromArr(int[] numbers, Condition condition) {
        for(int n: numbers) {
            if (condition.checkCondition(n)) {
                System.out.print(n + " ");
            }
        }

        System.out.println();
    }
}
