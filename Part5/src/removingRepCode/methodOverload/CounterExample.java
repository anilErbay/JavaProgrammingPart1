package removingRepCode.methodOverload;

public class CounterExample {
    private int value;

    public CounterExample(int value) {
        this.value = value;
    }

    public void increaseValue() {
        this.increaseValue(1);
    }

    public void increaseValue(int amount) {
        this.value += amount;
    }

    public int getValue() {
        return value;
    }
}
