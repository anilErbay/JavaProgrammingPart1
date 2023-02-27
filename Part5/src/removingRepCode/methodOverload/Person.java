package removingRepCode.methodOverload;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method overloading

    // grow older method , grow 1 year
    public void growOlder() {
        this.age += 1;
    }

    // grow older method , takes parameters
    public void growOlder(int years) {
        this.age += years;
    }

    /*
    Also ;
    public void growOlder() {
    this.growOlder(1);
    }

    public void growOlder(int years) {
    this.age = this.age + years;
    }
    */



    public String toString() {
        return this.name + " is " + this.age + " years old.";
    }
}
