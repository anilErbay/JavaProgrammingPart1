package learningOOP.rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle first = new Rectangle(40,80);
        Rectangle second = new Rectangle(10,10);

        System.out.println(first);
        System.out.println(second);

        first.narrow();
        second.widen();

        System.out.println(first);
        System.out.println(second);
    }
}
