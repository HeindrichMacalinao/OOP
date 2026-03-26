public class Person {
    // TODO: Declare protected attributes
    protected String name;
    protected int age;
    protected String address;

    // TODO: Create constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // TODO: Implement displayInfo()
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // TODO: Implement introduce()
    public void introduce() {
        System.out.println("Hello, my name is " + name);
        System.out.println();
    }
}
