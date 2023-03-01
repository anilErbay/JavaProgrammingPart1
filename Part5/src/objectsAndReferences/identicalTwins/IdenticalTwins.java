package objectsAndReferences.identicalTwins;

public class IdenticalTwins {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }
        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }

        Person p1 = new Person("p1", date, 180, 75);
        Person p2 = new Person("p1", date, 180, 75);

        if (p1.equals(p2)) {
            System.out.println("YEahh that's right..!");
        }
    }
}
