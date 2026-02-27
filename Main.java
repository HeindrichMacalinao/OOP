public class Main {
    public static void main(String[] args) {
        // Create a car
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.color = "Red";
        myCar.year = 2020;

        // Call methods
        myCar.displayInfo();
        myCar.start();
        myCar.honk();
    }
}