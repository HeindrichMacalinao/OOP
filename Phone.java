public class Phone {

    String brand;
    String model;
    int batteryPercent;

    void call() {
        System.out.println("Calling...");
    }

    void sendText() {
        System.out.println("Sending text message...");
        System.out.println();
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery: " + batteryPercent + "%");
    }
}
