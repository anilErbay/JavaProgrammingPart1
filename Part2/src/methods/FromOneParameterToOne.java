package methods;

public class FromOneParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(7);
    }

    public static void printFromNumberToOne(int number) {
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}

/*
package methods;

public class FromOneParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(7);
    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

 */