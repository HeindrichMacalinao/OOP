public class Main {
    public static void main(String[] args) {
        // Polymorphic references - parent type, child objects
        Animal animal1 = new Dog("Buddy");
        Animal animal2 = new Cat("Whiskers");
        Animal animal3 = new Bird("Tweety");

        // Same method call, different behaviors!
        animal1.makeSound(); // Calls Dog's makeSound(0
        animal2.makeSound(); // Calls Cat's makeSound(0
        animal3.makeSound(); // Calls Bird's makeSound(0

        System.out.println();

        // Array of Animals - demonstrating polymorphism
        Animal[] animals = {animal1, animal2, animal3};

        System.out.println("=== All animals making sounds ===");
        for(Animal animal : animals) {
            animal.makeSound(); // Polymorphic call
        }
    }
}
