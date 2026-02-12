public class Car {
    // Attributes (variables)
    String brand;
    String color;
    int year;

    // Method to start the car
    void start () {
        System.out.println("The " + brand + " is starting...");
    }

    // Method to honk
    void honk() {
        System.out.println("Beep beep!");
    }

    // Method to display info
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}
