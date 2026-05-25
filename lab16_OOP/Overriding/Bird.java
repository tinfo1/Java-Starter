package lab16_OOP.Overriding;

public class Bird extends Animal {
    public Bird() {
        super("Bird");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: Moo!");
    }
    @Override
    public void eat() {
        System.out.println(name + " is eating grass.");
    }
    
}
