public class ConstructorChaining {
    
}
//consistency
//correct initialization
//code reusalibility
// class Example {
//     private int x;
//     private int y;

//     // Default constructor
//     Example() {
//         this(10, 20); // Calls the parameterized constructor
//         System.out.println("Default constructor called");
//     }

//     // Parameterized constructor
//     Example(int x, int y) {
//         this.x = x;
//         this.y = y;
//         System.out.println("Parameterized constructor called: x = " + x + ", y = " + y);
//     }

//     void display() {
//         System.out.println("x: " + x + ", y: " + y);
//     }

//     public static void main(String[] args) {
//         Example obj = new Example();
//         obj.display();
//     }
// }
// class GrandParent {
//     GrandParent() {
//         System.out.println("GrandParent constructor called");
//     }
// }

// class Parent extends GrandParent {
//     Parent() {
//         super(); // Calls the GrandParent constructor
//         System.out.println("Parent constructor called");
//     }
// }

// class Child extends Parent {
//     Child() {
//         super(); // Calls the Parent constructor
//         System.out.println("Child constructor called");
//     }

//     public static void main(String[] args) {
//         Child child = new Child();
//     }
// }
