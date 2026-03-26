public class Professor extends Teacher {
    private String researchArea;
    private int publications;

    public Professor(String name, int age, String address, String teacherId, String subject, int yearsOfExperience,
                     String researchArea, int publications) {
        super(name, age, address, teacherId, subject, yearsOfExperience);
        this.researchArea = researchArea;
        this.publications = publications;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Area: " + researchArea);
        System.out.println("Publications: " + publications);
        System.out.println();
    }

    @Override
    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }

    public void conductResearch() {
        System.out.println(name + " is conducting research in  " + researchArea);
    }
    public void publishPaper() {
        publications ++;
        System.out.println("New paper published! Total publications: " + publications);
    }
}
