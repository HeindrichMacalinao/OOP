public class BankAccount {
    // Step 1: Hide the data (make it private)
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        setBalance(initialBalance); // Use setter for validation
    }

    // Step 2: Getter - Let people SEE the balance
    public double getBalance() {
        return balance;
    }

    // Step 3: Setter - Let people CHANGE the balance (with rules!)
    public void setBalance(double newBalance) {
        if (newBalance >= 0) { // Validation!
            balance = newBalance;
        } else {
            System.out.println("Error: Balance cannot be negative!");
        }
    }

    // Additional useful methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw: $" + amount);
        } else {
            System.out.println("Error: Insufficient funds!");
        }
    }
}