public class LibrarySystem {
    public static void main(String[] args) {
        // Create Book Objects
        Book book1 = new Book("978-0134685991", "Java Programming", "James Gosling", 1996, 50.00, 2);
        Book book2 = new Book("978-1312122246", "My First In Java", "Jeremias Esperanza", 2014, 12.00, 10);
        Book book3 = new Book("978-1982167288", "Lana Del Rey", "Violet Bent Backwards Over the Grass", 2020, 25.70, 0);
        Book book4 = new Book(); // Book 4 as Default Constructor

        // Display Book Info
        System.out.println("--- INITIAL BOOK LIST ---");
        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();
        book4.displayBookInfo();

        // Testing Borrowing and Returning
        System.out.println("\n--- TESTING INVENTORY ---");
        System.out.println("Borrowing Book 1...");
        book1.borrowBook(); // Should succeed
        System.out.println("Copies remaining: " + book1.getAvailableCopies());
        System.out.println("Returning Book 1...");
        book1.returnBook(); // Should increase count
        System.out.println("Copies remaining: " + book1.getAvailableCopies());
        System.out.println("Attempting to borrow Book 4:");
        book4.borrowBook(); // This should trigger "No Available Copies"

        // Testing Discounts
        System.out.println("\n--- TESTING DISCOUNT ---");
        System.out.print("Applying 20% discount to Book 2. ");
        book2.applyDiscount(20);
        System.out.printf("New Price: $%.2f%n", book2.getPrice());

        // Testing Validations
        System.out.println("\n--- TESTING VALIDATION ---");
        // Negative Price test
        System.out.print("Attempting to set Book 1 price to -$10: ");
        book1.setPrice(-10.0); // Should trigger "PRICE ERROR"
        // Borrowing when no copies available
        System.out.println("Attempting to borrow Book 3:");
        book3.borrowBook(); // Should trigger "No Available Copies"
        // Invalid discount test
        System.out.print("Attempting 90% discount on Book 1: ");
        book1.applyDiscount(90); // Should trigger "Invalid Discount"

        // Using getters to retrieve and display specific information
        System.out.println("\n--- GETTERS CHECK ---");
        System.out.println("Book 2 Title: " + book2.getTitle());
        System.out.println("Book 2 Current Stock: " + book2.getAvailableCopies());
        System.out.println("Book 4 Author: " + book4.getAuthor());
    }
}