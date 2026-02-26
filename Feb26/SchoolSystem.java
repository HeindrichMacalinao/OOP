package studentinformationsystem;
public class SchoolSystem {
    public static void main(String[] args) {
        // Create a student
        Student student1 = new Student("Alice", 20, 3.5);

        // Display initial info
        System.out.println("=== Student Information ===");
        student1.displayInfo();

        // Update GPA using setter
        System.out.println("\n=== Updating GPA===");
        student1.setGpa(3.8);
        System.out.println("New GPA: " + student1.getGpa());

        // Try invalid values
        System.out.println("\n=== Testing Validation ===");
        student1.setAge(5);     // Too young
        student1.setGpa(5.5);   // GPA too high
        student1.setName("");   // Empty name

        // Show that invalid changes were rejected
        System.out.println("\n=== Final Information ===");
        student1.displayInfo(); // Data remains unchanged
    }
}
