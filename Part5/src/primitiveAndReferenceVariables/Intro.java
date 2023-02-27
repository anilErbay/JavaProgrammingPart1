package primitiveAndReferenceVariables;

import removingRepCode.methodOverload.Person;

public class Intro {
    public static void main(String[] args) {
        /*
        Variables in Java are classified into primitive and reference variables. From the programmer's perspective, a primitive variable's information is stored as the value of that variable, whereas a reference variable holds a reference to information related to that variable. reference variables are practically always objects in Java. Let's take a look at both of these types with the help of two examples.
         */

        int value = 10;
        System.out.println(value);

        Name luke = new Name("Luke");
        System.out.println(luke);

    }

}
