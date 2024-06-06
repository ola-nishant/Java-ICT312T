import java.util.ArrayList;
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
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}
public class upcastingDowncasting {
    public static void main(String[] args){
        Animal myAnimal = new Dog(); //upcasting
        myAnimal.sound(); 
        if(myAnimal instanceof Dog){
            Dog myDog = (Dog) myAnimal; //downcasting
            myDog.sound();
        }
        ArrayList<Animal>animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        for(Animal animal:animals){
            animal.sound();
        }
    }
}
