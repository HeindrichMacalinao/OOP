package moviesystem;

public class RentalStore {
    public static void main(String[] args) {
        // 1. Create 2 Movie objects
        Movie movie1 = new Movie("Jennifer's Body", "Karyn Kusama", 2009, 5.0, 2);
        Movie movie2 = new Movie("Mean Girls", "Mark Waters", 2004, 3.5, 1);

        // 2. Display information for each movie
        System.out.println("--- Initial Inventory ---");
        movie1.displayInfo();
        movie2.displayInfo();

        // 3. Rent out a movie (Success and then Failure)
        System.out.println("\n--- Testing Rental System ---");
        movie2.rentMovie(); // Successfully rents the last copy
        movie2.rentMovie(); // Should show an Error: Out of stock

        // 4. Return a movie
        System.out.println("\n--- Testing Return System ---");
        movie2.returnMovie(); // Stock goes back to 1

        // 5. Test Validation (Trying to set invalid values)
        System.out.println("\n--- Testing Data Protection (Validation) ---");

        System.out.println("Attempting to set Year to 1800...");
        movie1.setReleaseYear(1800); // Should trigger error (Range: 1900-2024)

        System.out.println("Attempting to set Price to $50.0...");
        movie1.setRentalPrice(50.0); // Should trigger error (Range: 1.0-10.0)

        System.out.println("Attempting to set Copies to -5...");
        movie1.setAvailableCopies(-5); // Should trigger error (Must be >= 0)

        // 6. Show that validation prevented changes
        System.out.println("\n--- Final Check (Data should remain unchanged) ---");
        movie1.displayInfo();
    }
}
