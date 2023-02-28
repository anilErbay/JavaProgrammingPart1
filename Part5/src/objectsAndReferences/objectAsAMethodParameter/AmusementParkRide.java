package objectsAndReferences.objectAsAMethodParameter;

import objectsAndReferences.Person;

public class AmusementParkRide {
    private String name;
    private int lowestHeight;

    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
    }

    public String toString() {
        return this.name + ", minimum height: " + this.lowestHeight;
    }
    /*
    Then let's write a method that can be used to check if a person is allowed to enter the ride, so if they are tall enough. The method returns true if the person given as the parameter is permitted access, and false otherwise.

    Below, it is assumed that Person has the method public int getHeight() that returns the height of the person.
     */

    public boolean allowedToRide(Person person) {
        if (person.getHeight() < this.lowestHeight) {
            return false;
        }
        return true;
    }
}
