package objectsAndReferences.healthStation;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void printPerson() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
    }

    public void growOlder() {
        this.age += 1;
    }

    public boolean isOfLegalAge() {
        if (this.age > 17) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double bmi() {
        double heightInMeters = this.height / 100.0;
        return this.weight / Math.pow(heightInMeters, 2);
    }

    @Override
    public String toString() {
        return "My name is " + this.name + " and I am " + this.age + " years old. My BMI is " +
                this.bmi();
    }
}