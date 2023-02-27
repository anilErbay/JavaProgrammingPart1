package removingRepCode.Example;

public class Person3 {
    private String name;
    private int age;

    // constructor overloading
    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person3(String name) {
        this(name,0);
    }

    public Person3(int age) {
        this("chris",age);
    }
}
