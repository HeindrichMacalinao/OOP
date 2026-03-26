public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Smith", 45, "123 University Ave",
                "T1001", "Advanced Computer Science", 15,
                "Artificial Intelligence", 25);

        System.out.println("=== Person Information ===");
        prof.introduce();
        prof.displayInfo();
        prof.teach();
        prof.conductResearch();
        prof.publishPaper();
    }
}
