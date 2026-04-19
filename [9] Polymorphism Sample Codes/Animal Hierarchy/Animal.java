public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a generic animal sound");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}
