class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();
    }
}
