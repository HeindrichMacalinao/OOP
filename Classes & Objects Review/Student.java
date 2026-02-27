public class Student {
    // Attributes (Instance Variables)
    private String name;
    private int studentId;
    private String major;
    private double gpa;

    // Constructor
    public Student(String name, int studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.gpa = 0.0;
    }

    // Getter Methods
    public String getname() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    // Setter Methods
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}