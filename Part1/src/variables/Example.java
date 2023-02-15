package variables;

public class Example {
    public static void main(String[] args) {
        String text = "contains text";
        int wholeNumber = 123;
        double floatingPoint = 3.141592653;
        boolean trueOrFalse = true;

        System.out.println("Text variable: " + text);
        System.out.println("Integer variable: " + wholeNumber);
        System.out.println("Floating-point variable: " + floatingPoint);
        System.out.println("Boolean: " + trueOrFalse);

        int number = 9;
        System.out.println(number);
        number = 77;
        System.out.println(number);

        boolean isAuthorized = false;

        double pi = 3.14;
        double radius = 22.0;
        double surfaceArea = pi * radius * radius;
        System.out.println("Surface area: " + surfaceArea);

        String valueAsString = "42.42";
        double value = Double.valueOf(valueAsString);
        System.out.println(value);
    }
}
