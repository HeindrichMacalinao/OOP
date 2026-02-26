public class Product {
    // Private attributes
    private String productName;
    private double price;
    private int stock;

    // Constructor
    public Product(String productName, double price, int stock) {
        this.productName = productName;
        setPrice(price); // Use setter
        setStock(stock); // Use setter
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setters with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price must be positive!");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: Stock cannot be negative!");
        }
    }

    // Business methods
    public void sell(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock = stock - quantity;
            System.out.println("Sold " + quantity + " " + productName);
            System.out.println("Stock remaining: " + stock);
        } else {
            System.out.println("Error: Not enough stock!");
        }
    }

    public void restock(int amount) {
        if (amount > 0) {
            this.stock = this.stock + amount; // Or: stock += amount;
            System.out.println("Restocked " + amount + " Gaming Laptop");
            System.out.println("New stock: " + stock);
        } else {
            System.out.println("Error: Restock amount must be positive!");
        }
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 50) {
            double discount = price * (percentage / 100);
            price = price - discount;
            System.out.println(percentage + "% discount applied!");
            System.out.println("New price: $" + price);
        } else {
            System.out.println("Error: Invalid discount percentage!");
        }
    }
}