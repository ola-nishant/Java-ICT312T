interface Animal {
    void sound(); // Abstract method

    default void eat() { // Default method
        System.out.println("This animal eats food.");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // Optionally, the Dog class can override the default method
    @Override
    public void eat() {
        System.out.println("Dog eats kibble.");
    }
}

public class defaultMethod {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Outputs: Dog barks
        myDog.eat();   // Outputs: Dog eats kibble.
    }
}
//backward compatibility
//reusability
//loose coupling