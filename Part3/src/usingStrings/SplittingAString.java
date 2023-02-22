package usingStrings;

public class SplittingAString {
    public static void main(String[] args) {
        /*
        You can split a string to multiple pieces with the split-method of the String class. The method takes as a parameter a string denoting the place around which the string should be split. The split method returns an array of the resulting sub-parts. In the example below, the string has been split around a space.
         */

        String text = "first second third fourth fifth";
        String[] pieces = text.split("");

        System.out.println("");

        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }
    }
}
