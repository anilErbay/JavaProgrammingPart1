package primitiveAndReferenceVariables;

public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public void modifyValue(int modifier) {
        this.value = this.value + modifier;
    }

    public int getValue() {
        return value;
    }
}

