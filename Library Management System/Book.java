public class Book {
    // Private Attributes
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private double price;
    private int availableCopies;

    public Book() {
        // Default Constructor
        this.isbn = "Unknown";
        this.title = "Unknown";
        this.author = "Unknown";
        this.publicationYear = 1;
        this.price = 0.0;
        this.availableCopies = 0;
    }

    // Parameterized Constructor
    public Book(String isbn, String title, String author, int publicationYear, double price, int availableCopies) {
        setIsbn(isbn);
        setTitle(title);
        setAuthor(author);
        setPublicationYear(publicationYear);
        setPrice(price);
        setAvailableCopies(availableCopies);
    }

    // Getter Methods
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    // Setter Methods with Validation
    public void setIsbn (String isbn) {
        if (isbn != null && !isbn.isEmpty()) {
            this.isbn = isbn;
        } else {
            System.out.println("ISBN CANNOT BE EMPTY");
        }
    }

    public void setTitle (String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("TITLE CANNOT BE EMPTY");
        }
    }

    public void setAuthor (String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("AUTHOR CANNOT BE EMPTY");
        }
    }

    public void setPublicationYear (int publicationYear) {
        if (publicationYear >= 1 && publicationYear <= 2026) {
            this.publicationYear = publicationYear;
        } else {
            System.out.println("YEAR ERROR");
        }
    }

    public void setPrice (double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("PRICE ERROR");
        }
    }

    public void setAvailableCopies (int availableCopies) {
        if (availableCopies >= 0) {
            this.availableCopies = availableCopies;
        } else {
            System.out.println("STOCK ERROR");
        }
    }

    // Additional Methods
    public void borrowBook() {
        if (availableCopies >= 1) {
            availableCopies = availableCopies - 1;
            System.out.println("Succesfully Borrowed");
        } else {
            System.out.println("No Available Copies");
        }
    }

    public void returnBook() {
        availableCopies = availableCopies + 1;
        System.out.println("Succesfully Returned");
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 50) {
            price -= (price * percentage / 100);
            System.out.println("Discount applied");
        } else {
            System.out.println("Invalid Discount");
        }
    }

    public void displayBookInfo() {
        System.out.println("Book Details:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + publicationYear);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Available Copies: " + availableCopies);
        System.out.println();
    }
}
