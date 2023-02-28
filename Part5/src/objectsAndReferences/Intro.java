package objectsAndReferences;

public class Intro {
    public static void main(String[] args) {
        Person joan = new Person("Joan Ball");
        System.out.println(joan);

        Person ball = joan;
        System.out.println(ball);

        ball.growOlder();
        ball.growOlder();

        System.out.println(joan);

        joan = new Person("Joan B");
        System.out.println(joan);

        ball = null; // reference to nothing
        System.out.println(ball);
    }
}
