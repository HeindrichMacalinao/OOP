package abstractandinterface;

public abstract class Shape {
    protected String color;
    protected double area;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method - no implementation
    public abstract double calculateArea();

    // Concrete method - has implementation
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea() + "\n");
    }

    public String getColor() {
        return color;
    }
}
