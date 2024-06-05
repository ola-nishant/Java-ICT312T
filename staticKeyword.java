class test{
    //static variable
    private static int counter;
    test(){
        counter++;
    }
    //static method
    static void printCounter(){
        System.out.println(counter);
    }
    //static block
    static{
        counter = 0;
    }
}
public class staticKeyword {
    public static void main(String args[]){
        test.printCounter();
        new test();
        new test();
        test.printCounter();
    }
}