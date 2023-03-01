package objectsAndReferences.identicalTwins;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same place , they are the same
        if (this == compared) {
            return true;
        }

        // if the obj is not instance of SimpleDate,then they are not the same
        if (!(compared instanceof SimpleDate)) {
            return false;
        }
        
        //let's cast the obj to SimpleDate
        // and the objects are same if their values are the same
        SimpleDate otherDate = (SimpleDate) compared;
        if (this.day == otherDate.day && this.month == otherDate.month && this.year == otherDate.year) {
            return true;
        }
        //otherwise ,objects are not the same
        return false;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
