package yourFirstAccount;

public class YourFirstAccount {
    public static void main(String[] args) {
        Account jaxAccount = new Account("Jax's Account", 100.0);
        Account jaxSwissAccount = new Account("Jax's account in Switzerland",100_000_000.00);

        System.out.println("Initial state");
        System.out.println(jaxAccount);
        System.out.println(jaxSwissAccount);

        jaxAccount.deposit(20.0);

        System.out.println("End state");
        System.out.println(jaxAccount);
    }

}
