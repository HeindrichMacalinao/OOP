package abstractandinterface;

public class Circle extends Shape {
    private double radius;

    public Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // MUST implement abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
