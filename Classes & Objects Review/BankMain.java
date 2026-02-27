public class BankMain {
    public static void main(String[] args) {
        // Create a bank account object
        BankAccount myAccount = new BankAccount("John Doe", "ACC001", 1000.00);

        // Display initial account information
        System.out.println("=== Intial Account Information ===");
        myAccount.displayAccountInfo();

        // Peform transactions
        System.out.println("\n=== Performing Transactions ===");
        myAccount.deposit(500.00);
        myAccount.withdraw(200.00);

        // Display updated account information
        System.out.println("\n=== Updated Account Information ===");
        myAccount.displayAccountInfo();
    }
}