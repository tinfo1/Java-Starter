package lab16_OOP.Overriding;

public class main_Animal {
    public static void main(String[] args) {
        System.out.println("Creating a Dog:");
        Dog d = new Dog();
        d.makeSound();
        d.eat();
        d.sleep();
        System.out.println("------------------------------");
        System.out.println("Creating a Cat:");
        Cat c = new Cat();
        c.makeSound();
        c.eat();
        c.sleep();
        System.out.println("------------------------------");
        System.out.println("Creating a Bird:");
        Bird b = new Bird();
        b.makeSound();
        b.eat();
        b.sleep();
    }
}
