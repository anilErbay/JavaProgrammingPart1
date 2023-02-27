package learningOOP.rectangle;

public class Rectangle {
    // instance variables (fields)
    private int width;
    private int height;

    // constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // methods
    public void widen() {
        this.width += 1;
    }

    public void narrow() {
        if (this.width > 0) {
            this.width += 1;
        }
    }

    public int surfaceArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "(" + this.width + ", " + this.height + ")";
    }
}
