public class Book {
    // Private Attributes
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int availableCopies;

    // Constructor
    public Book(String title, String author, String isbn, double price, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.availableCopies = availableCopies;
    }

    // Getter
    public String getTitle () {
        return title;
    }

    public String getAuthor () {
        return author;
    }

    public String getIsbn () {
        return isbn;
    }

    public double getPrice () {
        return price;
    }

    public int getAvailableCopies () {
        return availableCopies;
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
        System.out.println("Available Copies: " + availableCopies);
        System.out.println();
    }

    // Method to sell books (reduces available copies if enough stock)
    public void sellBook(int amount) {
        // Check if enough copies are available
        if (availableCopies >= amount) {
            availableCopies -= amount;
            System.out.println("Selling " + amount + " copy of '" + title +"'...");
            System.out.println("Sale successful! Remaining copies: " + availableCopies);
            System.out.println();
            } else {
            // If not enough stock
            System.out.println("Selling " + amount + " copy of '" + title +"'...");
            System.out.println("No Copies Available");
            System.out.println();
        }
    }

    // Method to restock books (adds copies to inventory)
    public void restockBook(int quantity) {
            System.out.println("Restocking '" + title + "' with " + quantity + " copies...");
            availableCopies += quantity;
            System.out.println("Restock successful! Available copies: " + availableCopies);
            System.out.println();
        }
    }