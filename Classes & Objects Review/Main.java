public class Main {
    public static void main(String[] args) {
        // Creating objects (instances) of Student class
        Student student1 = new Student("Alice Johnson", 12345, "Computer Science");
        Student student2 = new Student("Bob Smith", 12346, "Engineering");

        // Setting GPA values
        student1.setGpa(3.8);
        student2.setGpa(3.5);

        // Displaying student information
        System.out.println("=== Student 1 Information ===");
        student1.displayInfo();
        System.out.println("=== Student 2 Information ===");
        student2.displayInfo();
    }
}