public class BookStoreMain {
    public static void main(String[] args) {
        // Creating Book objects (instances of the Book class)
        Book book1 = new Book("Java Programming", "James Gosling", "978-0134685991", 45.99, 10);
        Book book2 = new Book("My First In Java", "Jeremias Esperanza", "978-1312122246", 11.51, 20);
        Book book3 = new Book("Violet Bent Backwards Over the Grass", "Lana Del Rey", "978-1982167288", 25.70, 5);

        // Displaying and Manage Book 1
        System.out.println("=== Book 1 Information ===");
        book1.displayBookInfo();
        book1.sellBook(1);
        book1.restockBook(5);

        // Displaying and Manage Book 2
        System.out.println("=== Book 2 Information ===");
        book2.displayBookInfo();
        book2.sellBook(15);
        book2.restockBook(10);

        // Displaying and Manage Book 3
        System.out.println("=== Book 3 Information ===");
        book3.displayBookInfo();
        book3.sellBook(6);
        book3.restockBook(1);
    }
}
