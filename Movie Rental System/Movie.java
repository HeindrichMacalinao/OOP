package moviesystem;

public class Movie {
    // Private attributes
    private String title;
    private String director;
    private int releaseYear;
    private double rentalPrice;
    private int availableCopies;

    // Constructor
    public Movie(String title, String director, int releaseYear, double rentalPrice, int availableCopies) {
        setTitle(title); // Use setter
        setDirector(director); // Use setter
        setReleaseYear(releaseYear); // Use setter
        setRentalPrice(rentalPrice); // Use setter
        setAvailableCopies(availableCopies); // Use setter
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    // Setters with validation
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }

    public void setDirector(String director) {
        if (director != null && !director.isEmpty()) {
            this.director = director;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }

    public void setReleaseYear(int releaseYear) {
        if(releaseYear >= 1900 && releaseYear <= 2024) {
            this.releaseYear = releaseYear;
        } else {
            System.out.println("Error: Year must be between 1900 and 2024!");
        }
    }

    public void setRentalPrice(double rentalPrice) {
        if(rentalPrice >= 1.0 && rentalPrice <= 10.0) {
            this.rentalPrice = rentalPrice;
        } else {
            System.out.println("Error: Price must be between 1.0 and 10.0!");
        }
    }

    public void setAvailableCopies(int availableCopies) {
        if(availableCopies >= 0) {
            this.availableCopies = availableCopies;
        } else {
            System.out.println("Error: Copies cannot be negative!");
        }
    }

    // Additional Methods
    public void rentMovie() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Success: You rented '" + title + "'.");
            System.out.println("Copies remaining: " + availableCopies);
        } else {
            System.out.println("Error: '" + title + "' is currently out of stock!");
        }
    }

    public void returnMovie() {
        availableCopies++;
        System.out.println("Success: '" + title + "' has been returned.");
        System.out.println("New total copies: " + availableCopies);
    }

    public void displayInfo() {
        System.out.println("\n========= MOVIE INFO =========");
        System.out.println("Title:          " + title);
        System.out.println("Director:       " + director);
        System.out.println("Release Year:   " + releaseYear);
        System.out.printf("Rental Price:   $%.2f%n", rentalPrice); // Formats to 2 decimal places
        System.out.println("Available:      " + availableCopies + " units");
        System.out.println("==============================");
    }
}
