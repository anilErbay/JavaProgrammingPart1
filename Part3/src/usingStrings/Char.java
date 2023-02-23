package usingStrings;

public class Char {
    public static void main(String[] args) {
        String text = "Hello World";
        char character = text.charAt(0);
        System.out.println(character);

        // *****
        // length of a string
        String word = "equisterian";
        int lengthOfWord = word.length();
        System.out.println("The length of the word " + word + " is " + lengthOfWord);
    }
}
