package methods;

public class Intro {
    public static void main(String[] args) {
        greet();
        System.out.println("******");
        greet2(5);

        //
        int num = alwaysReturnsTen();
        System.out.println(num);
        double number = 4 * alwaysReturnsTen() + (alwaysReturnsTen() / 2) - 8;
        System.out.println(number);

        //

        double avgOf3 = average(7, 21, 77);
        System.out.println(avgOf3);
    }

    // your own methods here
    public static void greet() {
        System.out.println("Greetings from the method world!");
    }

    // method parameters
    public static void greet2(int numOfTimes) {
        for (int i = 1; i <= numOfTimes; i++) {
            System.out.println("Greetings! =)");
        }
    }

    // ****
    // return
    public static int alwaysReturnsTen() {
        return 10;
    }

    /*
    If a method has the form public static void nameOfMethod() it is possible to return from it — in other words, to stop its execution in that place — with the return command that is not followed by a value. For instance:
    */
    public static void division(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Can not divide by 0!");
            return;
        }

        System.out.println("" + numerator + " / " + denominator + " = " + (1.0 * numerator / denominator));
    }

    // defining variables inside the methods
    public static double average(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        double avg = sum / 3.0;
        return avg;
    }
}
