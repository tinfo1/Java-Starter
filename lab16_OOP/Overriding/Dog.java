package lab16_OOP.Overriding;

public class Dog  extends Animal {
    public Dog() {
        super("dog");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
    @Override
    public void eat() {
        System.out.println(name + " is eating dog skeleton.");
    }
}
