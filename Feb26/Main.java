public class Main {
    public static void main(String[] args) {
        // Create account with $1000
        BankAccount myAccount = new BankAccount(1000);

        // Use getter to see balance
        System.out.println("Current Balance: $" + myAccount.getBalance());

        // Deposit money
        myAccount.deposit(500);
        System.out.println("New Balance: $" + myAccount.getBalance());

        // Try to set negative balance (will fail!)
        myAccount.setBalance(-500);

        // Withdraw money
        myAccount.withdraw(200);
        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}
