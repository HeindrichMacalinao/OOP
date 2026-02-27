public class MainBankAccount {
    public static void main(String[] args) {

        // Creating first object with different values
        BankAccount acc1 = new BankAccount("Maria", 5000.50);

        // Creating second object with different values
        BankAccount acc2 = new BankAccount("Juan", 12000.75);

        // Calling method for each object
        acc1.displayAccount();
        acc2.displayAccount();
    }
}