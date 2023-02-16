package conditionalStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Is the number within the range 5-10: ");
        int number = 7;

        if (number >= 5 && number <= 10) {
            System.out.println("It is! :)");
        } else {
            System.out.println("It is not :(");
        }

        System.out.println("***************");

        System.out.println("Is the number less than 0 or greater than 100");
        int number2 = 145;

        if (number2 < 0 || number2 > 100) {
            System.out.println("It is! :)");
        } else {
            System.out.println("It is not :(");
        }

        System.out.println("***************");

        int num = 7;
        if (!(num > 4)) {
            System.out.println("The number is not greater than 4.");
        } else {
            System.out.println("The number is greater than 4.");
        }
    }
}
