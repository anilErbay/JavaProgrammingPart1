package objectsOnAList.stack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value1");
        s.add("Value2");
        s.add("Value3");
        System.out.println(s.values());

        s.take();
        System.out.println(s.values());
    }
}
