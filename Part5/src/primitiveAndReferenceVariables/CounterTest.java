package primitiveAndReferenceVariables;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter(5);
        counter.modifyValue(8);
        System.out.println(counter.getValue());
    }
}
