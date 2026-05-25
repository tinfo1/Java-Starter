package lab16_OOP.Overriding;

public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override 
   
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating cat food.");
    }
}
