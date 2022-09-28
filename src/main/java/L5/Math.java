package L5;

public class Math<T extends Number> {
    T[] numbers;

    Math(T[] numbers) {
        this.numbers = numbers;
    }

    double getAverage() {
        double sum = 0;
        for (T num: numbers) {
            sum += num.doubleValue();
        }
        return sum / numbers.length;
    }

    boolean isSameAvg(Math<?> nums) {
        return getAverage() == nums.getAverage();
    }
}
