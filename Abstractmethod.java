
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Zzz");
    }
}
// Subclassing an Abstract Class
public class Dog extends Animal {
    // Providing implementation of the abstract method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
public class Abstractmethod {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();  
        myDog.sleep();   
    }
}




