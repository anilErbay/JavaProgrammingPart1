package methods;

import static java.lang.Integer.sum;

public class ExampleCallStack {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        int first = 5;
        int second = 6;

        int sum = sum(first, second);

        System.out.println("Sum: " + sum);
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
