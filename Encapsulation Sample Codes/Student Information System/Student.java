public class Student {
    // Private attributes - hidden from outside
    private String name;
    private int age;
    private double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        setAge(age); // Use setter for validation
        setGpa(gpa); // Use setter for validation
    }

    // Getters - Let people READ the data
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters - Let people CHANGE the data (with validation!)
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            // Valid student age
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 16 and 100!");
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) { // Valid GPA range
            this.gpa = gpa;
        } else {
            System.out.println("Error: GPA must be between 0.0 and 4.0!");
        }
    }

    // Helper method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}