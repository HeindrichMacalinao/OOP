public class Calculator {

    // Method 1: Add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }

    // Method 2: Add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }

    // Method 3: Add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }

    // Method 4: Add two strings (concatenation)
    public String add(String a, String b) {
        System.out.println("Concatenating two strings");
        return a + b;
    }
}
