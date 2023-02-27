package primitiveAndReferenceVariables;

public class ReferenceType {
    /*
    All of the variables provided by Java (other than the eight primitive variables mentioned above) are reference type. A programmer is also free to create their own variable types by defining new classes. In practice, any object instanced from a class is a reference variable.
     */
    public static void main(String[] args) {
        Name leevi = new Name("Leevi");

        /*
        The most significant difference between primitive and reference variables is that primitives (usually numbers) are immutable. The internal state of reference variables, on the other hand, can typically be mutated. This has to do with the fact that the value of a primitive variable is stored directly in the variable, whereas the value of a reference variable is a reference to the variable's data, i.e., its internal state.
         */
    }
}
