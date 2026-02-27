public class StoreSystem {
    public static void main(String[] args) {
        // Create a product
        Product laptop = new Product("Gaming Laptop", 1200.00, 10);

        // Display info using getters
        System.out.println("Product: " + laptop.getProductName());
        System.out.println("Price: $" + laptop.getPrice());
        System.out.println("Stock: " + laptop.getStock());

        // Sell some items
        System.out.println("\n--- Selling 3 laptops ---");
        laptop.sell(3);

        // Apply discount
        System.out.println("\n--- Applying 10% discount ---");
        laptop.applyDiscount(10);

        // Restock
        System.out.println("\n--- Restocking 5 laptops ---");
        laptop.restock(5);

        // Try to sell more than available
        System.out.println("\n--- Trying to sell 20 laptops ---");
        laptop.sell(20);
    }
}