class BankAccount {

    String accountName;   // instance variable
    double balance;       // instance variable

    // Constructor with parameters
    BankAccount(String accountName, double balance) {
        // "this.accountName" refers to the instance variable
        // "accountName" refers to the parameter
        this.accountName = accountName;

        // Assign parameter value to instance variable
        this.balance = balance;
    }

    // Method to display account details
    void displayAccount() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------");
    }
}