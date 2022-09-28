package L7.lambdas;

@FunctionalInterface
interface FuncInterface {
    int calculate(int x, int y);

}

public class SimpleLambda {
    public static void main(String[] args) {
        FuncInterface iF = new FuncInterface() {
            @Override
            public int calculate(int x, int y) {
                return x * y;
            }
        };

        int result = iF.calculate(5, 7);

        FuncInterface lambdaF = (x, y) -> x * y;

        int result2 = lambdaF.calculate(5, 7);

        System.out.println(result + " " +  result2);

    }

    private static FuncInterface createCalc(int n) {
        return switch (n) {
            case 1 -> (x, y) -> x * y;
            case 2 -> (x, y) -> x - y;
            case 3 -> (x, y) -> x + y;
            default -> (x, y) -> 0;
        };
    }
}
