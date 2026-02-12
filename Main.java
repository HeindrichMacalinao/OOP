public class Main {
    public static void main(String[] args) {
        // Create phone 1
        Phone myPhone1 = new Phone();
        myPhone1.brand = "Samsung";
        myPhone1.model = "Galaxy S23";
        myPhone1.batteryPercent = 85;

        // Create phone 2
        Phone myPhone2 = new Phone();
        myPhone2.brand = "Apple";
        myPhone2.model = "iPhone 17";
        myPhone2.batteryPercent = 99;

        // Call methods for phone 1
        myPhone1.displayInfo();
        myPhone1.call();
        myPhone1.sendText();

        // Call methods for phone 2
        myPhone2.displayInfo();
        myPhone2.call();
        myPhone2.sendText();

    }
}