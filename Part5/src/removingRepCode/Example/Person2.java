package removingRepCode.Example;

public class Person2 {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person2(String name) {
        this(name, 0);
        //here the code of the second constructor is run, and the age is set to 0
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }
    /*
    The first constructor - the one that receives a name as a parameter - is in fact a special case of the second constructor - the one that's given both name and age. What if the first constructor could call the second constructor?

    This is possible. A constructor can be called from another constructor using the this keyword, which refers to this object in question!

    Let's modify the first constructor so that it does not do anything by itself, but instead calls the second constructor and asks it to set the age to 0.
     */
}
