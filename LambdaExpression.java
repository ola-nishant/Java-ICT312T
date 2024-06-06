@FunctionalInterface
interface A {
    void run();
}
@FunctionalInterface
interface B {
    int add(int a, int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        // Using Lambdas to implement anonymous class
        A obj = () -> System.out.println("Running");
        obj.run();
        B obj2 = (a, b) -> a+b;
        System.out.println(obj2.add(3, 4));
        // Using as a single use method
        
    }
}
