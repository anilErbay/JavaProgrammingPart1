package objectsAndReferences.objAsObjVariable;

public class PersonD {
    private String name;
    private SimpleDate birthday;
    private int weight = 0;
    private int height = 0;

    public PersonD(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    // another constructor
    public PersonD(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
