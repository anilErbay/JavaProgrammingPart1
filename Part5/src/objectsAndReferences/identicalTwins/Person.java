package objectsAndReferences.identicalTwins;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person somebody = (Person) compared;
        if (this.name.equals(somebody.name) && this.birthday.equals(somebody.birthday) &&
                this.height == somebody.height && this.weight == somebody.weight) {
            return true;
        }
        return false;
    }
}
