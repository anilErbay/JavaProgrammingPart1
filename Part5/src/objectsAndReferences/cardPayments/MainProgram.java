package objectsAndReferences.cardPayments;

public class MainProgram {
    public static void main(String[] args) {
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        // test other part
        System.out.println();
        // ******

        PaymentTerminal unicafe = new PaymentTerminal();
        double change = unicafe.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafe.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafe.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafe);



    }
}
